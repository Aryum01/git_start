package com.example.demo.settimana2.ess1;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/v1/name")
public class NameController {

    @GetMapping("/{name}")
    public String getMethodName(
            @PathVariable String name) {
        return "Nome : \n " + name;
    }

    @PostMapping("/reversename")
    public String reverseName(@RequestParam String name) {
        StringBuilder reversedName = new StringBuilder(name).reverse();
        return "Nome al contrario : \n " + reversedName.toString();
    }

}
