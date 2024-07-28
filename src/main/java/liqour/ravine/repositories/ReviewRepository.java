package liqour.ravine.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import liqour.ravine.entities.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer>{
    @Query("SELECT r FROM Review  r WHERE r.review_id = :id ")
    Optional<Review> findReviewById(@Param("id")Integer id);
    
}
