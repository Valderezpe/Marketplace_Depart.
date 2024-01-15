package com.valderez.br.marketplace_lojas.repositories;

import com.valderez.br.marketplace_lojas.domain.client.Clients;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientRepository extends MongoRepository<Clients, String> {
}
