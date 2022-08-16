package src;

import java.awt.*;

abstract public class Shape implements Drawable{
    private int x;
    private int y;
    private String color;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Shape(int x, int y, String c){
        this.x = x;
        this.y = y;
        this.color = c;
    }
    public Shape(int x, int y){
        this.x = x;
        this.y = y;
    }
    public double getArea(){
        return x*y;
    }
    public double getCircumference(){
        return 2*(x+y);
    }
    public String toString(){
        return "X Coordinate: "+x +" Y Coordinate: " + y+ " Color: "+color +" Circumference: "+getCircumference()+ " Area: "+getArea();
    }

    @Override
    public void draw(Graphics x) {

    }
}
