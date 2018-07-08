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
}