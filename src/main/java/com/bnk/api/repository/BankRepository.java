package com.bnk.api.repository;

import org.springframework.stereotype.Repository;

import com.bnk.api.model.Bank;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface BankRepository extends JpaRepository<Bank, Long>{

}
