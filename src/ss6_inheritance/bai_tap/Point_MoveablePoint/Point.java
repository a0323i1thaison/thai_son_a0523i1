package ss6_inheritance.bai_tap.Point_MoveablePoint;

public class Point {
    public class point{
        private float x;
        private float y;
        public point() {
        }
        public point(float x,float y) {
            this.x = x;
            this.y = y;
        }

        public float getX() {
            return x;
        }

        public void setX(float x) {
            this.x = x;
        }

        public float getY() {
            return y;
        }

        public void setY(float y) {
            this.y = y;
        }
        public void setXY(float x , float y){
            this.x = x;
            this.y = y;
        }
        public float[] getXY(){
            float[] arr = new float[2];
            arr[0]= x;
            arr[1]=y;
            return arr;
        }
        @Override
        public String toString() {
            return "point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
    public class MovablePoint extends point{
        private float xSpeed ;
        private float ySpeed ;

        public MovablePoint(){
        }
        public MovablePoint(float xSpeed , float ySpeed, float x , float y ){
            super ( x , y);
            this.xSpeed=xSpeed;
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


        public float[] getSpeed(){
            float[] arr1 = new float[2];
            arr1[0] = xSpeed;
            arr1[1] = ySpeed;
            return arr1;
        }
        @Override
        public String toString() {
            return "MovablePoint{" +
                    "xSpeed=" + xSpeed +
                    ", ySpeed=" + ySpeed +
                    '}';
        }
    }
}
