package price.formatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Write your tests for the PriceFormatter here. See the specification of the
 * PriceFormatter and formatPrice method in the PriceFormatter class and the
 * readme file.
 */
public class PriceFormatterTest {

    @Test
    void tuhaterotin(){
        PriceFormatter formatter = new PriceFormatter();
        String result = formatter.formatPrice(1234567.89);
        assertEquals("1 234 567,89 €", result);
    }

    @Test 
    void pyoristysYlospain(){
        PriceFormatter formatter = new PriceFormatter();
        String result = formatter.formatPrice(3.146);
        assertEquals("3,15 €", result);
    }

    @Test 
    void pyoristysAlaspain(){
        PriceFormatter formatter = new PriceFormatter();
        String result = formatter.formatPrice(3.144);
        assertEquals("3,14 €", result);
    }

    @Test 
    void tasaluvunDesimaalienPoisto(){
        PriceFormatter formatter = new PriceFormatter();
        String result = formatter.formatPrice(42);
        assertEquals("42 €", result);
    }

    @Test 
    void desimaalierotin(){
        PriceFormatter formatter = new PriceFormatter();
        String result = formatter.formatPrice(12.34);
        assertEquals("12,34 €", result);
    }

    @Test 
    void nolla(){
        PriceFormatter formatter = new PriceFormatter();
        String result = formatter.formatPrice(0);
        assertEquals("0 €", result);
    }

   
}
