import java.util.Arrays;
import java.util.List;

public class index{
    private static int n;

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(14, 15, 13, 20);
        
        numbers.forEach(x-> System.out.println(x));
        
        int sum = 0;
        for(int n : numbers){
            if (n%2==0) {
                n = n-2;
                sum = sum + n;   
            }  
        }
        System.out.println(sum);
    }
}