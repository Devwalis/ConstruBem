package com.construBem.Api_construBem.identity.domain;


import jakarta.validation.constraints.NotBlank;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity(name = "tb_phones")
@AllArgsConstructor
@NoArgsConstructor 
@Data 
public class Phone {


    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotBlank(message = "O número é obrigátorio ")
    @Column(nullable = false)
    private String number;


    @ManyToOne 
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
    
}
