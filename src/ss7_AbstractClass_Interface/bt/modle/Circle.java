package ss7_AbstractClass_Interface.bt.modle;
import ss7_AbstractClass_Interface.bt.Resizeable;

public class Circle extends Geometric implements Resizeable {
    private int radius ;

    public Circle(int radius) {
        this.radius = radius;
    }
    public Circle() {
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*3.14*radius*radius;
    }

    @Override
    public void resze(double percent) {
        radius *= (1 + percent / 100);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}' + " Area = " + super.getArea() + " perimeter " + super.getPerimeter() ;
    }
}
