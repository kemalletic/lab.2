
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);

        int sum=0;
        int read=0;

        while(read < 3) {
            System.out.print("Enter number: ");
            int num = Integer.parseInt(reader.nextLine());
            sum += num;
            read++;
          }
          System.out.println("The sum is: " + sum);

      
    }

    
}