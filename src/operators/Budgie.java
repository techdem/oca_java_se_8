package operators;

class Budgie {
    public static void main(String[] args) {
        Budgie b1 = new Budgie();
        Budgie b2 = new Budgie();
        Budgie b3 = b1;

        String s1 = "Bob";
        String s2 = "Bob";
        String s3 = "bob";                  // lower case "b"

        System.out.println(b1.equals(b2));  // false, different objects
        System.out.println(b1.equals(b3));  // true, same objects
        System.out.println(s1.equals(s2));  // true, same values
        System.out.println(s1.equals(s3));  // false, values are case sensitive
    }
}
