
package com.construBem.Api_construBem.identity.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor 
@AllArgsConstructor 
@Data 
@Table(name = "customers")
public class Customer extends User  {

    private List<Phone> phones = new ArrayList<>(); 
    private List<Address>  address = new ArrayList<>();
    

  
}