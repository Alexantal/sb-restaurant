package bootjava.restaurantvoting;

import bootjava.restaurantvoting.model.User;
import lombok.Getter;
import lombok.ToString;
import org.springframework.lang.NonNull;

@Getter
@ToString
public class AuthUser extends org.springframework.security.core.userdetails.User {

    private final User user;

    public AuthUser(@NonNull User user) {
        super(user.getEmail(), user.getPassword(), user.getRoles());
        this.user = user;
    }

    public int id() {
        return user.id();
    }
}
