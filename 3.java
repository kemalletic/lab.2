import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int sum = 0;

    while(true) {
      System.out.println("Enter a number: ");
      int num = Integer.parseInt(reader.nextLine());

      if(num == 0) {
        break;
      } else {
        sum += num;
      }
    }

    System.out.println("The sum is: " + sum);
  }
  
}