
package com.construBem.Api_construBem.identity.domain;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor 
@AllArgsConstructor 
@Gatter
@Setter 
@Table(name = "customers")
public class Customer extends User  {


    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Phone> phones = new ArrayList<>(); 

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Address>  address = new ArrayList<>();


    public Customer(String name, String email, String password){
        super(null, name, email, password, true);

    }

    public void addAddress(Address addr){
        address.add(addr);
        address.setCustomer(this);

    }
    

    public void addPhone(Phone ph){
        phones.add(ph);
        phone.setCustomer(this);

    }
    
  
}