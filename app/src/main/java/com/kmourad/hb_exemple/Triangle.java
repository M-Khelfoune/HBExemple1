package com.kmourad.hb_exemple;

/**
 * Created by Human Booster on 26/09/2016.
 */

public class Triangle extends Shape {
    protected  double height;
    protected  double base;

    public Triangle(double height, double base){
        this.height = height;
        this.base = base;
    }

    public double computeArea(){
        area = height * base;
        return area;
    }
}
