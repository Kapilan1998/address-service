package com.connectServices.addressservice.Converter;

import com.connectServices.addressservice.Dto.AddressResponseDto;
import com.connectServices.addressservice.Entity.Address;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class AddressConverter {

    public AddressResponseDto convertToDto(Address address){
        AddressResponseDto addressResponseDto = new AddressResponseDto();
        addressResponseDto.setId(address.getId());
        addressResponseDto.setFirstLane(address.getFirstLane());
        addressResponseDto.setLastLane(address.getLastLane());
        addressResponseDto.setZip(address.getZip());
        addressResponseDto.setState(address.getState());
        return addressResponseDto;
    }
}
