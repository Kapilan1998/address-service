package com.connectServices.addressservice.controller;

import com.connectServices.addressservice.Agent.AddressAgent;
import com.connectServices.addressservice.Dto.AddressResponseDto;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class AddressControllerTest {
@InjectMocks
AddressController addressController;

@Mock
AddressAgent addressAgent;
    @Test
    void getAddress() {
       String address = addressController.getAddress();
       assertEquals("857/5 Palali Road,Jaffna",address);
       assertNotNull(address);
    }

    @Test
    void getAddressByEmployeeId() {
        int id =4;
        AddressResponseDto addressResponseDto = new AddressResponseDto();
        Mockito.when(addressAgent.getAddressByEmployeeId(id)).thenReturn(addressResponseDto);
        addressController.getAddressByEmployeeId(id);
    }
}