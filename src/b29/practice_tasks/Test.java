package b29.practice_tasks;

import java.util.Arrays;
import java.util.Collections;

public class Test {

    public static void main(String[] args) {

        String str = "abcabc";

        String[] array = str.split("abc");

        System.out.println(Arrays.toString(array));
    }
}
