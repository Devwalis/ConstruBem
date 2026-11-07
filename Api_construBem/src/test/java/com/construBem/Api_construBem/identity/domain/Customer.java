
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


    public Customer(String name, String email, String password){
        super(null, name, email, password, true);

    }

    public void addAddress(Address address){
        address.add(address);
        address.setCustomer(this);

    }
    

    public void addPhone(Phone phones){
        phones.add(phone);
        phone.setCUstomer(this);

    }
    
  
}