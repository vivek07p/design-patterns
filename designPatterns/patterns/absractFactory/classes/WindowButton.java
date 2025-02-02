package absractFactory.classes;

public class WindowButton implements Button{
    @Override
    public void paint() {
        System.out.println("Window button paint");
    }
}
