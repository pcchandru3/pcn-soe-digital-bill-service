package com.pcn.billing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/gw/billing/nextgen/bill")
public class BillingController {
    
    
    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello from Spring Boot Microservice from Google Could !!!";
    }

    @GetMapping("/overview")
    public String overview() {
        return "This is bill overview";
    }

}
