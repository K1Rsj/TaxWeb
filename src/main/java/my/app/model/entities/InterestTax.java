package my.app.model.entities;

import java.math.BigDecimal;

public class InterestTax extends Tax {

    public InterestTax(BigDecimal value) {
        super(value);
    }

    @Override
    public void calculateTax(BigDecimal value) {
        this.value = value.multiply(BigDecimal.valueOf(0.05));
    }
}
