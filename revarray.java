import java.util.*;
public class revarray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of array :");
        int a =in.nextInt();
int []  arr = new int[a];
System.out.println("enter the value of array :");
for (int i =0; i<a;i++ )
{
    for ( int j =i; j>=i; j++){
        arr[j] =in.nextInt();
    }
    arr[i] = in.nextInt();

}


    }
}
