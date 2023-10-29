package ru.mirea.lab7;

public class Task2 {
    public interface Movable {
        void moveUp();
        void moveDown();
        void moveLeft();
        void moveRight();
    }

    public class MovablePoint implements Movable {
        private int x;
        private int y;
        private int xSpeed;
        private int ySpeed;

        public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
            this.x = x;
            this.y = y;
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        @Override
        public void moveUp() {
            y -= ySpeed;
        }

        @Override
        public void moveDown() {
            y += ySpeed;
        }

        @Override
        public void moveLeft() {
            x -= xSpeed;
        }

        @Override
        public void moveRight() {
            x += xSpeed;
        }

        @Override
        public String toString() {
            return "MovablePoint{" +
                    "x=" + x +
                    ", y=" + y +
                    ", xSpeed=" + xSpeed +
                    ", ySpeed=" + ySpeed +
                    '}';
        }
    }

    public class MovableRectangle implements Movable {
        private MovablePoint topLeft;
        private MovablePoint bottomRight;

        public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
            topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
            bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
        }

        @Override
        public void moveUp() {
            topLeft.moveUp();
            bottomRight.moveUp();
        }

        @Override
        public void moveDown() {
            topLeft.moveDown();
            bottomRight.moveDown();
        }

        @Override
        public void moveLeft() {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }

        @Override
        public void moveRight() {
            topLeft.moveRight();
            bottomRight.moveRight();
        }

        @Override
        public String toString() {
            return "MovableRectangle{" +
                    "topLeft=" + topLeft +
                    ", bottomRight=" + bottomRight +
                    '}';
        }
    }
}
