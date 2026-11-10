package com.construBem.Api_construBem.identity.infrastructure;

import com.construBem.Api_construBem.identity.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<Customer, Long>{

    
}
