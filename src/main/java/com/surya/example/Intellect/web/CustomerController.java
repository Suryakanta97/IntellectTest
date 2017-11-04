package com.surya.example.Intellect.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.surya.example.Intellect.domain.CustomerRepository;
import com.surya.example.Intellect.domain.Customer;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/customer")
public class CustomerController {

    private CustomerRepository repository;

    @Autowired
    public void setRepository(CustomerRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(method = RequestMethod.POST , value = "/Create")
    public void createBook(@RequestBody Customer customer) {
        repository.save(customer);
    }

    @RequestMapping(method = RequestMethod.GET,value = "/getall")
    public List<Customer> findAllcustomer() {
        return repository.findAll();
    }

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/{id}")
    public Customer findCustomerById(@PathVariable Integer id) {

        return repository.findOne(id);
    }

    @RequestMapping(
            method = RequestMethod.DELETE,
            value = "Delete/{id}")
    public void deleteBookWithId(@PathVariable int id) {
        repository.delete(id);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteAllBooks() {
        repository.deleteAll();
    }
}