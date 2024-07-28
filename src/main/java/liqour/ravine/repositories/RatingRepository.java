package liqour.ravine.repositories;

import java.math.BigInteger;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import liqour.ravine.entities.Rating;

@Repository
public interface RatingRepository extends JpaRepository<Rating, BigInteger> {

    @Query("SELECT r FROM Rating r WHERE r.rating_id = :id")
    Optional<Rating> findRatingById(@Param("id") BigInteger id);
}
