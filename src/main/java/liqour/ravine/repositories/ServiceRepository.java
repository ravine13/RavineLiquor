package liqour.ravine.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import liqour.ravine.entities.Service;

public interface ServiceRepository extends JpaRepository<Service,Integer>{
    @Query("SELECT r FROM Service  r WHERE r.service_id = :id")
    Optional<Service> findServiceById(@Param("id")Integer id);
    
}
