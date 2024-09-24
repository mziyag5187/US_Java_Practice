package AI;

public class IQ_2_CountSubsWithDistinctChars {
        /*
    Create a function that can Count of substrings having all distinct characters
    Given a string str consisting of lowercase alphabets, the task is to find the number of possible substrings (not necessarily distinct) that consists of distinct characters only.
        Examples:
            Input: Str = “gffg”
            Output: 6
    Explanation:
        All possible substrings from the given string are,
        ( “g“, “gf“, “gff”, “gffg”, “f“, “ff”, “ffg”, “f“, “fg“, “g” )
        Among them, the highlighted ones ( “g“, “gf“, “f“, “f“, “fg“, “g” ) consists of distinct characters only.

            Input: str = “gfg”
            Output: 5
    Explanation:
        All possible substrings from the given string are,
        ( “g“, “gf“, “gfg”, “f“, “fg“, “g” )
        Among them, the highlighted ( “g“, “gf“, “f“, “fg“, “g” ) consists of distinct characters only.
     */

    public static int countDistinctSubstrings(String str) {
        // Provide the required codes for the task of this method
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String sub = str.substring(i, j);
                if (isDistinct(sub)) {
                    count++;
                }
            }
        }
        return count;
    }

    // complete the task by creating the isDistinct() method above
    private static boolean isDistinct(String str) {
        // Implement your logic here to check if a given string has all distinct characters


        return true; // Placeholder return value
    }
}
