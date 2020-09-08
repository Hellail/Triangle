package com.company;

import java.util.StringJoiner;

public class MyPoint {
    private int x;
    private int y;


    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY() {
        return new int[]{getX(), getY()};
    }

    public void setXY(int x, int y) {
        setX(x);
        setY(y);
    }

    public double getDistance(int x, int y) {
        return Math.sqrt(((this.x - x) * (this.x - x)) + ((this.y - y) * (this.y - y)));
    }

    public double getDistance(MyPoint point) {
        if (point != null) {
            return Math.sqrt(((this.x - point.x) * (this.x - point.x)) + ((this.y - point.y) * (this.y - point.y)));
        }
        return 0;
    }
    public double getDistance() {
        return Math.sqrt((this.x * this.x) + (this.y * this.y));
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", MyPoint.class.getSimpleName() + "[", "]")
                .add("x=" + x)
                .add("y=" + y)
                .toString();
    }
}
