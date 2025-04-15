import java.util.*;// using switch case 
public class calculator {

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a = in.nextInt ();
        System.out.println("enter the value of b");
        int b = in.nextInt();
    System.out.println("enter the operator");
        char  c= in.next().charAt(0);


        switch (c) {
            case '+':
            System.out.println(a+b);
                
                break;
                case '-':
                System.out.println(a-b);
                break;
                case '*':
                System.out. println(a*b);
                break;
                case '/':
                System.out.println(a/b);
                break;
                case '%':
                System.out.println(a%b);
        break;
            default:
            System.out.println("not vaild operator");
                break;
        }

    }
}