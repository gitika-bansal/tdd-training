package romanToDecimal;

import java.util.ArrayList;
import java.util.Arrays;

public class RomanNumber {

    private String raw;


    public RomanNumber(String raw) {
        this.raw = raw;
    }

    public Integer convertToDecimal() {
        Integer sum =0;
        Integer previousValue = 0;
        char[] digits = new StringBuilder(raw).reverse().toString().toCharArray();

        for (char d:digits){
           RomanDigits r = RomanDigits.valueOf(String.valueOf(d));
           Integer decimalValue = r.getDecimalValue();
           Integer valueToBeAdded = 0;
           if(previousValue > decimalValue){
               valueToBeAdded = decimalValue * -1;
           }else{
               valueToBeAdded = decimalValue;
           }
           sum = sum+valueToBeAdded;
           previousValue = decimalValue;
        }
    return sum;
    }


}
