package extra;

import java.util.Arrays;

public class SwitchingTheNegativesToBeginning {

    /*
        Array original = [-1, 1, 3,-4, 7, -2, 1]
        Array target =   [-1,-4,-2, 1, 3, 7, 1]
    */
    public static void main(String[] args) {

        int[] arr = new int[]{-1, 1, 3, -4, 7, -2, 1, -5, 9, -10};
        int[] resultArr = new int[arr.length];

        for (int i = 0, j = 0, k = arr.length - 1, l = arr.length - 1; i < arr.length && k >= 0; i++, k--) {

            if (arr[i] < 0) resultArr[j++] = arr[i];

            if (arr[k] > 0) resultArr[l--] = arr[k];

        }

        System.out.println(Arrays.toString(resultArr));
    }
/*
        for(int k = arr.length-1,l=arr.length-1; k >= 0 ; k--){
            if(arr[k] > 0){
                resultArr[l--] = arr[k];
            }
        }
        System.out.println(Arrays.toString(resultArr));
    }

 */
}
