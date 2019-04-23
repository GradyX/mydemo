package design.pattern.simplefactory;

public class client {

    public static void main(String []args) {
        String shapeType = "square";
        try {
            Shape shape = ShapeFactory.getShape(shapeType);
            shape.draw();
            shape.erase();
        } catch (UnSupportedShapeException e) {
            e.printStackTrace();
        }
    }
    
}
