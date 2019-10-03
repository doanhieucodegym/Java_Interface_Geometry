package Main;

import Circle.Circle;

public class Main {
    public static void main(String[] args) {
        Circle [] circles =new Circle[3];
        circles[0] =new Circle();
        circles[1] =new Circle(3.6);
        circles[2] =new Circle(3.5,"red",true);

            /// int ra circle
        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }



    }
}
