import java .util.HashMap;
public class hashm {
    public static void main(String[] args) {
        String str1 ="prograaming is a fun and fun is a prograaming";
       String [] newStr = str1.split(" ");
        HashMap<String ,Integer>map=new HashMap<>();
      for (String str : newStr){
        map.put(str,map.getOrDefault(str , 0)+1);
      }
System.out.println(map);

    }
}
