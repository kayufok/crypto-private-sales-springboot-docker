package com.rickyfok.investment.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "investments")
public class InvestmentEntity {

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "token_code")
    private String tokenCode;
    @Column(name = "sale_price")
    private BigDecimal salePrice;
    @Column(name = "brought_amt")
    private BigDecimal broughtAmount;
    @Column(name = "brought_amt_scale")
    private BigDecimal broughtAmountScale;
    @Column(name = "invested_date")
    private Date investedDate;
    @Column(name = "launch_date_from")
    private Date launchDateFrom;
    @Column(name = "launch_date_to")
    private Date launchDateTO;

}
