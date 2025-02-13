package employment;

import java.time.LocalDate;

public interface Intern {
    LocalDate Date_of_join = LocalDate.now();

    void getinfo();   
}