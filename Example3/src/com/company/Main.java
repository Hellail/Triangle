package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
         MyPoint a1 = new MyPoint(0,0);
         MyPoint a2 = new MyPoint(3,6);
         MyPoint a3 = new MyPoint(6,0);

         MyTriangle triangle = new MyTriangle(a1,a2,a3);
         MyTriangle triangle2 = new MyTriangle(0,0,3,6,6,0);

        System.out.println(triangle.getPerimeter());
        System.out.println(triangle2.getPerimeter());
        System.out.println(triangle2.getType());
        System.out.println(a2.getDistance());

    }
}
