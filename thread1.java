class myThread extends Thread{
    public void  run(){
        for(int i=1; i<10; i++){
            System.out.println(getName() + " priority ");
            Thread.yield();

        }
    }
}
public class thread1 {
    public static void main(String[] args) {
             MyThread  t1= new MyThread();
             MyThread t2 = new MyThread();
             t1.setName("low");
             t2.setName("HIgh");
             t1.setPriority(Thread.MIN_PRIORITY);
             t2.setPriority(Thread.MAX_PRIORITY);

             t1.start();
             t2.start(); 
             
             
    }//thread priority
}
