package extra;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};

        Test test = new Test();
        test.moveZeroes(nums);
    }

    public void moveZeroes(int[] nums) {

        int i = 0;
        int j = nums.length - 1;

        for(int each : nums){
            if(each != 0){
                nums[i++] = each;
            }else{
                nums[j--] = 0;
            }
        }

        System.out.println(Arrays.toString(nums));

    }
}
