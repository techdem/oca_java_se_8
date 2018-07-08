package object_orientation;

class Adder {

    public int addThem(int x, int y) {

        return x + y;
    }

    // Overload the addThem method to add doubles instead of ints

    public double addThem(double x, double y) {

        return x + y;
    }
}

// From another class, invoke the addThem() method

public class TestAdder {

    public static void main(String[] args) {

        Adder a = new Adder();
        int b = 27;
        int c = 3;
        int result = a.addThem(b,c);  // Which addThem is invoked?
        double doubleResult = a.addThem(22.5,9.3); // Which addThem?
    }
}
