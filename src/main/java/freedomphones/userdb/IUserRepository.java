package freedomphones.userdb;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import freedomphones.userdb.users.User;

@Repository
public interface IUserRepository extends MongoRepository<User, String>{
    @Query(value = "{ 'username.username':?0}")
    List<User> findUserByUsername(String username);
}