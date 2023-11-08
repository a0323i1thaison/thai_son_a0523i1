package ss6_ke_thua.bt.P;

import ss6_ke_thua.bt.P.Point2d;
import ss6_ke_thua.bt.P.Point3d;

public class testPoint {
    public static void main(String[] args) {
        Point2d point2d = new Point2d(3, 4);
        System.out.println(point2d);
        Point2d point2D1 = new Point2d(3.0f, 5.0f);
        System.out.println(point2D1);
        Point3d point3d = new Point3d(1, 2, 3);
        System.out.println(point3d);
    }
}
