package d;

public class MultipleImpl implements InterfaceA, InterfaceB {
    @Override
    public void first() {
        InterfaceA.super.first();
    }

    @Override
    public void second() {
        InterfaceB.super.second();
    }
}
