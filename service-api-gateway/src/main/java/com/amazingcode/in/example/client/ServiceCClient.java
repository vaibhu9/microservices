package com.amazingcode.in.example.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-c")
public interface ServiceCClient {
    @GetMapping("/api/service-c")
    String getServiceCMessage();
}
