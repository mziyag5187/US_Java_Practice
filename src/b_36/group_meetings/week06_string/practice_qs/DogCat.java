package b_36.group_meetings.week06_string.practice_qs;

public class DogCat {
    public static void main(String[] args) {

        String str = "Dog Cat";

        str.replace("Cat","Dog");
        str.replaceFirst("Dog","Tiger");

        System.out.println(str.endsWith("Dog"));
        System.out.println(str.startsWith("Dog"));


    }
}
