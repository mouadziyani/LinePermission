package ma.youcode.lineperm.service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;

import org.mindrot.jbcrypt.BCrypt;

import ma.youcode.lineperm.model.Users;

public class AuthService {

    public static boolean isAuth = false ;

    public void login(String username, String password) {

        if(UserService.users.containsKey(username)){
            if(!BCrypt.checkpw(password, UserService.users.get(password))){
                System.out.println("password incorrect");
            }

            isAuth = true ;

            System.out.println(isAuth);
        }else{
            System.out.println("username not found");
        }

    }

    public void signup(String username , String password) throws Exception{

        if(UserService.users.containsKey(username)){
            System.out.println("username deja existe");
        }

        try {
            
            Path userPath = Path.of("src/main/resources/users.txt");
            
            String passwordHash = BCrypt.hashpw(password, BCrypt.gensalt());
            String creatUser = username + " : " + passwordHash ; 
            UserService.users.put(creatUser, passwordHash);

            Files.writeString(userPath, creatUser + System.lineSeparator() , StandardOpenOption.APPEND);

        } catch (Exception e) {
            throw new Exception("Error");
        }
    }

}
