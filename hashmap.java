import java.util.HashMap;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();
        map.put("ido", 12);
        map.put(  "id", 1);
        map.put("hello", 12);
        System.out.println(map);
        System.out.println(map.get("hello"));
        System.out.println(map.get("ii"));
        System.out.println(map.containsKey("hello"));
        System.out.println(map.containsValue(2));
        map.remove("ido");
        System.out.println(map);
}    }

