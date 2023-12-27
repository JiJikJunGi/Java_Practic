package day7.interface_2;

public class interfaceMain {
    public static void main(String[] args) {
        interfaceImpl impl = new interfaceImpl();
        interfaceA interfaceA = impl;
        interfaceB interfaceB = impl;
        interfaceC interfaceC = impl;

        interfaceA.methodA();
        interfaceB.methodB();
        interfaceC.methodA();
        interfaceC.methodB();
        interfaceC.methodC();
        impl.methodA();
        impl.methodB();
        impl.methodC();
    }
}
