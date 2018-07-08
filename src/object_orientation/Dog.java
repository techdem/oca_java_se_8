package object_orientation;

class Animal2 {

    public void eat() throws Exception {

        // throws an Exception
    }
}

class Dog extends Animal2 {

    public void eat() { /* no Exceptions */ }

    public static void main(String[] args) {

        Animal2 a = new Dog();
        Dog d = new Dog();
        d.eat();  // ok
        //a.eat();  // compiler error - unreported exception
    }
}