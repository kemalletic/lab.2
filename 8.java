import java.util.Scanner;
import java.util.Random;

public class Main {
    public static int drawNumber(){
        Random rand = new Random();
        return rand.nextInt(100);
  }
  public static void main(String args[]) {
      Scanner reader = new Scanner(System.in);
      int randomInt = drawNumber();
      int counter = 0;

      while(true) {
        System.out.print("Guess the number: ");
        int num = Integer.parseInt(reader.nextLine());

        if(num == randomInt) {
          System.out.println("Congratulations, your guess is correct!");
          break;
        } else if(num > randomInt) {
          counter++;
          System.out.println("The number is lesser, guesses made: " + counter);
        } else if(num < randomInt) {
          counter++;
          System.out.println("The number is greater, guesses made: " + counter);
        }
      }
  }
}