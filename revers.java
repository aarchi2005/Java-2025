public class revers {
    public static void main(String[] args) {
        int num =1234;
        int reved = 0;
         while ( num !=0){
            int digit = num %10;
            reved =reved *10+digit ;
           num =num/10;

         }
System.out.println("reverse "+ reved);
    }
}
