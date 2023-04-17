import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();
        ArrayList<Character> list3 = new ArrayList<>();

        for (char each : str.toCharArray()) {
            if(Character.isDigit(each)){
                list1.add(Character.valueOf(each));
            }else if (Character.isLetter(each)){
                list2.add(each);
            }else{
                list3.add(each);
            }

        }

        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        System.out.println("list3 = " + list3);


        ArrayList<Integer>  numsArrList = new ArrayList<>();

        int[] numArr = {1,2,3,4};

        numsArrList.add(Integer.valueOf(numArr[0]));
        numsArrList.add(numArr[1]);
        numsArrList.add(numArr[2]);

        System.out.println("numsArrList = " + numsArrList);


    }
}
