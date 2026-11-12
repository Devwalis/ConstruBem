package com.construBem.Api_construBem.identity.infrastructure;



import com.construBem.Api_construBem.identity.domain.Address;
import com.construBem.Api_construBem.identity.domain.Customer;
import com.construBem.Api_construBem.identity.domain.Phone;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class CustomerRepositoryTest {


    @Autowired 
    private CustomerRepository customerRepository;

    @Test
    @DisplayName("Deve salvar um cliente com endereço e telefone no banco de dados")
    void SaveTheCustomerWithTheirAddressAndPhoneNumber(){

 //1 Create the Customer
        Customer customer = new Customer("João Silva", "joao@email.com", "senha123");

        //2. create the Address
        Address address = new Address();
        address.setStreet("Rua das flores");
        address.setNumber("123");
        address.setZipCode("12345-678");
        address.setCity("São Paulo");
        address.setState("SP");

        //3. Create the phones 
        Phone phone = new Phone();
        phone.setNumber("1199999999");
        

        // 4 associate is customer
        customer.addAddress(address);
        customer.addPhone(phone);


        // 5. save customer in database
        Customer postCustomer = customerRepository.save(customer);


        //6. Verificalçies (Assertivas)
        Assertions.assertNotNull(postCustomer.getId(), "O ID do cliente deveria ter sido gerado");


 
        Assertions.assertEquals("joão Silva", postCustomer.getName());

        //search customer in database to ensure that relationships were saved
        Customer customerDB = customerRepository.findById(postCustomer.getId()).orElseThrow();


        Assertions.assertEquals(1, customerDB.getAddresses().size(), "O Cliente deveria ter 1 endereço");


        Assertions.assertEquals(1, customerDB.getPhones().size(), "O cliente deveria ter 1 telefone");
 
        Assertions.assertEquals("1199999999", customerDB.getPhones().get(0).getNumber());



    }
}
