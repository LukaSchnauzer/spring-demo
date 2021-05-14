package com.accenture.springacademy.cli;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CliRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hola baby, from CLI");
    }
}
