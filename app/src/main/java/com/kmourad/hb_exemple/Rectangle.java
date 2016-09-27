package com.kmourad.hb_exemple;

/**
 * Created by Human Booster on 26/09/2016.
 */

public class Rectangle extends Shape {
    protected double height;
    protected double width;

    public Rectangle(double height, double widht){
        this.height = height;
        this.width = widht;
    }

    public double computeArea(){
        area = height * width;
        return area;
    }
}
