import java.util.*;
public class posneg {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println(" enter the value of a:");
        int a= in.nextInt();
        if (a==0){
         System.out.println("zero ");
    }
   else if(a>0)
   {
    System.out.println("postive");
   }
   else {
    System.out.println("negative");
   }
    }
}