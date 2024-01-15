package com.valderez.br.marketplace_lojas.repositories;

import com.valderez.br.marketplace_lojas.domain.product.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepositories extends MongoRepository<Product, String> {
}
