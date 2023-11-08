package ss6_ke_thua.bt.Point_Move;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint(float x, float y) {
        super(x, y);
    }

    public MovablePoint(float xSpeed, float ySpeed, float x, float y) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;

    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }


    public float[] getSpeed() {
        float[] arr1 = new float[2];
        arr1[0] = xSpeed;
        arr1[1] = ySpeed;
        return arr1;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed ;

    }
}
