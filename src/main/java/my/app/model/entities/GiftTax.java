package my.app.model.entities;

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
