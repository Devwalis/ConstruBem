
package com.construBem.Api_construBem.identity.domain;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor 
@AllArgsConstructor 
@Data 

public class Customer extends User  {

    private List<Phone> phone;
    private List<Address> addres;

  
}