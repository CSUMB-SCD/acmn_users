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
<<<<<<< HEAD
        User user = new User("user", "password",70000.00);
=======
        User user = new User("user","password", 70000.00);
>>>>>>> eeb200891fce902f223d431d25abfb2b4b63c7ca
        userRepo.deleteAll();
        userRepo.save(user);
    }
}