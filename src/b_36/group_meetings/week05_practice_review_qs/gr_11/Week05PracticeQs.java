package b_36.group_meetings.week05_practice_review_qs.gr_11;

public class Week05PracticeQs {
    public static void main(String[] args) {

//P-3
        /*boolean b1, b2;
        String s1="1", s2;
        double d1, d2;
        int i1; int i2;
        int i3; i4;*/


//P-9
        /*System.out.println(1 + 25 + 2 + "aws");   //28aws
        System.out.println(1 + "aws" + (2 + 4)); //1aws6
        System.out.println('a' + 'w' + 's');    //(97+119+115)=331
        System.out.println('w' + " " + 's');   //w s
        System.out.println('w' + "" + 's');   //ws
        System.out.println('w' + 's');       //234
        System.out.println('w');            //w*/


//P-11
        /*boolean t=true;
        boolean t2=true;
        boolean f=false;
        System.out.println(t^f); //true
        System.out.println(t^t2); //false
        //The XOR logical operation, exclusive OR, takes two boolean operands and returns true if, and only if, the operands are different. Conversely, it returns false if the two operands have the same value.*/




//P-13
        /*System.out.println(8+12*(6-2));  //8+12*(4)  ->  8+48  ->=56
        System.out.println((4+17)%(2+7)/3); //21%9/3 ->  3/3   ->=1*/


//P-16
        /*int x = 4;
        int y = x * 4 - x++;
        System.out.println(y);
        System.out.println(x);*/


    //P-17
        /*int i=11, j=4;
        int res=i++ + --j;
        System.out.println("res = " +  res);*/


//P-18
        /*boolean x= true;
        System.out.println(!x);*/


    //P-19
        /*int a = 100;
        a -= 20 * 2; //a = a-20*2  --> 100-40  --> 60
        System.out.println(a);
       //a += a; -> a= a+a;
       //a *= a; -> a= a*a;*/


//P-21
        /*int b = 2;
        boolean res = ++b == 2 || --b == 2 && --b == 2;  // false || true && false = false
        System.out.println(res);*/


//P-23
        /*int x= 1;
        System.out.println((x>4) && (++x==4));
        System.out.println(x);
        System.out.println((x>4) & (++x==4));
        System.out.println(x);*/


//P-25
        /*int apples = 20;
        int oranges = 30;
        int pears = 30;
        boolean comp = apples < oranges || oranges >= pears; //true || true = true
        System.out.println(comp);*/


//P-27
        /*String weather="shiny";
        int degree=70;
        boolean comp2=(!(weather=="rainy" || degree==70)); //false || true= true --> !true= false
        System.out.println(comp2);*/


//P-30
        /*int watermelon=40;
        boolean numWatermelon=false;
        if (watermelon>=20){
            System.out.println("I have more");
            numWatermelon=true;
        }

        if (numWatermelon){
            System.out.println("good job");
        }

        if (numWatermelon==false){
            System.out.println("I need more");
        }*/



//P-32
        /*boolean x= true;
        if (x==false){
            System.out.println("one");
        } else if (x == false != true) { // [(true == false) -> false] --> [false != true] -> true
            System.out.println("two");
        } else if (x == true) {
            System.out.println("three");
        } else if (x == !false){
            System.out.println("four");
        }*/


//P-34
        /*int x =9;
        if (++x<10){        //10<10=false
            System.out.println(x + " Hello World");
        }else {
            System.out.println(x + " Hello Universe!");
        }*/


//P-36
        /*double z = 10;   //can NOT use {float, double, long and boolean} with switch, compile error
        switch ( z) {
            case 10: System.out.println("Monday");
            case 11: System.out.println("Tuesday");
            case 12: System.out.println("Wednesday");
            default: System.out.println("Friday");
        }*/


//P-38
        /*String stuff = "TV";
        String res = "";
        res = stuff.equals("TV") ? "walter" : stuff.equals("movie") ? "white" : "no result";
        System.out.println(res);*/


//P-40
        /*boolean b = true; //can NOT use float, double, long and boolean with switch, compile error
        switch (b) {
            case true:
                System.out.println("Monday");
            case false:
                System.out.println("Tuesday");
            default:
                System.out.println("Wednesday");
        }*/











        /*boolean x, z = true;
        int y = 20;
        x = (y != 10) || (z = false);
        System.out.println(x);
        System.out.println(z);*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scanner.nextLine();
        if (word.endsWith("ly")) {
            System.out.println("Really???");
        } else {
            System.out.println("Never mind");
        }
        scanner.close();*/
        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String str = input.nextLine();

        if (str.length() >= 1) {
            char f = str.charAt(0);
            if (f >= '0' && f <= '9') {
                System.out.println("first character is digit");
            } else if (f >= 'A' && f <= 'Z') {
                System.out.println("first character is uppercase letter");
            } else if (f >= 'a' && f <= 'z') {
                System.out.println("first character is lowercase letter");
            } else {
                System.out.println("first character is special character");
            }
        } else {
            System.out.println("String is empty");
        }*/

 /*double d =(double)(7)/2;
        double e =(double)(7/2);
        int i = (int)(7.8+(double)(15)/2);
        System.out.println(d);
        System.out.println(e);
        System.out.println(i);*/

    }
}

