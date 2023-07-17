package com.example.HWOnlineStore.controller;

import com.example.HWOnlineStore.model.Basket;
import com.example.HWOnlineStore.model.Client;
import com.example.HWOnlineStore.service.ClientsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clients")
public class ClientsController {

    @Autowired
    ClientsService clientsService;

    @GetMapping
    public List<Client> getAllClients() {
        return clientsService.getAllClients();
    }

    @GetMapping("/{id}")
    public Client getclientsById(@PathVariable(name = "id") int id) {
        return clientsService.getClientById(id);
    }

    @PostMapping
    public Client newClient(@RequestBody Client client) {
        return clientsService.newClient(client);
    }

    @PostMapping("/{id}")
    public Client addToBasket(@PathVariable(name = "id") int id, @RequestBody Basket basket) {
        return clientsService.addToBasket(id, basket);
    }
}
