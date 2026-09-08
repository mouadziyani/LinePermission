package ma.youcode.lineperm.service;

import java.util.HashMap;

import ma.youcode.lineperm.model.Users;

public class AuthService {

    HashMap<String , Users> users;
    private UserService userService;
    public Users currentUser ;

    public AuthService(){
        users = new HashMap<>();
        currentUser = null ;
        userService = new UserService();
    }

    public boolean login(String username, String password) {

        Users user = users.get(username);

        if (user == null) {
            return false;
        }

        if (!user.getPasswordHash().equals(password)) {
            return false;
        }

        currentUser = user;

        return true;
    }

    public boolean signup(String username , String password){

        if (users.containsKey(username)){
            return false ;
        }

        Users newUser = new Users(username, password) ;
        users.put(username, newUser);
        return true ;

    }

    public boolean logout() {

        if (currentUser == null) {
            return false;
        }
        currentUser = null;
        return true;
    }

}
