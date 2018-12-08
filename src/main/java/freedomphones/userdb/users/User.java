package freedomphones.userdb.users;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Users")
public class User{
    @Id
    private String id;
    private String username;
    private String password;
    private Double funds;

    public User(String username, String password, Double funds){
        this.username = username;
        this.password = password;
        this.funds = funds;
    }

    public String getUsername(){
        return this.username;
    }
    public String getId(){
        return this.id;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public Double getFunds(){
        return this.funds;
    }
    public void setFunds(Double funds){
        this.funds = funds;
    }
}