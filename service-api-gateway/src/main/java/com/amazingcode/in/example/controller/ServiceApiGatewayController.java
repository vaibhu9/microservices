package com.amazingcode.in.example.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazingcode.in.example.client.ServiceAClient;
import com.amazingcode.in.example.client.ServiceBClient;
import com.amazingcode.in.example.client.ServiceCClient;
import com.amazingcode.in.example.client.ServiceDClient;

@RestController
@RequestMapping("/api/service-api-gateway")
public class ServiceApiGatewayController {

	private final ServiceAClient serviceAClient;
    private final ServiceBClient serviceBClient;
    private final ServiceCClient serviceCClient;
    private final ServiceDClient serviceDClient;

    public ServiceApiGatewayController(ServiceAClient serviceAClient, ServiceBClient serviceBClient, 
                                ServiceCClient serviceCClient, ServiceDClient serviceDClient) {
        this.serviceAClient = serviceAClient;
        this.serviceBClient = serviceBClient;
        this.serviceCClient = serviceCClient;
        this.serviceDClient = serviceDClient;
    }

    @GetMapping("/fetch-all")
    public ResponseEntity<Map<String, String>> fetchAllServices() {
        Map<String, String> response = new LinkedHashMap<String, String>();
        response.put("serviceA", serviceAClient.getServiceAMessage());
        response.put("serviceB", serviceBClient.getServiceBMessage());
        response.put("serviceC", serviceCClient.getServiceCMessage());
        response.put("serviceD", serviceDClient.getServiceDMessage());
        return ResponseEntity.ok(response);
    }
}
