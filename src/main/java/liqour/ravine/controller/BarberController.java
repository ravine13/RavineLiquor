package liqour.ravine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import liqour.ravine.entities.Barber;
import liqour.ravine.service.BarberService;


@RestController
@RequestMapping("/barbers")
public class BarberController {
    private final BarberService barberService;

    @Autowired
    public BarberController(BarberService barberService){
        this.barberService = barberService;
    }

    @PostMapping(value="/register", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> registerBarber(@RequestBody Barber barber) {

        Barber savedBarber = barberService.saveBarber(barber);
        return ResponseEntity.ok(savedBarber);
    } // @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value="/all",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?>getAllBarbers(){
        return ResponseEntity.ok(barberService.getAllBarbers());
    }
    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> updateCustomer(@PathVariable Integer id, @RequestBody Barber barber){
        Barber updatedBarber = barberService.updateBarber(barber);
        return ResponseEntity.ok(updatedBarber);
    }
   @DeleteMapping(value = "path/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?>DeleteCustomer(@PathVariable Integer id){
        barberService.deleteBarber(id);
        return ResponseEntity.ok().build();
    }

}
