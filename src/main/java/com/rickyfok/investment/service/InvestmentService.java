package com.rickyfok.investment.service;

import com.rickyfok.investment.entity.InvestmentEntity;
import com.rickyfok.investment.repository.InvestmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestmentService {
    @Autowired
    InvestmentRepository investmentRepository;

    public List<InvestmentEntity> findAllInvestments(){
        return investmentRepository.findAll();
    }

}
