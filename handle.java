public class handle {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4};
        try {
            System.out.println(arr[8]);
       } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println(e);
       }
        catch(ArithmeticException e)
       {
        System.out.println();
       }
       finally{
       System.out.println("sb thik h");
       }
       System.out.println("hello");
       System.out.println("hii");

    }
}
