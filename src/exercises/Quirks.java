package exercises;

import java.util.*;

//class Nul {
//    static String nullString;
//    public static void main(String[] args) {
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(nullString, 0, 3);
//        System.out.println(stringBuilder);
//    }
//}

//class Scoop {
//    static int thrower() throws Exception { return 42; }
//    public static void main(String[] args) {
//        int x = 0;
//        try {
//            x = thrower();
//        } catch (Exception e) {
//            x++;
//        } finally {
//            System.out.println("x = " +  ++x);
//        }
//    }
//}

//class Vark {
//    public static void main(String... a) {
//        new Vark().go(a, 42);
//    }
//    void go(String[] b, int life) {
//        System.out.println(b[1]);
//    }
//}

//class Plant {
//    String getName() { return "plant"; }
//    Plant getType() { return this; }
//}
//
//class Flower extends Plant {
//    //Flower getType() { return this; }
//    //String getType() { return "this" }
//    Tulip getType() { return new Tulip(); }
//}
//
//class Tulip extends Flower {}

//class A {
//    public void say() { System.out.println("Hey! "); }
//}
//
//class B extends A {
//    public void say(String name) { System.out.println("Hello, " + name); }
//}
//
//class C extends A {}
//
//class Start{
//    public static void main(String[] args) {
//        B b = new B();
//        b.say();
//        b.say("John Lennon");
//    }
//}

//interface Breakable { public void breakSmoothly(); }
//class Car { public void accelerate() {} }
//class FancyCar extends Car { public void breakSmoothly() {} }
//class SuperFancyCar extends FancyCar implements Breakable {
//    public void breakSmoothly() {}
//    public void turn() {}
//}
//class Start {
//    public static void main(String[] args) { print (new FancyCar()); }
//    private static void print(Car car) {
//        //((Breakable) car).breakSmoothly();
//        //((SuperFancyCar) car).turn();
//        //((SuperFancyCar) car).breakSmoothly();
//        //((FancyCar) car).turn();
//        ((FancyCar) car).breakSmoothly();
//        car.accelerate();
//        //car.turn();
//        //car.breakSmoothly();
//    }
//}

interface Interface {}
class Class implements Interface {
    public static void main(String[] args) {
        new Class().method();
    }
    void method() {
        System.out.println(Interface.super.hashCode());
    }
}
