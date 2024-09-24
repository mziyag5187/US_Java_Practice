package self_practice.stream;

import java.util.Arrays;

public class ReduceMethod {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, -1, 4, 5,11};

        int max = Arrays.stream(numbers).reduce(Integer::max).getAsInt();
        int min = Arrays.stream(numbers).reduce(Integer::min).getAsInt();

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
        
        int sum = Arrays.stream(numbers).reduce(Integer::sum).getAsInt();
        System.out.println("sum = " + sum);

        // reduce() -> normal syntax
        int max2 = Arrays.stream(numbers).reduce((a,b) -> a > b ? a : b ).getAsInt();
        System.out.println("max2 = " + max2);
        
        int sum2 = Arrays.stream(numbers).reduce((a,b)->a+b).getAsInt();
        System.out.println("sum2 = " + sum2);

    }
}
