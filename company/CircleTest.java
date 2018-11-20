package com.company;

public class CircleTest {

    public static void main(String[] args) {
        Circle o1 = new Circle(0,0,5);
        o1.printCircle();
        o1.changeCoord(10,10);
        o1.printCircle();
        o1.changeRadius(5);
        o1.printCircle();
    }
}