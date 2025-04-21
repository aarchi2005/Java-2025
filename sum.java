public class sum {
   public static void main(String[] args) {
    int a=123;
    int original =a;

int res =0;
while(a>0) 
{
    int digit = a%10;
    res = res *10 + digit ;

}

System.out.println(res);
   }     



}
