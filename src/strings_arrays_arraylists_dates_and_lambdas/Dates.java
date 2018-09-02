package strings_arrays_arraylists_dates_and_lambdas;

import java.time.LocalDate;
import java.time.Period;

public class Dates {

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2017, 1, 31);
            Period period1 = Period.ofMonths(1);
            System.out.println(date1);
            date1.plus(period1);                    // new value is lost
            System.out.println(date1);
            LocalDate date2 = date1.plus(period1);  // new value is captured
            System.out.println(date2);
    }
}
