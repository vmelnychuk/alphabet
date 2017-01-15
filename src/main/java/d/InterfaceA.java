package d;

public interface InterfaceA {
    default void first() {
        System.out.println("first from A");
    }

    default void second() {
        System.out.println("second from A");
    }
}
