package ss7_AbstractClass_Interface.bt.modle;

import ss7_AbstractClass_Interface.bt.Colorable;
import ss7_AbstractClass_Interface.bt.Resizeable;

public class Square extends Geometric implements Colorable , Resizeable {
    private double side ;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side ;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
    @Override
    public void resze( double percent){
        side *= (1 + percent / 100);
    }
    @Override
    public void howToColor(){
        System.out.println(" Color all four sides ");
    }
}
