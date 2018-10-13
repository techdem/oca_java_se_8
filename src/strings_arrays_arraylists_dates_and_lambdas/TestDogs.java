package strings_arrays_arraylists_dates_and_lambdas;

import java.util.*;
import java.util.function.Predicate;

class Dog {
    String name;
    int weight;
    int age;
    // constructor assigns a name, weight and age
    Dog(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    String getName() {return name;}
    int getWeight() {return weight;}
    int getAge() {return age;}
    public String toString() {
        return name;
    }
}

// public class TestDogs {
//     public static void main(String[] args) {
//         ArrayList<Dog> dogs = new ArrayList<>();        // create and populate
//         dogs.add(new Dog("boi", 30, 6));
//         dogs.add(new Dog("tyri", 40, 12));
//         dogs.add(new Dog("charis", 120, 7));
//         dogs.add(new Dog("aiko", 50, 10));
//         dogs.add(new Dog("clover", 35, 12));
//         dogs.add(new Dog("mia", 15, 4));
//         dogs.add(new Dog("zooey", 45, 8));

//         // run a few queries

//         System.out.println("all dogs " + dogs);
//         System.out.println("min age 7 " + minAge(dogs, 7).toString());
//         System.out.println("max wght. " + maxWeight(dogs, 40).toString());
//     }

//     // declare "query" methods

//     static ArrayList<Dog> minAge(ArrayList<Dog> dogList, int testFor) {
//         ArrayList<Dog> result1 = new ArrayList<>();     // do a minimum age query
//         for(Dog d: dogList)
//             if(d.getAge() >= testFor)                   // the key moment!
//                 result1.add(d);
//         return result1;
//     }

//     static ArrayList<Dog> maxWeight(ArrayList<Dog> dogList, int testFor) {
//         ArrayList<Dog> result1 = new ArrayList<>();     // do a max weight query
//         for(Dog d: dogList)
//             if(d.getWeight() <= testFor)                // the key moment
//                 result1.add(d);
//         return result1;
//     }
// }

public class TestDogs {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();        // create and populate
        dogs.add(new Dog("boi", 30, 6));
        dogs.add(new Dog("tyri", 40, 12));
        dogs.add(new Dog("charis", 120, 7));
        dogs.add(new Dog("aiko", 50, 10));
        dogs.add(new Dog("clover", 35, 12));
        dogs.add(new Dog("mia", 15, 4));
        dogs.add(new Dog("zooey", 45, 8));

        // run a few old "queries"

        System.out.println("all dogs " + dogs);
        System.out.println("min age 7 " + minAge(dogs, 7).toString());
        System.out.println("max wght. " + maxWeight(dogs, 40).toString());

        // run a few lambda queries

        System.out.println("age < 9 " + dogQuery(dogs, d -> d.getAge() < 9));
        System.out.println("w > 100 " + dogQuery(dogs, d -> d.getWeight() > 100));
    }

    // declare old style "query" methods

    static ArrayList<Dog> minAge(ArrayList<Dog> dogList, int testFor) {
        ArrayList<Dog> result1 = new ArrayList<>();     // do a minimum age query
        for(Dog d: dogList)
            if(d.getAge() >= testFor)                   // the key moment!
                result1.add(d);
        return result1;
    }

    static ArrayList<Dog> maxWeight(ArrayList<Dog> dogList, int testFor) {
        ArrayList<Dog> result1 = new ArrayList<>();     // do a max weight query
        for(Dog d: dogList)
            if(d.getWeight() <= testFor)                // the key moment
                result1.add(d);
        return result1;
    }

    // declare a new lambda powered, generic, multi-purpose query method

    static ArrayList<Dog> dogQuery(ArrayList<Dog> dogList, Predicate<Dog> expr) {
        // do an "on the fly" query
        ArrayList<Dog> result1 = new ArrayList<>();
        for(Dog d: dogList)
            if(expr.test(d))                            // the key moment, lambda powered
                result1.add(d);
        return result1;
    }
}
