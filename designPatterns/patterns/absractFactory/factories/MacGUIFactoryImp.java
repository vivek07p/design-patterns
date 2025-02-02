package absractFactory.factories;

import absractFactory.classes.Button;
import absractFactory.classes.Checkbox;
import absractFactory.classes.MacButton;
import absractFactory.classes.MacCheckbox;


public class MacGUIFactoryImp implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
