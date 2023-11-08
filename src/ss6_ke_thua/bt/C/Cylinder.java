package ss6_ke_thua.bt.C;

import ss6_ke_thua.bt.C.Circle;

public class Cylinder extends Circle {
    private int higth ;

    public Cylinder(int higth) {
        this.higth = higth;
    }

    public Cylinder(int radius, String color, int higth) {
        super(radius, color);
        this.higth = higth;
    }

    public Cylinder() {
    }

    public int getHigth() {
        return higth;
    }

    public void setHigth(int higth) {
        this.higth = higth;
    }
    public double getvolume(){
        return getAre() * higth;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "higth=" + higth +
                " chu vi :" + getvolume()+
                '}';
    }
}
