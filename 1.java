import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        String secret = "secret";

        while(true){
            System.out.println("Type the password");
            String password = reader.nextLine();

            if(password.equals(secret)){
                System.out.println("Right");
                break;
            } else{
                System.out.println("Wrong");
                System.out.println("Try again!");
            }

        }

        System.out.println("The secret is " + secret);

    }
}
