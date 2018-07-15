package object_orientation;

public class Animal6 {
    static void doStuff() {
        System.out.print("a ");
    }
}

class Dog3 extends Animal6 {
    static void doStuff() {  // it's a redefinition not an override
        System.out.print("d ");
    }

    public static void main(String[] args) {
        Animal6[] a = {new Animal6(), new Dog3(), new Animal6()};
        for(int x = 0; x < a.length; x++) {
            a[x].doStuff();  // invoke the static method
        }
        Dog3.doStuff();  // invoke using the class name
    }
}
