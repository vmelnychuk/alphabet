package main;

import d.DefaultMethodInterface;
import d.Impl;
import d.MultipleImpl;

public class Main {
    public static void main(String[] args) {
        DefaultMethodInterface defaultMethodInterface = new Impl();
        defaultMethodInterface.greeter();
        defaultMethodInterface.printer();

        MultipleImpl multiple = new MultipleImpl();
        multiple.first();
        multiple.second();
    }

}
