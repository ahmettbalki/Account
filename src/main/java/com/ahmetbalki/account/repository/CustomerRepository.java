package com.ahmetbalki.account.repository;

import com.ahmetbalki.account.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
