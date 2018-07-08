package object_orientation;

class Animal3 { }

class Horse2 extends Animal3 { }

class UseAnimals {

    public void doStuff(Animal3 a) {

        System.out.println("In the Animal version");
    }

    public void doStuff(Horse2 h) {

        System.out.println("In the Horse version.");
    }

    public static void main(String[] args) {

        UseAnimals ua = new UseAnimals();
        Animal3 animalObj = new Animal3();
        Horse2 horseObj = new Horse2();
        Animal3 animalRefToHorse = new Horse2();

        ua.doStuff(animalObj);
        ua.doStuff(horseObj);
        ua.doStuff(animalRefToHorse);
    }
}