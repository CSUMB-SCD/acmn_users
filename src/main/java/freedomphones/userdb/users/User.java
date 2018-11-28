package freedomphones.userdb.users;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Users")
public class User{
    @Id
    private String id;
    private Username username;
    private Password password;

    public User(Username username, Password password){
        this.username = username;
        this.password = password;
    }

    public Username getUsername(){
        return this.username;
    }
    public String getId(){
        return this.id;
    }
    public void setUsername(Username username){
        this.username = username;
    }
    public Password getPassword(){
        return this.password;
    }
    public void setPassword(Password password){
        this.password = password;
    }
}