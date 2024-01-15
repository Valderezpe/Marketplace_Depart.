package com.valderez.br.marketplace_lojas.repositories;

import com.valderez.br.marketplace_lojas.domain.category.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String> {
}
