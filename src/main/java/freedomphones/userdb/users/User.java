package freedomphones.userdb.users;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Users")
public class User{
    @Id
    private String id;
    private Username username;
    private Password password;
    private Funds funds;

    public User(Username username, Password password, Funds funds){
        this.username = username;
        this.password = password;
        this.funds = funds;
    }

    public Username getUsername(){
        return this.username;
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
    public Funds getFunds(){
        return this.funds;
    }
    public void setFunds(Funds funds){
        this.funds = funds;
    }
}