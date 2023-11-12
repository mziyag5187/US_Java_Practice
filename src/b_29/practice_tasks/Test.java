package b_29.practice_tasks;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        String str = "abcabc";

        String[] array = str.split("abc");

        System.out.println(Arrays.toString(array));
    }
}
