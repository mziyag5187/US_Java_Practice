package b29.group_meetings.week09_Arrays.Kahoot_Qs;

import java.util.Arrays;

public class Q_12 {
    public static void main(String[] args) {

        int[] nums = new int[] {1,2,3,89,54,33,2};
        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        System.out.println(Arrays.binarySearch(nums,4));


    }
}
