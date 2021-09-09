package bootjava.restaurantvoting;

import bootjava.restaurantvoting.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class SbRestaurantApplication implements ApplicationRunner {
  private final UserRepository userRepository;

  public static void main(String[] args) {
    SpringApplication.run(SbRestaurantApplication.class, args);
  }

  @Override
  public void run(ApplicationArguments args) {
    System.out.println(userRepository.findByLastNameContainingIgnoreCase("last"));
  }
}
