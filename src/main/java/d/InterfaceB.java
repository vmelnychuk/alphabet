package d;

public interface InterfaceB {
    default void first() {
        System.out.println("first from B");
    }

    default void second() {
        System.out.println("second from B");
    }
}
