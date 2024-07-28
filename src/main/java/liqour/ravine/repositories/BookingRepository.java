package liqour.ravine.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.Optional;

import liqour.ravine.entities.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {

    @Query("SELECT r FROM Booking r WHERE r.booking_id = :id")
    Optional<Booking> findBookingById(@Param("id") Integer id);
}
