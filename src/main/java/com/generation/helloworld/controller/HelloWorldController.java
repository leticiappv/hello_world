package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @GetMapping
    public String helloWorld() {
        return "Hello World!!!";
    }

    @GetMapping("/bsms")
    public List<String> bsms() {
        return Arrays.asList(
            "Mentalidade de Crescimento",
            "Persistência",
            "Responsabilidade Pessoal",
            "Orientação ao Futuro",
            "Comunicação",
            "Proatividade",
            "Trabalho em Equipe",
            "Orientação ao Detalhe"
        );
    }

    @GetMapping("/objetivos")
    public List<String> objetivos() {
        return Arrays.asList(
            "Aprender Spring Boot",
            "Melhorar habilidades de programação",
            "Desenvolver soft e hardskills",
            "Estudar para certificações e vestibular"
        );
    }
}
