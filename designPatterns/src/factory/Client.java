package factory;

public class Client {

    public static void main(String[] args) {

        Shape square = Factory.getShapeInstance("SQUARE");
        square.computeArea();;
        Shape circle = Factory.getShapeInstance("CIRCLE");
        circle.computeArea();

    }
}
