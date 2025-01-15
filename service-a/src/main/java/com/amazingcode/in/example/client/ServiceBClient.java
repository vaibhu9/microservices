package com.amazingcode.in.example.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-b")
public interface ServiceBClient {
    @GetMapping("/api/service-b")
    String getServiceBData();
}
