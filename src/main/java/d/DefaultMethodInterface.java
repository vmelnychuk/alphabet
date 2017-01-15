package d;

public interface DefaultMethodInterface {
    void greeter();
    default void printer() {
        System.out.println("print something");
        greeter();
    }
}
