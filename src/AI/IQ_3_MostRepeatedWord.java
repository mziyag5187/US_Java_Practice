package AI;

public class IQ_3_MostRepeatedWord {

    public static void main(String[] args) {
        String text = "hello hello world world java world";
        int mostRepeatedWordCount = mostRepeatedWordCount(text);
        System.out.println("The most repeated word is \"" + mostRepeatedWordCount + "\" times.");
    }

    // write a method including the code lines
    // that finds the most repeated word in the given String
        // and returns its count.
    public static int mostRepeatedWordCount(String s) {
        // please provide the code lines here
        String[] words = s.split("\\s+");
        int maxCount = 0;
        String mostRepeatedWord = "";
        for (String word : words) {
            int count = 0;
            for (String w : words) {
                if (word.equalsIgnoreCase(w)) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostRepeatedWord = word;
            }
        }
        System.out.println("mostRepeatedWord = " + mostRepeatedWord);
        return maxCount;
    }

}
