package liqour.ravine.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="customer")
public class Customer {

    @Id
    @Column(name="customer_id")
    private int customer_id;
    
    @Column(name="fname")
    private String fname;
    
    @Column(name="lname")
    private String lname;
    
    @Column(name="email")
    private String email;
    
    @Column(name="phone_number")
    private int phone_number;
    
    @Column(name="image_url")
    private String image_url;
    
    @Column(name="barber_id")
    private int barber_id;
    
    @Column(name="service_id")
    private int service_id;
    
    @Column(name="booking_id")
    private int booking_id;
}
