import java.util.HashMap;
public class hash {
    public static void main(String[] args) {
        HashMap<Integer,Integer>map =new HashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 4);
       map.forEach((key,value)-> {
     System.out.println( key + " "+ value);
 } );

    }
}
    

