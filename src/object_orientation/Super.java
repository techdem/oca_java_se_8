package object_orientation;

class Super {
    Super(){
        super();
        System.out.println("\"Super\" no-args constructor");
    }
    Super(String Super) {
        this();
        System.out.println("\"Super\" no-args constructor");
    }
    public static void main(String[] args) {
        new Class();
        new Subclass();
        new Super();
    }
}
class Subclass extends Super {
    Subclass() {
        super("Super");
        System.out.println("\"Subclass\" no-args constructor");
    }
}
class Class extends Subclass {
    Class() {
        super();
        System.out.println("\"Class\" no-args constructor");
    }
}
