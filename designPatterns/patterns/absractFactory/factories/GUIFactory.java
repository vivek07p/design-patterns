package absractFactory.factories;

import absractFactory.classes.Button;
import absractFactory.classes.Checkbox;


public interface GUIFactory {

    Button createButton();
    Checkbox createCheckbox();
}
