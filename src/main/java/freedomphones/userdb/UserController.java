package freedomphones.userdb;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import freedomphones.userdb.users.User;

@RestController
public class UserController{
    @Autowired
    IUserRepository userRepository;

    @GetMapping("/getUser/{username}")
    public Optional<User> userExist(@PathVariable String username){
        Optional<User> user = userRepository.findUserByUsername(username);
        return user;
    }
}