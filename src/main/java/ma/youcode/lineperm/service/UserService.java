package ma.youcode.lineperm.service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;

public class UserService{

    HashMap<String , String> user = new HashMap<>();
    Path file = Path.of("src/main/resources/users.txt");
    public UserService(){
        loadUser();
    };

    public void loadUser(){

        if(!Files.exists(file)){
            return ;
        }

        try {
            List<String> list = Files.readAllLines(file);

            for (int i= 0 ; i< list.size() ; i++){

                String[] listeSplit = list.get(i).split(":" , 2);

                if(listeSplit.length == 2){
                    String username = listeSplit[0];
                    String passwordHash = listeSplit[1];
                    user.put(username, passwordHash);

                }


            }

        } catch (Exception e) {
            System.out.println("Erreur lors du chargement des utilisateurs.");
        }
    }

}