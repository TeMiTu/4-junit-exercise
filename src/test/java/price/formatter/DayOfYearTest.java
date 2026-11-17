package refactoring;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class DayOfYearTest {
    @Test 
    void moneskoPaiva(){
        assertEquals(60, DayOfYear.dayOfYear(2, 29, 2020));
    }

    @Test
    void eiKarkauspaiva(){
        assertThrows(IllegalArgumentException.class, () -> DayOfYear.dayOfYear(2, 29, 2019));
    }

    @Test 
    void vuodenEnsimmainenPaiva(){
        assertEquals(1, DayOfYear.dayOfYear(1, 1, 2025));
    }

    @Test
    void vuodenViimeinenPaivaKarkausvuosi(){
        assertEquals(366, DayOfYear.dayOfYear(12, 31, 2020));
    }
    @Test 
    void vuodenEnsimmainenPaivaEiKarkausvuosi(){
        assertEquals(365, DayOfYear.dayOfYear(12, 31, 2021));
    }



}
