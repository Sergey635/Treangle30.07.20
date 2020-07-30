package com.company;

public class treangle {
    private float a;
    private float b;
    private float c;

    public treangle(float a, float b, float c) {

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public treangle(float a, float b, double gamma) {
        this.a = a;
        this.b = b;
        this.c = (float) Math.sqrt (a * a + b * b - 2 * a * b * Math.cos(gamma));

    }

    public float getPerimetr(){
        return a + b + c;
    }

    public double getArea(){
        float p = this.getPerimetr() / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }



    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "treangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", area=" + this.getArea() +
                ", Perimetr=" + this.getPerimetr() +
                '}';
    }

    
}
