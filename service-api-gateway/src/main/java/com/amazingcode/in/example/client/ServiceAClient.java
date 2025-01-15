package com.amazingcode.in.example.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-a")
public interface ServiceAClient {
    @GetMapping("/api/service-a")
    String getServiceAMessage();
}
