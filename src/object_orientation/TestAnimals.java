package object_orientation;

public class TestAnimals {

    public static void main(String[] args) {

        Animal a = new Animal();
        Animal b = new Horse();    // Animal ref, but a Horse object
        Animal c = new Horse();
        Horse d = new Horse();

        a.eat();    // Runs the Animal version of eat()
        b.eat();    // Runs the Horse version of eat(()
        //c.buck();    // Can't invoke buck(), Animal class doesn't have that method
        d.buck();    // T
    }
}

class Animal {

    public void eat() {

        System.out.println("Generic Animal Eating Generically");
    }
}

class Horse extends Animal {

    public void eat() {

        System.out.println("Horse eating hay, oats, and horse treats");
    }

    public void buck() { }
}