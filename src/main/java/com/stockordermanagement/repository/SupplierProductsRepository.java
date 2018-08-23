package com.stockordermanagement.repository;

import com.stockordermanagement.dto.SupplierProducts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierProductsRepository extends JpaRepository<SupplierProducts,String> {
}
