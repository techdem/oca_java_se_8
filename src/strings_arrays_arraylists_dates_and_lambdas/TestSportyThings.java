package strings_arrays_arraylists_dates_and_lambdas;

class Car {}
interface Sporty {
    void beSporty();
}
class Ferrari extends Car implements Sporty {
    public void beSporty() {
        // implement cool sporty method in a Ferrari-specific way
    }
}
class RacingFlats implements Sporty {
    public void beSporty() {
        // implement cool sporty method in a RacingFlat-specific way
    }
}
class GolfClub { }
class Honda extends Car {}
class Beer {}
interface Foldable {}
class Box implements Foldable {}
public class TestSportyThings {
    public static void main(String [] args) {

        int[] weightList = new int[5];
        byte b = 4;
        char c = 'c';
        short s = 7;
        weightList[0] = b;                      // OK, byte is smaller than int
        weightList[1] = c;                      // OK, char is smaller than int
        weightList[2] = s;                      // OK, short is smaller than int

        Sporty[] sportyThings = new Sporty [3];
        sportyThings[0] = new Ferrari();        // OK, Ferrari implements Sporty
        sportyThings[1] = new RacingFlats();    // OK, RacingFlats implements Sporty
        //sportyThings[2] = new GolfClub();       // Not OK, GolfClub does not implement Sporty

        int[] splats;
        int[] dats = new int[4];
        char[] letters = new char[5];
        splats = dats;                          // OK, dats refers to an int array
        //splats = letters;                       // NOT OK, letters refers to a char array

        Car[] cars;
        Honda[] cuteCars = new Honda[5];
        cars = cuteCars;                        // OK because Honda is a type of Car
        Beer[] beers = new Beer[99];
        //cars = beers;                           // NOT OK, Beer is not a type of Car

        Foldable[] foldingThings;
        Box[] boxThings = new Box[3];
        foldingThings = boxThings;              // OK, Box implements Foldable, so Box IS-A Foldable

        int[] blots;
        int[][] squeegees = new int[3][];
        //blots = squeegees;                      // NOT OK, squegees is a two-d array of int arrays
        int[] blocks = new int[6];
        blots = blocks;                         // OK, blocks is an int array

        int[][] books = new int[3][];
        int[] numbers = new int[6];
        int aNumber = 7;
        //books[0] = aNumber;                     // NO, expecting an int array not an int
        books[0] = numbers;                     // OK, numbers is an int array
    }
}
