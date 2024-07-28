package liqour.ravine.repositories;

import java.math.BigInteger;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import liqour.ravine.entities.Customer;



@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
    @Query("SELECT r FROM Customer r WHERE r.customer_id = :id")
    Optional<Customer> findCustomerById(@Param("id") Integer id);
}
