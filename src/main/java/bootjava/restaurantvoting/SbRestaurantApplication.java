package bootjava.restaurantvoting;

import bootjava.restaurantvoting.model.Role;
import bootjava.restaurantvoting.model.User;
import bootjava.restaurantvoting.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;

@SpringBootApplication
@AllArgsConstructor
public class SbRestaurantApplication implements ApplicationRunner {
  private final UserRepository userRepository;

  public static void main(String[] args) {
    SpringApplication.run(SbRestaurantApplication.class, args);
  }

  @Override
  public void run(ApplicationArguments args) throws Exception {
    userRepository.save(new User("user@gmail.com", "User_First", "User_Last", "password", Set.of(Role.ROLE_USER)));
    userRepository.save(new User("user2@gmail.com", "User2_First", "User2_Last", "password2", Set.of(Role.ROLE_USER)));
    userRepository.save(new User("admin@javaops.ru", "Admin_First", "Admin_Last", "admin", Set.of(Role.ROLE_USER, Role.ROLE_ADMIN)));
    System.out.println(userRepository.findAll());
  }
}
