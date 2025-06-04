class MyRunnable implements Runnable{
 public void run (){
    System.out.println("thred using runnable inter face");
 }
}
public class thread2 {
    public static void main(String[] args) {
    MyRunnable obj = new MyRunnable();
    Thread t1 = new Thread(obj);
    t1.start();
    try {
        t1.join();
    } catch (Exception e) {
        // TODO: handle exception
        e.printStackTrace();
    }
    for(int i =1; i<5; i++)
    {
        System.out.println(i);
    }
    System.out.println("main thread is runing ");
}
}
