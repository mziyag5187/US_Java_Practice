package b_29.group_meetings.week18_Abstraction.Kahoot_Qs;

public abstract class A {
     abstract void m1();
     void m2(){
         System.out.println("One");
     }
}

class B extends A {

    @Override
    void m1() {

    }

    void m2(){
        System.out.println("Two");
    }
}

class Test{
    public static void main(String[] args) {
        B b = new B();
        b.m2();
    }
}
