package liqour.ravine.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import liqour.ravine.entities.Barber;
import java.util.Optional;


@Repository
public interface BarberRepository extends JpaRepository<Barber,Integer> {
    @Query("SELECT r FROM Barber r WHERE r.barber_id = :id")
    Optional<Barber> findBarberById(@Param("id")Integer id);
    

    
}

