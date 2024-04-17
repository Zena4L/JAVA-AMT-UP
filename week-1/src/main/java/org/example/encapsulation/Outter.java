package org.example.encapsulation;

public class Outter {
    private Integer outerData;

    public Outter(Integer outerData) {
        this.outerData = outerData;
    }

    public void outerMethod() {
        System.out.println("Outer Method");
    }

    class Inner {
        private Integer innerData;


        public Inner(Integer innerData) {
            this.innerData = innerData;
        }

        public void innerMethod() {
            System.out.println("Inner Method");
        }

        public void accessOuterData() {
            System.out.println("Outer Data from Inner Class: " + outerData);
        }
    }

}
