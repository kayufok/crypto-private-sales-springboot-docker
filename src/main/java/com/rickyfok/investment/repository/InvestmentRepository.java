package com.rickyfok.investment.repository;

import com.rickyfok.investment.entity.InvestmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestmentRepository extends JpaRepository<InvestmentEntity, String> {


}
