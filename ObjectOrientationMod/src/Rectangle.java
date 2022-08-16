package src;

import java.awt.*;

public class Rectangle extends Shape implements Drawable{
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public Rectangle(int x, int y, int width, int height){
        super(x,y);
        this.width=width;
        this.height=height;
    }
    public double getArea(){
        return width*height;
    }
    public double getCircumference(){
        return 2*(width+height);
    }
    public String toString(){
        int x = getX();
        int y = getY();
        return "X Coordinate: "+ x +" Y Coordinate: " + y +" Width: " + width +" Height: "+height +" Circumference: "+getCircumference()+" Area: "+getArea();
    }
    public void draw(Graphics x){
        super.draw(x);
        x.drawRect(getX(),getY(),getWidth(),getHeight());
    };
}
