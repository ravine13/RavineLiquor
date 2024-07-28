package liqour.ravine.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="Service")
public class Service {
    @Id
    @Column(name="service_id")
    private int service_id;
    @Column(name="service_name")
    private String service_name;
    @Column(name="customer_id")
    private int customer_id;
    @Column(name="rating_id")
    private int rating_id;
    @Column(name="review_txt")
    private String review_txt;
    @Column(name="image_url")
    private String image_url;
    @Column(name="description")
    private String description;
    @Column(name="price")
    private int price;

}
