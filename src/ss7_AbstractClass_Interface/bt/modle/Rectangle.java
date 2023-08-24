package ss7_AbstractClass_Interface.bt.modle;

import ss7_AbstractClass_Interface.bt.Resizeable;

public class Rectangle extends Geometric implements Resizeable {
    private double height ;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double heigth,double width) {
        this.height = height;
        this. width = width;
    }

    public double getLength() {
        return height;
    }

    public void setLength(double length) {
        this.height = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width ;
    }

    @Override
    public double getPerimeter() {
        return ( height + width ) * 2;
    }

    @Override
    public void resze(double percent) {
        width *= (1 + percent / 100);
        height *= (1 + percent / 100);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height =" + height +
                ", width =" + width +
                '}' + " Area = " + super.getArea() + " Perimeter = " + super.getPerimeter();
    }
}
