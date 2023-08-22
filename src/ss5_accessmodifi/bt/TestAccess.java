package ss5_accessmodifi.bt;



public class TestAccess {
    public static void main(String[] args) {
        Access access = new Access(3);
        double radius = access.getRadius();
        double area = access.getArea();
        System.out.println("Radius :" + radius);
        System.out.println("Area :" + area);
    }
}
