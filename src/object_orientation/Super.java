package object_orientation;

class Super {
    Super(){
        super();
    }
    Super(String Super) {

    }
}
class Subclass extends Super {
    Subclass() {
        super("Super");
    }
}
class Class extends Subclass {
    Class() {
        super();
    }
}
