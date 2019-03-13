package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner{

    @Autowired
    CarRepository repository;

    @Override
    public void run(String... strings) throws Exception{

        Car car = new Car("1032", "Ekam", "Ledom");
        repository.save(car);

        car = new Car("1322", "Amke", "Demol");
        repository.save(car);

        car = new Car("1982", "Emak", "Lomed");
        repository.save(car);
    }
}
