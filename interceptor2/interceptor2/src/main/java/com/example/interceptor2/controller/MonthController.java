package com.example.interceptor2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.interceptor2.entities.Month;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@RestController
@RequestMapping("/months")

public class MonthController {

    public List<Month> monthLIst = new ArrayList<>();

    public MonthController() {
        monthLIst.add(new Month(1, "January", "Gennaio", "Januar"));
        monthLIst.add(new Month(2, "February", "Febbraio", "Februar"));
        monthLIst.add(new Month(3, "March", "Marzo", "Marz"));
        monthLIst.add(new Month(4, "April", "Aprile", "April"));
        monthLIst.add(new Month(5, "May", "Maggio", "Mai"));
        monthLIst.add(new Month(6, "june", "Giugno", "Juni"));
    }

    @GetMapping("/getMonthByHisNumber")
    public Month getMonth(@RequestHeader(name = "monthNumber", required = false) Integer monthNumber) {
        if (monthNumber == null) {
            throw new IllegalArgumentException("Month number cannot be null");
        }

        for (Month month : monthLIst) {
            if (month.getMonthNumber() == monthNumber) {
                return month;
            }
        }
        return new Month(0, "nope", "nope", "nope");
    }
}
