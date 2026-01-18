package com.bnk.api.service;

import org.springframework.stereotype.Service;

import com.bnk.api.exception.ResourceNotFoundException;
import com.bnk.api.model.Bank;
import com.bnk.api.repository.BankRepository;

@Service
public class BankService {
	
	private final BankRepository bankRepository;

    public BankService(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }

    public Bank saveBankDetails(Bank bank) {
        return bankRepository.save(bank);
    }

    public Bank getBankById(Long id) {
        return bankRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "Bank details not found with id: " + id));
    }

    
    
}
