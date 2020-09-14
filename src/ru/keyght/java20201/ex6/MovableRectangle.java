package ru.keyght.java20201.ex6;

public class MovableRectangle extends Rectangle implements Movable {

    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(double width, double length) {
        super(width, length);
    }

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft.x = x1;
        topLeft.y = y1;
        topLeft.xSpeed = xSpeed;
        topLeft.ySpeed = ySpeed;
        bottomRight.x = x2;
        bottomRight.y = y2;
        bottomRight.xSpeed = xSpeed;
        bottomRight.ySpeed = ySpeed;
    }

    public boolean speedCheck(){
        if ((topLeft.xSpeed == bottomRight.xSpeed) && (topLeft.ySpeed == bottomRight.ySpeed)) return true;
        else return false;
    }

    public void moveUp(){
    }
    public void moveDown(){
    }
    public void moveLeft(){
    }
    public void moveRight(){
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
