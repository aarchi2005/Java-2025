 import java.util.HashMap;
public class frequency {
    public static void main(String[] args) {
        String str2 = " e l l h o";
        String str1 ="h e l l o ";
       String [] newStr = str1.split(" ");
       String [] newstr =str2.split(" ");
        HashMap<String ,Integer>map=new HashMap<>();
        HashMap<String , Integer>fre = new HashMap<>();

      for (String str : newStr){
        map.put(str,map.getOrDefault(str , 0)+1);
        fre.put(str , fre.getOrDefault(str ,0 )+1);
      }
System.out.println(map);
System.out.println(fre);
    }

}
