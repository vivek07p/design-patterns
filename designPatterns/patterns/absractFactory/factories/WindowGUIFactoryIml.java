package absractFactory.factories;

import absractFactory.classes.Button;
import absractFactory.classes.Checkbox;
import absractFactory.classes.WindowButton;
import absractFactory.classes.WindowCheckbox;

public class WindowGUIFactoryIml implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowCheckbox();
    }
}
