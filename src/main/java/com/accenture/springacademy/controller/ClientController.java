package com.accenture.springacademy.controller;

import com.accenture.springacademy.dto.ClientDto;
import com.accenture.springacademy.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/API/v1/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping(value = "/")
    public List<ClientDto> getAllClients(){
        return clientService.getAllClients();
    }

    @GetMapping(value = "/{id}")
    public ClientDto getClientById(@PathVariable String id){
        return clientService.getById(id);
    }

    @GetMapping(value = "/name/{firstName}")
    public ClientDto getClientByFirstName(@PathVariable String firstName){
        return clientService.getByName(firstName);
    }

    @PostMapping(value = "/",
                consumes = MediaType.APPLICATION_JSON_VALUE)
    public HttpEntity<String> createClient(@RequestBody ClientDto client){
        HttpEntity<String> response = new HttpEntity<>("Success");
        clientService.createClient(client);
        return response;
    }
}
