package strings_arrays_arraylists_dates_and_lambdas;

class UseBoxing {
    public static void main(String [] args) {

        Integer i1 = 1000;
        Integer i2 = 1000;
        if(i1 != i2) System.out.println("different objects");
        if(i1.equals(i2)) System.out.println("meaningfully equal");

        Integer i3 = 10;
        Integer i4 = 10;
        if(i3 == i4) System.out.println("same object");
        if(i3.equals(i4)) System.out.println("meaningfully equal");

        UseBoxing u = new UseBoxing();
        u.go(5);
    }
    boolean go(Integer i) {             // boxes the int it was passed
        Boolean ifSo = true;            // boxes the literal
        Short s = 300;                  // boxes the primitive
        if(ifSo) {                      // unboxing
            System.out.println(++s);    // unboxes, increments, reboxes
        }
        return !ifSo;                   // unboxes, returns the inverse
    }
}
