package com.company;

public class Circle {
    public float x,y,r;
    public void printCircle() {
        System.out.println("Окружность с центром ("+x+";"+y+") и радиусом "+r);
    }
    public void changeCoord(float a, float b) {
        x = x + a;
        y = y + b;
    }
    public void changeRadius(float k) {
        r = r + k;
    }
    public Circle (float xx, float yy, float rr){
        x = xx;
        y = yy;
        r = rr;
    }
}