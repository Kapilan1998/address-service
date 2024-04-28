package com.connectServices.addressservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class AddressController {

@GetMapping("/view-address")
    public String getAddress(){
    return "857/5 Palali Road,Jaffna";
}

}
