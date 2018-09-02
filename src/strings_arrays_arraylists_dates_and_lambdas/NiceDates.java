package strings_arrays_arraylists_dates_and_lambdas;

import java.time.*;
import java.time.format.*;

public class NiceDates {
    public static void main(String[] args) {
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MMM dd, yyyy");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("E MMM dd, yyyy G");
        DateTimeFormatter tf1 = DateTimeFormatter.ofPattern("k:m:s A a");

        LocalDate d = LocalDate.now();
        String s = d.format(f1);        // thus proving that the format() method makes String objects

        System.out.println(s);
        System.out.println(d.format(f2));

        LocalTime t = LocalTime.now();
        System.out.println(t.format(tf1));
    }
}
