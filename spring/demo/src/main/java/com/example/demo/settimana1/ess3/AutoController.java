package com.example.demo.settimana1.ess3;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/v2/cars")
public class AutoController {
    List<Auto> allAuto = new ArrayList<>();

    public AutoController() {
        Auto car1 = new Auto("Fiat", "ok", 5, 3000);
        Auto car2 = new Auto("Mazda", "bho", 3, 1600);
        Auto car3 = new Auto("Mazda", "?", 5, 1200);

        allAuto.add(car1);
        allAuto.add(car2);
        allAuto.add(car3);
    }

    @GetMapping(path = "/all")
    public List<Auto> getAll() {
        return allAuto;
    }

    @GetMapping(path = "/filterbymarca")
    public List<Auto> filterByMarca(@RequestParam String marcaToFilter) {
        List<Auto> filteredList = new ArrayList<>();
        for (Auto auto : filteredList) {
            if (auto.getMarca().equals(marcaToFilter)) {
                filteredList.add(auto);
            }
        }
        return filteredList;
    }

    @GetMapping(path = "/filterbyid/{idToFilter}")
    public Auto filterByID(
            @PathVariable String idToFilter) {
        for (Auto auto : allAuto) {
            if (auto.getId().equals(UUID.fromString(idToFilter))) {
                return auto;
            }
        }
        return null;
    }

    @PostMapping(path = "/add")
    public List<Auto> postMethodName(@RequestBody Auto newAuto) {
        allAuto.add(newAuto);

        return allAuto;
    }

}
