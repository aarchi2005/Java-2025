 interface  Client1 {
    void show();     
    }
    interface Client2 {
    void show();
    void print();
    }
    class  Inter implements Client1 ,Client2{

        public void show(){
            System.out.println("for both");
        }
    public void print(){
        System.err.println("for ");
    }
    }
    public class In{ 
        public static void main (String [] argss){
         Inter   obj=new Inter();
            obj.print();
            obj.show();
        }
    }        