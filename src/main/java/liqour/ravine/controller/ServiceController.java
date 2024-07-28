package liqour.ravine.controller;

import liqour.ravine.entities.Customer;
import liqour.ravine.entities.Service;
import liqour.ravine.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/service")
public class ServiceController {

    private final ServiceService serviceService;

    @Autowired
    public ServiceController(ServiceService serviceService) {
        this.serviceService = serviceService;
    }

    @PostMapping(value = "/register", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> registerService(@RequestBody Service service) {
        Service savedService = serviceService.saveService(service);
        return ResponseEntity.ok(savedService);
    }

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAllServices() {
        return ResponseEntity.ok(serviceService.getAllService());
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getServiceById(@PathVariable Integer id) {
        return ResponseEntity.ok(serviceService.getServiceById(id));
    }

     @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> updateService(@PathVariable Integer id, @RequestBody Service service) {
        Service updatedService = serviceService.updateService(service);
        return ResponseEntity.ok(updatedService);
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> deleteService(@PathVariable Integer id) {
        serviceService.deleteService(id);
        return ResponseEntity.ok().build();
    }
}
