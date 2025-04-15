import  java.util.*;
public class acii {
    
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;

        System.out.println("enter the char :");
        char ch = in.next ().charAt(0);
         if (ch >=  'a' && ch<= 'z'){

         

   System.out.println(ch );

         }
         else if (ch >='A' && ch<='Z') {
            System.out.println(ch);

         }

else {
    System.out.println("not vaild ");
}
}
}
