package assignments;

class ReferenceTest3 {
    public static void main(String[] args) {
        int a = 1;
        ReferenceTest3 rt = new ReferenceTest3();
        System.out.println("Beofore modify a = " + a);
        rt.modify(a);
        System.out.println("After modify() a = " + a);
    }
    void modify(int number) {
        number = number + 1;
        System.out.println("number = " + number);
    }
}
