import Circle.Circle;
import Comparator.Comparator;

public class CircleComparator implements Comparator {

    @Override
    public int comparator(Object o, Object o1) {
        //ep kiểu cho  nó biết  chính xác , vì  object  là  kiểu chung

        Circle c1 = (Circle) o;
        Circle c2 = (Circle) o1;

        if (c1.getRadius() > c2.getRadius()){
            return 1;
        }
        else if (c1.getRadius() < c2.getRadius()) {
            return -1;
        }
        else return 0;
    }
}
