public class threa {
    public static void main(String[] args) {
        System.out.println("hy aarchi....");
        Thread t1 = new Thread(()->{
            System.out.println("helllo");
            try {
                System.out.println("how are you ");
            } catch (Exception e) {
                // TODO: handle exception
            }
        });
        
Thread t2 = new Thread(()->{
    System.out.println("hiii..");
});
t1.start();
t2.start();


    }
}