package liqour.ravine.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="Review")
public class Review {
      @Id
    @Column(name="review_id")
    private int review_id;
    @Column(name="barber_id")
    private int barber_id;
    @Column(name="customer_id")
    private int customer_id;
    @Column(name="rating_id")
    private int rating_id;
    @Column(name="review_txt")
    private String review_txt;
}
