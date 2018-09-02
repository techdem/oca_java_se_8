package strings_arrays_arraylists_dates_and_lambdas;

public class References {

    public static void main(String[] args) {

        String x = "Java";
        x = x.concat(" Rules!");
        System.out.println("x = " + x);     // output: x = Java Rules!

        x.toLowerCase();                    // no assignment, create a new, abandoned String

        System.out.println("x = " + x);     // no assignment, the output is still: x = Java Rules!

        x = x.toLowerCase();                // create a new String, assigned to x
        System.out.println("x = " + x);     // the assignment causes the output: x = java rules!

        String s1 = "spring ";
        String s2 = s1 + "summer ";
        s1.concat("fall ");
        s2.concat(s1);
        s1 += "winter ";
        System.out.println(s1 + " " + s2);
    }
}
