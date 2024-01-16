package com.example.demo.settimana1.ess2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2")
public record Nuovo() {

    @GetMapping(path = "/ciao/{provincia}")
    public Saluto nuovo(
            @PathVariable String provincia,
            @RequestParam(required = true) String nome) {
                String saluto = String.format("ciao %s, com'è il tempo in %s?",nome, provincia);
        return new Saluto(nome, provincia,saluto);
    }

}
