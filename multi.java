class MyThread extends Thread{
    public void run(){
        System.out.println("helllo");
       try {
        Thread.sleep(3000);
       } catch (Exception e) {
    
       }
       System.out.println("hii");
    }
}

public class multi {
    public static void main(String[] args) {
        {
            MyThread t1= new MyThread();
            t1.start();
           // System.out.println("hii"); // in threads first main thread program run

        }
    }
}
