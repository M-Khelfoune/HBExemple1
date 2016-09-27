package com.kmourad.hb_exemple;

/**
 * Created by Human Booster on 26/09/2016.
 */

public class Ellipse extends Shape{
    protected double smallRay;
    protected double largeRay;

    public Ellipse(double smallRay, double LargeRay){
        this.smallRay = smallRay;
        this.largeRay = largeRay;
    }

    public double computeArea(){
        area = Math.PI * (smallRay) * (largeRay);
        return area;
    }
}
