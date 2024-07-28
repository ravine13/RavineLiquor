package liqour.ravine.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import liqour.ravine.entities.Profile;

public interface ProfileRepository extends JpaRepository<Profile ,Integer>{
    @Query("SELECT r FROM Profile r WHERE r.profile_id =:id")
    Optional<Profile> findBookingById(@Param("id") Integer id);
    
}
