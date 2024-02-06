package com.exercise;

class Shape {
    int length;
    int breadth;

    Shape() {

    }

    public Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    protected   double area() {
       return  this.length * this.breadth;
    }
}