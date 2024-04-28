package com.connectServices.addressservice.controller;

import com.connectServices.addressservice.Agent.AddressAgent;
import com.connectServices.addressservice.Dto.AddressResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class AddressController {
    private final AddressAgent addressAgent;

    @GetMapping("/view-address")
    public String getAddress() {
        return "857/5 Palali Road,Jaffna";
    }

    @GetMapping("/get-address/{empId}")
    public ResponseEntity<AddressResponseDto> getAddressByEmployeeId(@PathVariable("empId") int id) {
        AddressResponseDto addressResponseDto = addressAgent.getAddressByEmployeeId(id);
        return ResponseEntity.status(HttpStatus.OK).body(addressResponseDto);
    }
}
