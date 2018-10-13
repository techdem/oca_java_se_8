package exercises;

class SuperClass {
    static int staticNumber = 1;
    int instanceNumber = 2;

    static void staticMethod() {
        System.out.println("static super method");
    }

    void instanceMethod() {
        System.out.println("instance super method");
    }
}

class SubClass extends SuperClass {
    static int staticNumber = 2;
    int instanceNumber = 3;

    static void staticMethod() {
        System.out.println("static sub method");
    }

    void instanceMethod() {
        System.out.println("instance sub method");
    }
}
public class InstanceMethods {
    public static void main(String[] args) {
        SuperClass sc = new SubClass();
        System.out.println(sc.staticNumber);
        System.out.println(sc.instanceNumber);
        sc.staticMethod();
        sc.instanceMethod();
    }
}
