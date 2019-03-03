import java.util.Scanner;
public class Whiletest {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int number = 10;
      
      while(number >= 10) {
         System.out.println("Give me a number less than 10");
         number = sc.nextInt();
         
      } 
   }
}