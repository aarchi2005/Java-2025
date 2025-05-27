import java.util.*;
public class expection {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value of a:");
       int a =in.nextInt();
       Scanner i =new Scanner(System.in);
       System.out.println("enter the value of b:");
       int b = i.nextInt();
          //101Scanner i = new Scanner(System.in);
         try {
            int c =a/b;
            System.out.println(c);
            
         } catch (Exception e) {
            System.out.println(" we can divide zero");
         }
System.out.println("hello");
System.out.println("hii");
System.out.println("byeee");
    }
    
}
