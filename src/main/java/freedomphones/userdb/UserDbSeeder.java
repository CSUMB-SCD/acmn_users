package freedomphones.userdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import freedomphones.userdb.users.Password;
import freedomphones.userdb.users.User;
import freedomphones.userdb.users.Username;

@Component
public class UserDbSeeder implements CommandLineRunner{

    @Autowired
    IUserRepository userRepo;


    @Override
    public void run(String... args) throws Exception {
        User user = new User(new Username("user"), new Password("password"));
        userRepo.deleteAll();
        userRepo.save(user);
    }
}