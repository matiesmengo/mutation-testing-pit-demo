package com.matiesmengo.mutationtesting;

import com.matiesmengo.mutationtesting.services.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    private Calculator calculator;

    @Override
    public void run(final String... args) {
        System.out.println("\n\n\n --- CALCULATOR ---");

        System.out.println(calculator.addition(10, 20));
        System.out.println(calculator.subtraction(10, 20));
        System.out.println(calculator.multiplication(10, 20));
        System.out.println(calculator.division(10, 20));
    }
}