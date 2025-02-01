package factory;

import java.util.Objects;

public class Factory {

    public static Shape getShapeInstance(String type){

        if(Objects.equals(type, "CIRCLE")){
            return new Circle();
        }
        if(Objects.equals(type, "SQUARE")){
            return new Sqaure();
        }
       return null;
    }
}
