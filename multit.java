class filedowload extends Thread{
    String  filename;
    public filedowload (String filename)
    {
        this.filename = filename;

    }
    public void run (){
        for(int i =1; i<5;i++){
            System.out.println(filename + " " + " dowloading " + (i*20 ) + "%");
        }
        try {
        Thread.sleep(2000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println(filename + " done" );
    }

public class multit {
    public static void main(String[] args) {
        
    }
}
}
