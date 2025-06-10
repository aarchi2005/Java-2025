import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class iteration {
    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(5,10,45,19,23);
        int sum = list.stream().reduce(10, (a,b)->a+b);
    System.out.println(sum);}
}
