package ma.youcode.lineperm.service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import org.mindrot.jbcrypt.BCrypt;


public class AuthService{

    public AuthService(){
        new UserService();
    }


    public static boolean isAuth = false ;
    Path userPath = Path.of("src/main/resources/users.txt");   
    
    
    public void login(String username, String password) {

        if (UserService.users.containsKey(username)) {

            String passwordHash = UserService.users.get(username);

            if (!BCrypt.checkpw(password, passwordHash)) {
                System.out.println("password incorrect");
                return;
            }

            isAuth = true;
            System.out.println("connect");

        } else {
            System.out.println("username not found");
        }
    }

    public void signup(String username , String password) throws Exception{

        if(UserService.users.containsKey(username)){
            System.out.println("username deja existe");
            return ;
        }

        try {
            
            String passwordHash = BCrypt.hashpw(password, BCrypt.gensalt());
            String creatUser = username + " : " + passwordHash ; 
            UserService.users.put(creatUser, passwordHash);

            Files.writeString(userPath, creatUser + System.lineSeparator() , StandardOpenOption.APPEND);

        } catch (Exception e) {
            throw new Exception("Error");
        }
    }


    

}
