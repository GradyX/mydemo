package design.pattern.simplefactory;

public class ShapeFactory {

    public static Shape getShape(String shapeType) throws UnSupportedShapeException {
        Shape shape;
        if(shapeType.equals("circle")) {
            shape = new Circle();
        }
        else if(shapeType.equals("triangle")) {
            shape = new Triangle();
        }
        else if(shapeType.equals("rectangle")) {
            shape = new Rectangle();
        }
        else {
            throw new UnSupportedShapeException(shapeType); 
        }
        return shape;
    }
    
}

class UnSupportedShapeException extends Exception {
    
    public UnSupportedShapeException() {
        super("unsupported shape");
    }
    
    public UnSupportedShapeException(String shapeType) {
        super("unsupported " + shapeType + " shape");
    }

}
