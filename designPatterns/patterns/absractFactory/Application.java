package absractFactory;

import absractFactory.classes.Button;
import absractFactory.classes.Checkbox;
import absractFactory.factories.AbstractFactory;
import absractFactory.factories.GUIFactory;

public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }

    public static void main(String[] args) {
        Application app = new Application(AbstractFactory.getFactory("mac"));
        app.paint();
    }



}
