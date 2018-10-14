package exercises;

//class Nul {
//    static String nullString;
//    public static void main(String[] args) {
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(nullString, 0, 3);
//        System.out.println(stringBuilder);
//    }
//}

//class Scoop {
//    static int thrower() throws Exception { return 42; }
//    public static void main(String[] args) {
//        int x = 0;
//        try {
//            x = thrower();
//        } catch (Exception e) {
//            x++;
//        } finally {
//            System.out.println("x = " +  ++x);
//        }
//    }
//}

class Vark {
    public static void main(String... a) {
        new Vark().go(a, 42);
    }
    void go(String[] b, int life) {
        System.out.println(b[1]);
    }
}

class Plant {
    String getName() { return "plant"; }
    Plant getType() { return this; }
}

class Flower extends Plant {
    //Flower getType() { return this; }
    //String getType() { return "this" }
    Tulip getType() { return new Tulip(); }
}

class Tulip extends Flower {}