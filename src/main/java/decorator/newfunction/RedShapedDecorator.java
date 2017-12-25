package decorator.newfunction;

import decorator.existed.Shape;

/**
 * Created by wangshaonan on 17/12/25.
 */
public class RedShapedDecorator extends ShapeDecorator {
    public RedShapedDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        //体现装饰过程
        setRedBorder(decoratedShape);
    }
    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }

}
