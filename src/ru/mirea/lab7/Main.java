package ru.mirea.lab7;

public class Main {
    // Создание интерфейса Movable
    public interface Movable {
        void moveUp();
        void moveDown();
        void moveLeft();
        void moveRight();
    }

    // Создание класса MovableRectangle, реализующего интерфейс Movable
    public class MovableRectangle implements Movable {
        private int x1, y1, x2, y2; // координаты верхнего левого и нижнего правого углов прямоугольника

        public MovableRectangle(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }

        @Override
        public void moveUp() {
            y1++;
            y2++;
        }

        @Override
        public void moveDown() {
            y1--;
            y2--;
        }

        @Override
        public void moveLeft() {
            x1--;
            x2--;
        }

        @Override
        public void moveRight() {
            x1++;
            x2++;
        }
    }
}
