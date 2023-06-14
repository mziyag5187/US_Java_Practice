package b29.Test;

abstract class Car {
    abstract void start();
}

class BMW extends Car{
    public void start(){
        System.out.println("BMW starts");
    };
    public void methodOfBMW(){
        System.out.println("BMW own method");
    }
}

class Toyota extends Car{
    public void start(){
        System.out.println("Toyota starts");
    };
}

public class CarDealer{
    public static void main(String[] args) {

        Car car1 = new BMW();
        ((BMW)car1).methodOfBMW();


    }
}