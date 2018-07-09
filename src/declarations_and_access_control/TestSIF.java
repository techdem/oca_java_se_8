package declarations_and_access_control;

interface StaticIface {

    static int m1() { return 42; }

    public static void m2() { ; }

    // final static void m3() { ; }  // illegal: final not allowed

    // abstract static void m4() { ; }  // illegal: abstract not allowed

    // static void m5();  // illegal: needs a method body
}

public class TestSIF implements StaticIface {

    public static void main(String[] args) {

        System.out.println(StaticIface.m1());  // legal: m1()'s type must be included

        new TestSIF().go();
        // System.out.println(m1());  // illegal: reference to interface is required
    }

    void go() {

        System.out.println(StaticIface.m1());  // also legal from an instance
    }
}