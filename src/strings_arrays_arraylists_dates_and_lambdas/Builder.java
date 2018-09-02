package strings_arrays_arraylists_dates_and_lambdas;

public class Builder {

    public static void main(String[] args) {

        int x = 5;

        new StringBuilder();        // default cap. = 16 chars
        new StringBuilder("ab");    // cap. = 16 + arg's length
        new StringBuilder(x);       // capacity = x (an integer)

        StringBuilder sb = new StringBuilder("set ");
        sb.append("point");
        System.out.println(sb);     // output is "set point"
        StringBuilder sb2 = new StringBuilder("pi = ");
        sb2.append(3.14159f);
        System.out.println(sb2);    // output is "pi = 3.14159

        StringBuilder sb1 = new StringBuilder("0123456789");
        System.out.println(sb1.delete(4,6));    // output is "01235789

        StringBuilder sb3 = new StringBuilder("01234567");
        sb3.insert(4, "---");
        System.out.println( sb3 );              // output is "0123---4567

        StringBuilder sb4 = new StringBuilder("A man a plan a canal Panama");
        sb4.reverse();
        System.out.println(sb4);                // output: "amanaP lanac a nalp a nam A"

        StringBuilder sb5 = new StringBuilder("test string");
        System.out.println( sb5.toString() );   // output is "test string"
    }
}
