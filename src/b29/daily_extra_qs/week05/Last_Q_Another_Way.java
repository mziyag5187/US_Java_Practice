package b29.daily_extra_qs.week05;

public class Last_Q_Another_Way {

    public static void main(String[] args) {

        String name = " Zack Boris ";

        //FIRST WAY
        name = name.toUpperCase().trim();
        System.out.println(name.charAt(0) + "." + name.charAt( name.indexOf(" ")+1 ) + ".");








        System.out.println("==========================");
        // SECOND WAY
        name = name.trim();
        name = (name.charAt(0)+"").toUpperCase() + "." + (name.charAt(name.indexOf(" ")+1)+"").toUpperCase() + ".";
        System.out.println(name);

    }
}
