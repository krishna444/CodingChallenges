class InterfacesTest {
    public static void main(String... args) {
        MyInterface myInterface = new Extended();
        myInterface.display("Calling");
    }
}

interface MyInterface {
    public default void display(String value) {
        System.out.print("Hello from interface. Value=" + value);
    }

    public int calculate(int a, int b);
}

interface MyInterface1 {
    public default void display(String value) {
        System.out.println("Hello from interfaec 1. Vlaue=" + value);
    }
}

class Extended implements MyInterface, MyInterface1 {
    public int calculate(int a, int b) {
        return a + b;
    }

    public void display1(String value) {
        System.out.println("Hello from extended. Value=" + value);
        // display(value);
    }
}