package freedomphones.userdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import freedomphones.userdb.users.User;


@Component
public class UserDbSeeder implements CommandLineRunner{

    @Autowired
    IUserRepository userRepo;


    @Override
    public void run(String... args) throws Exception {
        User user = new User("user", "password",70000.00);
        userRepo.deleteAll();
        userRepo.save(user);
    }
}