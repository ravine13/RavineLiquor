package liqour.ravine.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="Rating")
public class Rating {
    @Id
    @Column(name="rating_id")
    private int rating_id;
    @Column(name="customer_id")
    private int customer_id;
    @Column(name="review_id")
    private int review_id;
    @Column(name="service_id")
    private int service_id;
}
