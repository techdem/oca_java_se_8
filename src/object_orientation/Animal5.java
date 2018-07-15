package object_orientation;

public class Animal5 {
    String name;
    Animal5(String name) {
        this.name = name;
    }

    Animal5() {
        this(makeRandomName());
    }

    static String makeRandomName() {
        int x = (int) (Math.random() * 5);
        String name = new String[]{"Fluffy", "Fido", "Rover", "Spike", "Gigi"}[x];
        return name;
    }

    public static void main(String[] args) {
        Animal5 a = new Animal5();
        System.out.println(a.name);
        Animal5 b = new Animal5("Zeus");
        System.out.println(b.name);
    }
}
