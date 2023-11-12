package b_29.Test;

import java.util.Arrays;
import java.util.List;

public class StreamTest {
    public static void main(String[] args) {

        List<String> nameList = Arrays.asList("Zack", "Zola","Max","Mona");

        boolean m = nameList.stream().anyMatch(p -> p.startsWith("X"));

        System.out.println("m = " + m);


    }
}
