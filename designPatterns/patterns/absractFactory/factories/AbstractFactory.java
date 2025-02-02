package absractFactory.factories;

public class AbstractFactory {


    public static GUIFactory getFactory(String osName){
        GUIFactory guiFactory;
        if (osName.contains("mac")) {
            guiFactory = new MacGUIFactoryImp();
        } else {
            guiFactory = new WindowGUIFactoryIml();
        }
        return guiFactory;

    }
}
