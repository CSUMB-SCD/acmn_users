package freedomphones.userdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import freedomphones.userdb.users.User;

@RestController
public class UserController{
    @Autowired
    IUserRepository userRepository;

    @GetMapping("/userExist/{username}")
    public User userExist(@PathVariable String username){
        User user = userRepository.findUserByUsername(username);
        return user;
    }
}