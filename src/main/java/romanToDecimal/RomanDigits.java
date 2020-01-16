package romanToDecimal;


public enum RomanDigits {
    I(1),V(5),X(10),L(50),C(100),D(500),M(1000);

    private Integer decimalValue;

    RomanDigits(Integer decimalValue) {
        this.decimalValue = decimalValue;
    }

    public Integer getDecimalValue() {
        return decimalValue;
    }
}
