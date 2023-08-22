package ss5_accessmodifi.bt;

public class Access {
    private double radius ;
    private String color ;
    public Access(){
        radius = 1.0;
        color = "red";
    }
    public Access(double radius){
        this.radius = radius;
        color = " red ";
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return Math.PI * radius * radius ;
    }
}
