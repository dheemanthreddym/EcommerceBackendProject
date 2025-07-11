package edu.hitam.ecommerce.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import edu.hitam.ecommerce.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String>
{

}