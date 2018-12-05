package freedomphones.userdb;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import freedomphones.userdb.users.User;

@RestController
public class UserController{
    @Autowired
    IUserRepository userRepository;

    @GetMapping(value="/getUser/{username}", produces="application/json")
    public ResponseEntity<?> userExist(@PathVariable String username){
        Optional<User> user = userRepository.findUserByUsername(username);
        if(!user.isPresent()){
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}