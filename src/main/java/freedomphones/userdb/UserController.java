package freedomphones.userdb;

import java.util.List;

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
    public List<User> userExist(@PathVariable String username){
        List<User> users = userRepository.findUserByUsername(username);
        return users;
    }
}