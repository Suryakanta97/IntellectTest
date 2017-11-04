package com.surya.example.Intellect.unittest;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.surya.example.Intellect.domain.Customer;
import com.surya.example.Intellect.domain.CustomerRepository;



@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {

    private CustomerRepository repository;

    @Autowired
    public void setRepository(CustomerRepository repository) {
        this.repository = repository;
    }

    SimpleDateFormat dt1 = new SimpleDateFormat("dd-MMM-yyyy, EEEE");
    Date date = new Date();

    
    @Test
    public void createCustomer() {
    	Customer customer = new Customer(3, "Surya", "Sahoo", 560100, "Surya@infosys.com", true,dt1.format(date) );
       /* Customer savedCustomer = repository.save(Customer);
        Customer newCustomer = repository.findOne(savedCustomer.Id());
        assertEquals("Java 8 in Action", newCustomer.getName());
        assertEquals("Programming", newCustomer.getDescription());*/
    }

    @Test
    public void findAllCustomers() {
        List<Customer> Customers = repository.findAll();
        assertNotNull(Customers);
        assertTrue(!Customers.isEmpty());
    }

    @Test
    public void findCustomerById() {
        Customer Customer = repository.findOne(1);
        assertNotNull(Customer);
    }

    @Test
    public void deleteCustomerWithId() {
        Customer Customer = repository.findOne(1);
        repository.delete(Customer);
        assertNotNull(Customer);
    }
}