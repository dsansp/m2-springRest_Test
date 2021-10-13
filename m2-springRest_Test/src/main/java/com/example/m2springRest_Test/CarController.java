package com.example.m2springRest_Test;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CarController {
@GetMapping("/coche")
public Car FindCar(){
    Car toyota = new Car(1L,"Toyota","Prius");
    return toyota;

}
@GetMapping("/search/{id}")
public Car FindById(@PathVariable Long id) {
    Car toyota = new Car(id,"Toyota","Prius");
    return toyota;


}
@GetMapping("/coche/{fabricante}")
public List<Car> FindByFabricante(@PathVariable String fabricante) {
    Car seat = new Car(2L,fabricante,"Leon");
    Car ford = new Car(3L,fabricante,"Puma");
    List<Car> coche= new ArrayList<Car>(); ;
    coche.add(seat);
    coche.add(ford);
    System.out.println("el fabricante a filtrar es "+fabricante);
return coche;
}
@GetMapping("/coche/{fabricante}/{model}")
public List<Car> findAllByFabricanteAndModel(@PathVariable String fabricante, @PathVariable String model) {
    Car seat = new Car(2L,fabricante,model);
    Car ford = new Car(3L,fabricante,model);
    List<Car> coche= new ArrayList<Car>(); ;
    coche.add(seat);
    coche.add(ford);

    System.out.println("el fabricante a filtrar es "+fabricante+ "el modelo " +model) ;
    return coche;
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
@PostMapping("/coche")
public void save(@RequestBody Car coche){
    System.out.println("el fabricante es "+coche.getFabricante()+" modelo  "+coche.getModel());

}
@PutMapping("/coche")
public void update(@RequestBody Car coche){
    System.out.println("el fabricante es "+coche.getFabricante()+" modelo  "+coche.getModel());

}
@DeleteMapping("/coche/{id}")
    public void deleteById(@PathVariable Long id) {
    System.out.println("Id recibido "+ id);
}

}
@DeleteMapping("/coche")
public void deleteAll(){)
}

