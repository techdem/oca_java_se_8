package object_orientation;

class Animal4 {

    void makeNoise() { System.out.println("generic noise"); }
}

class Dog2 extends Animal4 {

    void makeNoise() { System.out.println("bark "); }
    void playDead() { System.out.println("roll over"); }
}

class CastTest {

    public static void main(String[] args) {

        Animal4[] a = { new Animal4(), new Dog2(), new Animal4() };

        for(Animal4 animal : a) {

            animal.makeNoise();

            if(animal instanceof Dog2) {

                //animal.playDead();  // try to do a Dog behavior?
                Dog2 d = (Dog2) animal; // casting the ref. var.
                d.playDead();
            }
        }

        Dog2 d2 = new Dog2();
        Animal4 a1 = d2;  // upcast ok with no explicit cast
        Animal4 a2 = (Animal4) d2;  // upcast ok with an explicit cast
    }
}