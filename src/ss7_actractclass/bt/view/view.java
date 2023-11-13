package ss7_actractclass.bt.view;

import ss7_actractclass.bt.Colorable;
import ss7_actractclass.bt.Resizeable;
import ss7_actractclass.bt.modle.Cricle;
import ss7_actractclass.bt.modle.Geometric;
import ss7_actractclass.bt.modle.Rectangle;
import ss7_actractclass.bt.modle.Square;

public class view {
    public static void main(String[] args) {
        Cricle circle = new Cricle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Square square = new Square(4);
        System.out.println("Diện tích ban đầu:");
        System.out.println("Circle: " + circle.getArea());
        System.out.println("Rectangle: " + rectangle.getArea());
        System.out.println("Square: " + square.getArea());
        resizeAndPrint(circle);
        resizeAndPrint(rectangle);
        resizeAndPrint(square);
        // test interface colorable
        Geometric[] geometricObjects = {square};

        for (Geometric object : geometricObjects) {
            System.out.println("Diện tích: " + object.getArea());

            if (object instanceof Colorable) {
                Colorable colorable = (Colorable) object;
                colorable.howToColor();
            }
        }

    }
    public static void resizeAndPrint(Resizeable shape) {
        double percent = Math.random() * 100 + 1;
        shape.resze(percent);
        System.out.println("Diện tích sau khi tăng kích thước " + percent + "%:");
    }

}
