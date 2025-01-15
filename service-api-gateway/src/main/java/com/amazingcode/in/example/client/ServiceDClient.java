package com.amazingcode.in.example.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-d")
public interface ServiceDClient {
    @GetMapping("/api/service-d")
    String getServiceDMessage();
}
