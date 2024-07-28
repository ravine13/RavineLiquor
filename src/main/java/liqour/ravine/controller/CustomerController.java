package liqour.ravine.controller;

import liqour.ravine.entities.Customer;
import liqour.ravine.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;




@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping(value="/register", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> registerCustomer(@RequestBody Customer customer) {

        Customer savedCustomer = customerService.saveCustomer(customer);
        return ResponseEntity.ok(savedCustomer);
    } 

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?>getAllCustomers() {
        return ResponseEntity.ok(customerService.getAllCustomers());
    }
    
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?>getAllCustomers(@PathVariable Integer id) {
        return ResponseEntity.ok(customerService.getCustomerById(id));
    }
    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> updateCustomer(@PathVariable Integer id, @RequestBody Customer customer) {
        Customer updatedCustomer = customerService.updateCustomer(customer);
        return ResponseEntity.ok(updatedCustomer);
    }
    @DeleteMapping(value = "path/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?>DeleteCustomer(@PathVariable Integer id){
        customerService.deleteCustomer(id);
        return ResponseEntity.ok().build();
    }
    
}
