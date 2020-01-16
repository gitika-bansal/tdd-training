package romanToDecimal;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class RomanToDecimalTests {


    @Test
    public void shouldConvertRomanDigitstoDecimal(){
        List<RomanDigits> romanDigits = Arrays.asList(RomanDigits.values());
        for(RomanDigits s: romanDigits){
            RomanNumber number = new RomanNumber(s.toString());
            assert(s.getDecimalValue().equals(number.convertToDecimal()));
        }
    }

    @Test
    public void shouldConvertRomanTwoToDecimal(){
        RomanNumber number = new RomanNumber("II");
        Integer decimal = number.convertToDecimal();
        assert (new Integer(2).equals(decimal));
    }
    @Test
    public void shouldConvertRomanThreeToDecimal(){
        RomanNumber number = new RomanNumber("III");
        Integer decimal = number.convertToDecimal();
        assert (new Integer(3).equals(decimal));
    }

    @Test
    public void shouldConvertRomanFouroDecimal(){
        RomanNumber number = new RomanNumber("IV");
        Integer decimal = number.convertToDecimal();
        assert (new Integer(4).equals(decimal));
    }



}
