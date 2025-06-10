import java.util.Arrays;
import java.util.List;

public class minmax {
    public static void main(String[] args) {
    List<Integer> list =Arrays.asList(5,10,15,20,35);

int sum  =list.stream().reduce(10,9, null)
    System.out.println(sum);
    }
}
