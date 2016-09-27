package com.kmourad.hb_exemple;

/**
 * Created by Human Booster on 26/09/2016.
 */

public class Square extends Rectangle {

    public Square(double cote){
        super(cote, cote);
    }

    public double computeArea(){
        area = height * height;
        return area;
    }
}
