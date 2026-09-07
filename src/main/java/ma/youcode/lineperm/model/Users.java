package ma.youcode.lineperm.model;

public class Users{

    private String username ;
    private String passwordHash ;

    public Users(String username , String passwordHash){
        this.username = username ;
        this.passwordHash = passwordHash ;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPasswordHash(){
        return this.passwordHash;
    }
}
