package strings_arrays_arraylists_dates_and_lambdas;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;                                   // not on the exam but VERY useful

public class DrWho {
    public static void main(String[] args) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMddyyyy");  // describe a format
        LocalDate bday = null;
        try {
            bday = LocalDate.parse("09021987", f);                 // verify input date
        } catch (java.time.DateTimeException e) {                       // often parse() methods
            System.out.println("bad dates Indy");                       // throw exceptions
            System.exit(0);
        }
        System.out.println("your birthday is: " + bday);
        System.out.println("a " + bday.getDayOfWeek());                 // useful

        Period p1 = Period.between(bday, LocalDate.now());              // very useful!

        System.out.println("you've lived for: ");
        System.out.println(p1.getDays() + " days, ");                   // split up a Period
        System.out.println(p1.getMonths() + " months, ");
        System.out.println(p1.getYears() + " years");

        int yearsOld = p1.getYears();
        if(yearsOld < 0 || yearsOld > 119)
            System.out.println("Wow, are you a time lord?");

        long tDays = bday.until(LocalDate.now(), ChronoUnit.DAYS);      // handy method + handy enum = powerful date math

        System.out.println("you've lived for " + tDays + " days, so far");

        System.out.println("you'll reach 30,000 days on "
                + bday.plusDays(30_000));                               // date math

        LocalDate d2000 = LocalDate.of(2_000, 1, 1);    // of() is a commonly used 'factory' method

        Period p2 = Period.between(d2000, LocalDate.now());
        System.out.println("period since Y2K: " + p2);
    }
}
