package org.example;

public class Wall {
private double width;
private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width >= 0 ? width : 0;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height >= 0 ? height : 0;
    }

    public Wall(double width, double height) {
        this.setHeight(height);
        this.setWidth(width);
    }
    public double getArea(){
        return this.width * this.height;
    }
}
