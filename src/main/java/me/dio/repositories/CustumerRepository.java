package me.dio.repositories;

import me.dio.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustumerRepository extends JpaRepository<Customer, Integer> {
}
