package my.app.model;

import java.math.BigDecimal;

public class GiftTax extends Tax {

    public GiftTax(BigDecimal value) {
        super(value);
    }

    @Override
    public void calculateTax(BigDecimal value) {
        this.value = value.multiply(BigDecimal.valueOf(0.15));
    }
}