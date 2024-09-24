package AI;

public class TabnineCoding {

    // Create a method that can reverse an array and return it
    public static int[] reverseArray(int[] arr) {
        int[] reversedArr = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArr[j] = arr[i];
        }
        return reversedArr;
    }

}