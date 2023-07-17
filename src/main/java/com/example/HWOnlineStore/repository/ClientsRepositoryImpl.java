package com.example.HWOnlineStore.repository;

import com.example.HWOnlineStore.model.Basket;
import com.example.HWOnlineStore.model.Client;
import com.example.HWOnlineStore.model.Good;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.*;

@Repository
public class ClientsRepositoryImpl implements ClientsRepository {

    private Map<Integer, Client> clientsMap = new HashMap<>();


    @PostConstruct
    public void init() {
        clientsMap.put(1, new Client(1, "Helmut", "Schultz", "Haren", null));
        clientsMap.put(2, new Client(2, "Margaret", "Wecker", "Meppen", null));
        clientsMap.put(3, new Client(3, "Udoh", "Muller", "Emmeln", null));
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

    @Override
    public Client addToBasket(int id, Basket basket) {
        GoodsRepositoryImpl goodsRepository = new GoodsRepositoryImpl();
        goodsRepository.init();
        Good goodsToBasket = goodsRepository.getGoodsMap().get(basket.getGoodsId());
        basket.setGoodsName(goodsToBasket.getGoodsName());
        basket.setCost(basket.getQuantity() * goodsToBasket.getPrice());
        Client client = clientsMap.get(id);
        client.setBasket(basket);
        clientsMap.put(id, client);
        return client;
    }
}
