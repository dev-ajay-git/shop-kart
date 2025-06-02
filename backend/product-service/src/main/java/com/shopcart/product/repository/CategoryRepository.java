package com.shopcart.product.repository;

import com.shopcart.product.model.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String> {
    // You can add custom query methods if needed
}
