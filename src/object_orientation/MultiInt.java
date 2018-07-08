package object_orientation;

interface I1 {

    default int doStuff() { return 1; }
}

interface I2 {

    default int doStuff() { return 2; }
}

class MultiInt implements I1, I2 {  // needs to override

    public static void main(String[] args) {

        new MultiInt().go();
    }

    void go() {

        System.out.println(doStuff());
    }

    public int doStuff() {

        return 3;
    }

    public Animal getAnimal() {

        return new Horse();  // Assume Horse extends animal
    }

    public Object getObject() {

        int[] nums = {1,2,3};
        return nums;  // Return an int array, which is still an object
    }

    public interface Chewable { }

    public class Gum implements Chewable { }

    public class TestChewable {

        // Metgid with an interface return type

        public Chewable getChewable() {

            return new Gum();  // Return interface implementer
        }
    }
}