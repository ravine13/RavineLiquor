package liqour.ravine.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="Profile")
public class Profile {
    @Id
    @Column(name="profile_id")
    private int profile_id;
    @Column(name="user_id")
    private int user_id;
    @Column(name="img_url")
    private String img_url;
   
}
 