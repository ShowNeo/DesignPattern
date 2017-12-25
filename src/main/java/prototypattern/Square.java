package prototypattern;

import sun.security.provider.SHA;

/**
 * Created by wangshaonan on 17/12/25.
 */
public class Square extends Shape {
    public Square(){
        type = "Square";
    }

    public void draw() {
        System.out.println("Inside Square: draw() method.");
    }
}
