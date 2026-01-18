package com.bnk.api.controller;

import java.util.*;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bnk.api.model.Bank;
import com.bnk.api.service.BankService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/bank")
public class BankContrller {
	
	private final BankService bankService;

    public BankContrller(BankService bankService) {
        this.bankService = bankService;
    }

    @PostMapping("/save")
    public ResponseEntity<?> saveBank(@Valid @RequestBody Bank bank) {
        bankService.saveBankDetails(bank);
        return ResponseEntity.ok("Data saved successfully");
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Map<String, Object>> getBankById(@PathVariable Long id) {

        Bank bank = bankService.getBankById(id);
        Map<String, Object> response = new HashMap<>();
        response.put("status", "SUCCESS");
        response.put("result", bank);
        return ResponseEntity.ok(response);
    }

    
 

}
