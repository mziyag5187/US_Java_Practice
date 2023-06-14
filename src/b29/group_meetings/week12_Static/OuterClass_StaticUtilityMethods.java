package b29.group_meetings.week12_Static;

import java.util.ArrayList;
import java.util.Collections;

public class OuterClass_StaticUtilityMethods {

    static class Inner{} // it is valid for Java but not a common practice

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(3);
        nums.add(8);
        System.out.println(nums);

        Collections.sort(nums); // sort() is a static method of Collections utility class
        System.out.println(nums);

        String str = "Zack";
        System.out.println(str.length());


    }




}
