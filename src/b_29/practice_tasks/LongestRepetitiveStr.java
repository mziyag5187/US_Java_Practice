package b_29.practice_tasks;

public class LongestRepetitiveStr {

    /*
     ======= Longest Repetitive Substring -- Real Interview Task ====
    Write a program if some substring K that can be repeated N>1 times to produce the input
     string exactly as it appears.
    Your program should return longest substring K, and
    if there is none it should be return "There is no repetitive substring"

    For Example
           str ="abcababcababcab"             output should be abcab
           str ="abcdefabcdef"                output should be abcdef

           str ="abcdefabcdefabcdefabcdef"     output should be abcdefabcdef
           str ="abcdefxabcdef"           output should be "There is no repetitive substring"
 */
    public static void main(String[] args) {

        String str = "abcdefabcdefabcdefabcdef";

        String longestOne = "";

        for (int i = 0; i < str.length()/2 ; i++) {

            longestOne += str.charAt(i);

            if (str.split(longestOne).length == 0 ) {
                System.out.println(longestOne + " is the Longest Repetitive Substring in " + str);
                return;
            }

        }

        System.out.println("There is no repetitive substring");


    }


}
