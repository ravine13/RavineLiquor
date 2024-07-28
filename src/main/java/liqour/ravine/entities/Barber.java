package liqour.ravine.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="barbers")
public class Barber {

    @Id
    @Column(name="barber_id")
    private int barber_id;
    @Column(name="first_name")
    private String first_name;
    @Column(name="last_name")
    private String last_name;
    @Column(name="email")
    private String email;
    @Column(name="phone_number")
    private int phone_number;
    @Column(name="image_url")
    private String image_url;
    @Column(name="speciality")
    private int speciality;
    @Column(name="customer_id")
    private int customer_id;
}
