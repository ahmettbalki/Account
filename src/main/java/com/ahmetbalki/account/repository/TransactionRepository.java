package com.ahmetbalki.account.repository;

import com.ahmetbalki.account.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
}
