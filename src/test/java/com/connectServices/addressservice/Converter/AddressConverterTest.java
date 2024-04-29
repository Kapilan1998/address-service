package com.connectServices.addressservice.Converter;

import com.connectServices.addressservice.Entity.Address;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class AddressConverterTest {

    @InjectMocks
    AddressConverter addressConverter;
    @Test
    void convertToDto() {
        Address address = new Address();
        address.setFirstLane("kkk");
        addressConverter.convertToDto(address);
    }
}