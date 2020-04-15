package shapes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Impl {

    public static void main(String[] args) {
        Shape s = new Circle(10);
        System.out.println(s.area());
        Shape s1 = new Circle(12);
        System.out.println(s1.area());

        List<Shape> shapes = new ArrayList();
        shapes.add(s1);
        shapes.add(s);

        shapes.sort(Comparator.comparingDouble(Shape::area));

        for(Shape s3:shapes){
            System.out.println(s3.area());
        }

    }
}
