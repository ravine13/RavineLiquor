package liqour.ravine.service;

import liqour.ravine.repositories.CustomerRepository;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import liqour.ravine.entities.Customer;


@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }
    //create
    public Customer saveCustomer(Customer customer){
        return customerRepository.save(customer);
    }
    //get
    public Iterable<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }
    //getby id
    public Customer getCustomerById(Integer id) {
        return customerRepository.findById(id).orElse(null);
    }
    //update
    public Customer updateCustomer(Customer customer){
        return customerRepository.save(customer);
    }
    //delete
    public void deleteCustomer(Integer id){
        customerRepository.deleteById(id);
    }
}
