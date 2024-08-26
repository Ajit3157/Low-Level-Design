package AbstractDesign;

public class ShapeFactoryImpl implements ShapeFactory {
    @Override
    public Shape getShape(String shapeName) {
        switch(shapeName){
            case "Rectangle":
                return new Rectangle();
            case "Circle":
                return new Circle();
        }
        return null;
    }
}
