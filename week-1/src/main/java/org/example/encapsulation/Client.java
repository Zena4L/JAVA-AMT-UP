package org.example.encapsulation;


public class Client {
    public static void main(String[] args) {
        Outter outerObj = new Outter(10);
        Outter.Inner innerObj = outerObj.new Inner(20);

        innerObj.innerMethod();
        innerObj.accessOuterData();

    }


}
