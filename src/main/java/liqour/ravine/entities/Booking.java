package liqour.ravine.entities;
import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="Booking")
public class Booking {

    @Id
    @Column(name="booking_id")
    private int booking_id;
    @Column(name="customer_id")
    private int customer_id;
    @Column(name="barber_id")
    private int barber_id;
    @Column(name="service_id")
    private int service_id;
    @Column(name="booking_date")
    private LocalDate bookingDate;
    @Column(name="booking_time")
    private LocalTime bookingTime;
  
}
