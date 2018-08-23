package com.stockordermanagement.repository;

import com.stockordermanagement.dto.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Products,String> {
}
