package com.surya.example.Intellect;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.surya.example.Intellect.domain.CustomerRepository;
import com.surya.example.Intellect.domain.Customer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class Application implements CommandLineRunner {

    private CustomerRepository repository;

    @Autowired
    public void setRepository(CustomerRepository repository) {
        this.repository = repository;
    }
    SimpleDateFormat dt1 = new SimpleDateFormat("dd-MMM-yyyy, EEEE");
    Date date = new Date();

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... arg0) throws Exception {

        repository.deleteAll();

        repository.save(new Customer(1, "Surya1", "Sahoo", 560100, "Surya@infosys.com", true,dt1.format(date) ));
        repository.save(new Customer(2, "Surya2", "Sahoo", 560100, "Surya@infosys.com", true,dt1.format(date) ));
    }
}