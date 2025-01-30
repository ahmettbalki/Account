package com.ahmetbalki.account.repository;

import com.ahmetbalki.account.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {

}
