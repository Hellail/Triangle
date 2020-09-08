package com.company;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    public MyTriangle(int x1,int y1, int x2, int y2 , int x3 , int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }

    public double getPerimeter () {
        return v1.getDistance(v2) + v2.getDistance(v3) + v3.getDistance(v1);
    }

    public TriangleType getType() {
        double a = v1.getDistance(v2);
        double b = v2.getDistance(v3);
        double c = v3.getDistance(v1);
        double accuracy = 0.000001;
        if (Math.abs(a - b) < accuracy && Math.abs(b - c) < accuracy) {
            return TriangleType.EQUILATERAL;
        }
        if ((Math.abs(a - b) < accuracy && !(Math.abs(b - c) < accuracy)) ||
                (!(Math.abs(a - b) < accuracy) && Math.abs(b - c) < accuracy)) {
            return TriangleType.ISOSCELES;
        }
        return TriangleType.SCALENE;
    }


}

