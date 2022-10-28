import java.util.Scanner;

public class Main {
    public static void printText(){
        System.out.println("In thebeginning there were the swamp, the hoe and Java.");
    }
    public static void main(String[] args) {
      Scanner reader = new Scanner(System.in);
  
      System.out.print("How many times to print the text: ");
      int num = Integer.parseInt(reader.nextLine());
  
      while(num >= 0) {
        printText();
        num--;
      } 

    }

    }
    