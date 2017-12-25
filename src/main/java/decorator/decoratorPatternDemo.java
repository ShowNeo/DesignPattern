package decorator;

import decorator.existed.Circle;
import decorator.existed.Rectangle;
import decorator.existed.Shape;
import decorator.newfunction.RedShapedDecorator;

/**
 * Created by wangshaonan on 17/12/25.
 */
public class decoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapedDecorator(new Circle());

        Shape redRectangle = new RedShapedDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\n Circle of red border");
        redCircle.draw();

        System.out.println("\n Rectangle of red border");
        redRectangle.draw();

        Shape redCircle2 = new RedShapedDecorator(new Circle());
        System.out.println("\n after decorator");
        redCircle2.draw();

    }
}
