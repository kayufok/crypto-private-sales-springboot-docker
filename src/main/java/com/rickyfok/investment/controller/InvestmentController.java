package com.rickyfok.investment.controller;

import com.rickyfok.investment.entity.InvestmentEntity;
import com.rickyfok.investment.service.InvestmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InvestmentController {

    @Autowired
    InvestmentService investmentService;

    @GetMapping(value = "api/v1/investments",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<InvestmentEntity>> findAllInvestments() {
        return ResponseEntity.ok(investmentService.findAllInvestments());
    }


}
