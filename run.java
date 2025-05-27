 interface walkable  {
    void walk();
 }
 interface runnable {
    void run();

 }
class human  implements walkable ,runnable{
    public void  walk (){
        System.out.println("walking ");
    }

 public void run(){
    System.out.println("running ");
}
    
}
public class run {
    public static void main(String[] args) {
        human obj = new human();
        obj.walk();
        obj.run();

    }
}

