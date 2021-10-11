package com.example.m2springRest_Test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CarController {
@GetMapping("/coche")
public Car FindCar(){
    Car toyota = new Car(1L,"Toyota","Prius");
    return toyota;

}
@GetMapping("/lista")
public List<Car> findAll(){
    Car seat = new Car(2L,"Seat","Leon");
    Car ford = new Car(3L,"Ford","Puma");
List<Car> coche= new ArrayList<Car>(); ;
        coche.add(seat);
        coche.add(ford);

return coche;
}
}
