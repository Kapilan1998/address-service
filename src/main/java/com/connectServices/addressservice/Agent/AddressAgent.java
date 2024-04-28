package com.connectServices.addressservice.Agent;

import com.connectServices.addressservice.Dto.AddressResponseDto;
import com.connectServices.addressservice.Service.AddressService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class AddressAgent {
    private final AddressService addressService;


    public AddressResponseDto getAddressByEmployeeId(int id) {
        return addressService.getAddressByEmployeeId(id);
    }
}
