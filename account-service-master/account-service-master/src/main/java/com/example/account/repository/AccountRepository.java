package com.example.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.account.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
