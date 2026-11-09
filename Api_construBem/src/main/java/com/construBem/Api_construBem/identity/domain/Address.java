package com.construBem.Api_construBem.identity.domain;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity(name = "tb_addresses")
@AllArgsConstructor 
@NoArgsConstructor 
@Data 
public class Address {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotBlank(message = "O logradouro é obrigatório")
    private String street;


    @NotBlank(message = "O número é obrigatório")
    private String number;

    private String complement;

    @NotBlank(message = "O CEP é obrigatório")
    private String zipCode;

    @NotBlank(message = "O estado é obrigatório")
    private String city;

    @NotBlank(message = "O estado é obrigatório")
    @Column 
    private String state;

    @ManyToOne 
    @JoinColumn(name = "customer_id")
    private Customer customer;
    
}

