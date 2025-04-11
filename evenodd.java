 import java.util.*;
 public class evenodd {
 
    public static void main(String[] args) {
        Scanner in =new  Scanner(System.in);


        System.out.println("enter the value of a:");
        int a= in.nextInt();
        if( a%2==0)
    {
        System.out.println("even");
    }
else {
    System.out.println("odd");
}
    }
 }