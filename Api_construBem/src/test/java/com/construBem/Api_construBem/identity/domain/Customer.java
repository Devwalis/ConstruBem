
package com.construBem.Api_construBem.identity.domain;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor 
@AllArgsConstructor 
@Data 
@Table(name = "customers")
public class Customer extends User  {


    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Phone> phones = new ArrayList<>(); 

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Address>  address = new ArrayList<>();
    

  
}