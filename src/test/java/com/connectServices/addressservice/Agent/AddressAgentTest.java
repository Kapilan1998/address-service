package com.connectServices.addressservice.Agent;

import com.connectServices.addressservice.Dto.AddressResponseDto;
import com.connectServices.addressservice.Service.AddressService;
import com.connectServices.addressservice.controller.AddressController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class AddressAgentTest {
    @InjectMocks
    AddressAgent addressAgent;

    @Mock
    AddressService addressService;
    @Test
    void getAddressByEmployeeId() {
        int id =2;
        Mockito.when(addressService.getAddressByEmployeeId(id)).thenReturn(new AddressResponseDto());
    addressAgent.getAddressByEmployeeId(id);
    }
}