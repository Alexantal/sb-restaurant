package bootjava.restaurantvoting.repository;

import bootjava.restaurantvoting.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
