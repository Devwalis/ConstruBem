
package com.construBem.Api_construBem.identity.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor 
@AllArgsConstructor 
@Data 

public class Customer extends User  {

    private Phone phone;
    private Address addres;

  
}