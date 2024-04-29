package com.connectServices.addressservice.Service;

import com.connectServices.addressservice.Converter.AddressConverter;
import com.connectServices.addressservice.Dto.AddressResponseDto;
import com.connectServices.addressservice.Entity.Address;
import com.connectServices.addressservice.Exception.ServiceException;
import com.connectServices.addressservice.Repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class AddressService {

    private final AddressRepository addressRepository;
    private final ModelMapper modelMapper;
    public static final String BAD_REQUEST = "Bad request";
    private final AddressConverter addressConverter;

    public AddressResponseDto getAddressByEmployeeId(int id) {
        Address address = addressRepository.findAddressByEmployeeId(id);
        AddressResponseDto addressResponseDto = null;
        if (address != null) {
            log.info("address details {}", address);
            addressResponseDto = modelMapper.map(address, AddressResponseDto.class);
//            addressResponseDto =addressConverter.convertToDto(address);
        } else {
            throw new ServiceException("Address id not found", BAD_REQUEST, HttpStatus.BAD_REQUEST);
        }
        return addressResponseDto;
    }

}
