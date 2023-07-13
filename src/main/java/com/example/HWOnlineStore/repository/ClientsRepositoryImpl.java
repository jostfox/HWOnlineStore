package com.example.HWOnlineStore.repository;

import com.example.HWOnlineStore.model.Client;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ClientsRepositoryImpl implements ClientsRepository {

    private Map <Integer, Client> clientsMap = new HashMap<>();

    @PostConstruct
    public void init() {
        clientsMap.put(1, new Client(1, "Helmut", "Schultz", "Haren"));
        clientsMap.put(2, new Client(2, "Margaret", "Wecker", "Meppen"));
        clientsMap.put(3, new Client(3, "Udoh", "Muller", "Emmeln"));
    }

    @Override
    public List<Client> getAllClients() {
        return new ArrayList<>(clientsMap.values());
    }

    @Override
    public Client getClientById(int id) {
        return clientsMap.get(id);
    }

    @Override
    public Client newClient(Client client) {
        int lastId = clientsMap.keySet().stream().mapToInt(s -> s).max().getAsInt();
        client.setId(lastId + 1);
        clientsMap.put(client.getId(), client);
        return client;
    }
}
