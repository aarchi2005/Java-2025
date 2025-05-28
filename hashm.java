import java .util.HashMap;
public class hashm {
    public static void main(String[] args) {
        String str ="prograaming";
        char [] ch = str.toCharArray();
        HashMap<Character ,Integer>map=new HashMap<>();
      for (char i :ch){
        map.put(i,map.getOrDefault(i, 0)+1);
      }
System.out.println(map);

    }
}
