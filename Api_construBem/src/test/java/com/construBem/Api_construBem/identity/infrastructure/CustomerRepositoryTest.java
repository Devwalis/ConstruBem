package com.construBem.Api_construBem.identity.infrastructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class CustomerRepositoryTest {


    @Autowired 
    private CustomeRepository CustomeRepository;

    @Test
    @DisplayName("Deve salvar um cliente com endereço e telefone no banco de dados")
    void deveSalvarClienteComEnderecoETelefone(){


        Customer customer = new Customer("João Silva", "joao@email.com", "senha123");


        Address address = new Address();
        address.setStreet("Rua das flores");
        address.setNumber("123");
        address.setZipCode("São paulo");
        address.setCity("São Paulo");
        address.setState("DP");
        
    }
}
