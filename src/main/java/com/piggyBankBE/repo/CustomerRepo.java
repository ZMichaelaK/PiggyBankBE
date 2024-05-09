package com.piggyBankBE.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.piggyBankBE.domain.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}