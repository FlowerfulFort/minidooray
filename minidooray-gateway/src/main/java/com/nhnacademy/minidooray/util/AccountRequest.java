package com.nhnacademy.minidooray.util;

import com.nhnacademy.minidooray.model.rest.project.AccountResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "gateway-router")
public interface AccountRequest {
    @GetMapping("/api/accounts/{accountId}")
    AccountResponse getAccount(@PathVariable String accountId);
}
