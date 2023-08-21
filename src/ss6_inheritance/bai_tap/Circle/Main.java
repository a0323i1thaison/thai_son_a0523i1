package ss6_inheritance.bai_tap.Circle;

public class Main {
    public static void main(String[] args) {
        Circle myCircle = new Circle(2.0, "blue");
        System.out.println("Bán kính của hình tròn là: " + myCircle.getRadius());
        System.out.println("Diện tích của hình tròn là: " + myCircle.getArea());
        myCircle.setRadius(3.0);
        myCircle.setColor("green");
        System.out.println(myCircle);


        Cylinder myCylinder = new Cylinder(2.0, "blue", 3.0);

        System.out.println("Chiều cao của hình trụ là: " + myCylinder.getHeight());
        System.out.println("Thể tích của hình trụ là: " + myCylinder.getVolume());

        myCylinder.setHeight(4.0);

        System.out.println(myCylinder);
    }
}
