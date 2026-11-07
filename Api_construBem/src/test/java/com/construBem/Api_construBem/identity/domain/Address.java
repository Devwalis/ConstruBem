package com.construBem.Api_construBem.identity.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


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
    private String ZipCode;

    @NotBlank(message = "O estado é obrigatório")
    private String city;

    @NotBlank(message = "O estado é obrigatório")
    private String state;


}

