 import java.util.*;
 public class vowel {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("enter the char :");
        char p =in.next().charAt(0);
         switch(p)
        {
          case 'a':
          case 'e':
          case 'i':
          case 'o':
          case 'u':

          System.out.println("vowel");
          break;

         
        default: 
            System.out.println("consonant ");
        }

    
    }
}
