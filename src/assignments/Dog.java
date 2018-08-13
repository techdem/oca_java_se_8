package assignments;

class Collar { }

public class Dog {
    Collar c;                                   // instance variable
    String name;                                // instance variable

    public static void main(String [] args) {   // main() is placed on the stack

        Dog d;                                  // reference variable d is created on the stack
        d = new Dog();                          // a new Dog object is created on the heap and is assigned to the reference variable
        d.go(d);                                // a copy of the reference variable d is passed to the go() method
    }
    void go(Dog dog) {                          // the go() method is placed on the stack, with the dog parameter as a local variable
        c = new Collar();                       // a new Collar object is created on the heap and assigned to Dog's instance variable
        dog.setName("Aiko");
    }
    void setName(String dogName) {              // setName() is added to the stack, with the dogName parameter as its local variable
        name = dogName;                         // the name instance variable now also refers to the String object
        // do more stuff
    }
}
