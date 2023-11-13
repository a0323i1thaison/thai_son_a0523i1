package ss7_actractclass.bt.modle;

public  abstract class Geometric {
    private String color;
    private double area;
    private double perimeter;

    public Geometric() {
    }

    public Geometric(String color,double area , double perimeter) {
        this.color = color;
        this.area = area;
        this.perimeter = perimeter;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
    @Override
    public String toString() {
        return "Geometric{" +
                "color='" + color + '\'' +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
