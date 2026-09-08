package ma.youcode.lineperm.ui;

import java.util.*;
import ma.youcode.lineperm.service.AuthService;

public class ConsoleApp {

    public void LoadApp() {

        AuthService service = new AuthService();

        String choixDeUser;
        String choix = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("============================================================");
        System.out.println("LinePermission: gestion des fichiers et permissions");
        System.out.println("============================================================");
        System.out.println("Non connecter. Commandes : signup | login | logout | exit");

        do {

            System.out.print("lineperm> ");

            choixDeUser = scanner.nextLine();

            choix = choixDeUser.trim().toLowerCase();

            switch (choix) {

                case "signup":

                    System.out.println(" ===================== SIGN UP ===================== ");
                    System.out.print("Username : ");
                    String username = scanner.nextLine();

                    System.out.print("Password : ");
                    String password = scanner.nextLine();

                    boolean signupResult = service.signup(username, password);

                    if (signupResult) {
                        System.out.println("Compte cree");
                    } else {
                        System.out.println("Username utilise");
                    }

                    break;

                case "login":
                    
                    System.out.println(" ===================== Login ===================== ");
                    System.out.print("Username : ");
                    String loginUsername = scanner.nextLine();

                    System.out.print("Password : ");
                    String loginPpassword = scanner.nextLine();

                    boolean loginResult = service.login(loginUsername, loginPpassword);
                    if (loginResult) {
                        System.out.println("connexion");
                    } else {
                        System.out.println("Error !");
                    }
                
                break;

                case "logout":
                
                    boolean logoutResult = service.logout();

                    if (logoutResult) {
                        System.out.println("deconnexion");
                    } else {
                        System.out.println("Personne n'est connectee");
                    }
                            
                break;

                case "exit":
                    break;

                default:
                    System.out.println("Commande inconnue");
                    break;
            }

        } while (!choix.equals("exit"));

        System.out.println("Au revoir !");
    }
}