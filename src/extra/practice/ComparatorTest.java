package extra.practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ComparatorTest {
    public static void main(String[] args) {

        List<Integer> numList1 = Arrays.asList(12, 23, 54, 123, 34, 22, 88, 999);

        //Ascending Order
        numList1.sort( (num1,num2) -> num1.compareTo(num2));

        System.out.println(numList1);

        //Descending Order
        numList1.sort( (num2,num1) -> num1.compareTo(num2));

        System.out.println(numList1);


        List<Integer> oddNums = Stream.of(1,2,3,4,5).filter( p -> p%2 == 0).collect(Collectors.toList());
        System.out.println(oddNums);

        List<Integer> numList3 = Arrays.asList(23, 54, 123, 34, 22, 88, 999);
        
        // the total sum of the items in the numList3
        Integer sum = numList3.stream().reduce(0, (num1, num2) -> num1 + num2);
        System.out.println("sum = " + sum);

        Integer max = numList3.stream().reduce(0, (num1, num2) -> num1 > num2 ? num1 : num2);
        System.out.println("max = " + max);

        Optional<Integer> maxOptional = numList3.stream().reduce(Integer::max);
        System.out.println("maxOptional = " + maxOptional);

    }
}
