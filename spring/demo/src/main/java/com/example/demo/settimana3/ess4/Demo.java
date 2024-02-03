package com.example.demo.settimana3.ess4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo {
     public static void main(String[] args) {
        SpringApplication.run(Demo.class, args);
    }
}
/* ecco cosa spunta su HAL 
{   "_embedded": {
        "cars": [
          {
            "modelName": "ok",
            "serialNumber": 76897,
            "currentPrice": 9000,
            "_links": {
              "self": {
                "href": "http://localhost:8080/cars/1"
              },
              "car": {
                "href": "http://localhost:8080/cars/1"
              }
            }
          },
          {
            "modelName": "non lo so ",
            "serialNumber": 432425,
            "currentPrice": 76897,
            "_links": {
              "self": {
                "href": "http://localhost:8080/cars/2"
              },
              "car": {
                "href": "http://localhost:8080/cars/2"
              }
            }
          }
        ]
      },
      "_links": {
        "self": {
          "href": "http://localhost:8080/cars?page=0&size=20"
        },
        "profile": {
          "href": "http://localhost:8080/profile/cars"
        }
      },
      "page": {
        "size": 20,
        "totalElements": 2,
        "totalPages": 1,
        "number": 0
      }
    }*/