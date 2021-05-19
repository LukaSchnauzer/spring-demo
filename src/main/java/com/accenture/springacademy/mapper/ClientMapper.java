package com.accenture.springacademy.mapper;

import com.accenture.springacademy.dto.ClientDto;
import com.accenture.springacademy.dto.ProductDto;
import com.accenture.springacademy.entity.ClientEntity;
import com.accenture.springacademy.entity.ProductEntity;

import java.util.List;
import java.util.stream.Collectors;

public class ClientMapper {

    public static final ClientDto mapClientFromEntitytoDto(ClientEntity entity){
        ClientDto clientDto = new ClientDto();
        clientDto.setClientId(entity.getClientId());
        clientDto.setEmail(entity.getEmail());
        clientDto.setFirstName(entity.getFirstName());
        clientDto.setLastName(entity.getLastName());

        return clientDto;
    }

    public static final ClientEntity mapClientFromDtoToEntity(ClientDto clientDto){
        ClientEntity entity = new ClientEntity();
        entity.setClientId(clientDto.getClientId());
        entity.setEmail(clientDto.getEmail());
        entity.setFirstName(clientDto.getFirstName());
        entity.setLastName(clientDto.getLastName());
        return entity;
    }

    public static final List<ClientDto> mapListOfClientFromClientToDto(List<ClientEntity> entityList) {
        List<ClientDto> dtoList = entityList.stream().map(entity -> {
            return mapClientFromEntitytoDto(entity);
        }).collect(Collectors.toList());

        return dtoList;
    }
}
