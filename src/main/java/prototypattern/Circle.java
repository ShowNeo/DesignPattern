package prototypattern;

/**
 * Created by wangshaonan on 17/12/25.
 */
public class Circle extends Shape {
    public Circle(){
        type = "Circle";
    }

    public void draw() {
        System.out.println("Inside Circle: draw() method.");
    }
}
