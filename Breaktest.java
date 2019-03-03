public class Breaktest {
   public static void main(String[] args) {
      int number = 1;
      
      while(number <=100) {
         System.out.println(number);
         if(number == 50) {
            break;
   
         }
         number = number + 1;
      }
      
      System.out.println("Final number:" + number);
   
   }
}