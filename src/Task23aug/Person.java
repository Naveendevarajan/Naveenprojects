package Task23aug;

import java.time.LocalDate;
import java.time.Period;

public class Person extends Contact {

    LocalDate localDate=LocalDate.of(1990,12,12);
    public int calculatingAge(){
        LocalDate currentDate=LocalDate.now();
            return Period.between(localDate,currentDate).getYears();
    }

}
