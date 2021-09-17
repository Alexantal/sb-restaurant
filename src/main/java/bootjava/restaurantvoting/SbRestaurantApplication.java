package bootjava.restaurantvoting;

import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class SbRestaurantApplication {

  public static void main(String[] args) {
    SpringApplication.run(SbRestaurantApplication.class, args);
  }
}
