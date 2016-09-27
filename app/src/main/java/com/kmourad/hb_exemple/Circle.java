package com.kmourad.hb_exemple;

/**
 * Created by Human Booster on 26/09/2016.
 */

public class Circle extends Ellipse{
    public Circle(double ray){
        super(ray, ray);
    }

    public double computeArea(){
        area = Math.PI * smallRay * smallRay;
        return area;
    }
}
