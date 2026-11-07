package com.construBem.Api_construBem.identity.domain;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity(name = "tb_phones")
@AllArgsConstructor 
@Data 
public class Phone {


    private Long id;
    private String name;

}
