package freedomphones.userdb;


import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import freedomphones.userdb.users.User;

@Repository
public interface IUserRepository extends MongoRepository<User, String>{
    @Query(value = "{ 'username':?0}")
    Optional<User> findUserByUsername(String username);

    @Query(value = "{ 'username':?0}")
    User getUser(String username);
}