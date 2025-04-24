import java.util.*;
public class prime {

    public static void main(String[] args) {
        
Scanner in =new Scanner(System.in);
int a=in.nextInt();
int fact =1;

System.out.println("no  is :"+a);
for (int i=1; i <=a;i++)
{
    fact =fact *i;
}

System.out.println("factorial is "+fact);
    }
}
