import java.io.IOException;

import javax.activity.InvalidActivityException;

class Quizzes {

    public void method1() throws Exception {
        method2();
    }

    public void method2() throws Exception {
        throw method3();
    }

    public Exception method3() {
        return new Exception();
    }

    public void traceStackTest() {
        try {
            throw new IOException();
        } catch (IOException ex) {
        }
    }

    public void testException() {
        try {
            throw new ArithmeticException();
        } catch (Exception ex) {
            throw new InvalidActivityException();
        } finally {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void main(String... args) {
        // int a = 5 / 0;
        // Quizzes quizzes = new Quizzes();
        // quizzes.traceStackTest();

        ExtendedClasses extendedClasses = new ExtendedClasses();
        extendedClasses.display("test");
    }
}

interface MyInterface {
    public default void display(String value) {
        System.out.print("value=" + value);
    }

    public int calculate(int a, int b);
}

class ExtendedClasses implements MyInterface {
    public int calculate(int a, int b) {
        return a + b;
    }

    public void display(String vlaue) {
        System.out.println("I am dispalying " + vlaue);
    }
}
