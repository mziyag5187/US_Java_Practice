package extra.leetcode;

import java.util.Arrays;

public class TwoSumInArray {
    /*
    Input:   nums = [2,7,11,15], target = 9
            Output: [0,1] // includes the indexes of two items that sum up to target int number
    */
    public static void main(String[] args) {
        int[] nums = {33, 2, 7, 11, 15, 34};
        int[] resultArr = twoSum(nums, 67);
        System.out.println(Arrays.toString(resultArr));
    }

    public static int[] twoSum(int[] nums, int target) {

        int[] twoItem = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    twoItem[0] = i;
                    twoItem[1] = j;
                    break;
                }
            }
        }
        return twoItem;
    }
}



