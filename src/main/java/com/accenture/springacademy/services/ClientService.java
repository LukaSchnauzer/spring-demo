package com.accenture.springacademy.services;

import com.accenture.springacademy.dto.ClientDto;
import com.accenture.springacademy.entity.ClientEntity;
import com.accenture.springacademy.mapper.ClientMapper;
import com.accenture.springacademy.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<ClientDto> getAllClients(){
        List<ClientEntity> clientEntities = clientRepository.findAll();
        List<ClientDto> clients = ClientMapper.mapListOfClientFromClientToDto(clientEntities);
        return clients;
    }

    public ClientDto getById(String id){
        Optional<ClientEntity> clientEntity = clientRepository.findById(id);
        if(clientEntity.isPresent()){
            ClientDto clientDto = ClientMapper.mapClientFromEntitytoDto(clientEntity.get());
            return clientDto;
        }

        return null;
    }

    public ClientDto getByName(String firstName){
        ClientEntity clientEntity = clientRepository.findClientByFirstName(firstName);
        ClientDto clientDto = ClientMapper.mapClientFromEntitytoDto(clientEntity);
        return clientDto;
    }

    public void createClient(ClientDto clientDto){
        if(validateClientDto(clientDto)){
            ClientEntity clientEntity = ClientMapper.mapClientFromDtoToEntity(clientDto);
            clientRepository.save(clientEntity);
        }
    }

    private boolean validateClientDto(ClientDto clientDto){
        return (clientDto.getClientId() != null && !clientDto.getClientId().isEmpty()) &&
                (clientDto.getFirstName() != null && !clientDto.getFirstName().isEmpty()) &&
                (clientDto.getLastName() != null && !clientDto.getLastName().isEmpty()) &&
                (clientDto.getEmail() != null && !clientDto.getEmail().isEmpty());
    }

}
