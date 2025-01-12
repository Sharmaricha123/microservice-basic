package com.richa.ecommerce.inventory.repository;


import com.richa.ecommerce.inventory.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
