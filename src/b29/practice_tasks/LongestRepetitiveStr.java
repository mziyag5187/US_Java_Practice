package b29.practice_tasks;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

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

        String str = "abcdefxabcdef";

        String partialStr = "";

        for (int i = str.length()/2,j=0; i >= 0; i--,j++) {
            char letter = str.charAt(j);

            partialStr += letter;

            if (str.split(partialStr).length == 0) {
                System.out.println(partialStr + " is the Longest Repetitive Substring in " + str);
                return;
            }

        }

        System.out.println("There is no repetitive substring");


    }


}
