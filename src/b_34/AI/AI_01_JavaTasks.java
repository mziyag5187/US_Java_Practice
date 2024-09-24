package b_34.AI;

public class AI_01_JavaTasks {

    public static void main(String[] args) {

        // Create code fragment that reverses given array and returns it
        int[] arr = {1, 2, 3, 4, 5};
        int[] reversedArray = reverseArray(arr);
        for (int i : reversedArray) {
            System.out.print(i + " ");
        }

        System.out.println(System.getenv("userName"));


    }

    // provide reverseArray() implementation with required codes
    public static int[] reverseArray(int[] arr) {
        // Your implementation here
        int[] reversedArr = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArr[j] = arr[i];
        }
        return reversedArr;
    }





}
