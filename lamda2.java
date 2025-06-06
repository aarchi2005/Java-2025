import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.*;

public class lamda2 {
    public static void main(String[] args) {
        List <Integer> list =Arrays.asList(2,8,5,12, 45,38 ,89,10);
        List<Integer> oddList =list .stream()
                                   .filter(n-> n%2!=0)
                                   .collect(Collectors.toList());
                                   System.err.println(oddList);
           List<Integer> evenList =list .stream()
                                   .filter(n-> n%2==0)
                                   .collect(Collectors.toList());
                                   System.err.println(evenList);
                                   
                        

    }
}
