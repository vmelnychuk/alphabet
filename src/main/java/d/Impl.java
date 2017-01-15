package d;

public class Impl implements DefaultMethodInterface {
    @Override
    public void greeter() {
        System.out.println("Greeter");
    }

    @Override
    public void printer() {
        System.out.println("printer impl");
    }
}
