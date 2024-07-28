package liqour.ravine.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import liqour.ravine.entities.User;

public interface UserRepository extends JpaRepository<User,Integer>{
    @Query("SELECT r FROM User  r WHERE r.user_id = :id")
    Optional<User> findUserById(@Param("id")Integer id);

    Optional<User> findUserByUsername(String name);
    
}
