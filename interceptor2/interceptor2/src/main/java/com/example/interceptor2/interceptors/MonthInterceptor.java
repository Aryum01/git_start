package com.example.interceptor2.interceptors;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.example.interceptor2.entities.Month;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class MonthInterceptor implements HandlerInterceptor {

    public List<Month> monthLIst = new ArrayList<>();

    public MonthInterceptor() {
        monthLIst.add(new Month(1, "January", "Gennaio", "Januar"));
        monthLIst.add(new Month(2, "February", "Febbraio", "Februar"));
        monthLIst.add(new Month(3, "March", "Marzo", "Marz"));
        monthLIst.add(new Month(4, "April", "Aprile", "April"));
        monthLIst.add(new Month(5, "May", "Maggio", "Mai"));
        monthLIst.add(new Month(6, "june", "Giugno", "Juni"));
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        String monthNumber = request.getHeader("monthNumber");

        if (monthNumber == null || monthNumber.isEmpty()) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Month number cannot be null or empty");
            return false;
        }

        int monthNumberInt = Integer.parseInt(monthNumber);
        for (Month month : monthLIst) {
            if (month.getMonthNumber() == monthNumberInt) {
                request.setAttribute("selectedMonth", month);
                return true;
            }
        }
        request.setAttribute("selectedMonth", new Month(0, "nope", "nope", "nope"));
        return true;
    }
}
