package com.stockordermanagement.repository;

import com.stockordermanagement.dto.Suppliers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Suppliers,String> {
}
