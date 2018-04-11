package my.app.model.entities;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Tax {
    BigDecimal value;
    public abstract void calculateTax(BigDecimal value);

    public Tax(BigDecimal value) {
        calculateTax(value);
    }

    public BigDecimal getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Your " + this.getClass().getSimpleName().toLowerCase() + "= " + value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tax tax = (Tax) o;
        return Objects.equals(value, tax.value);
    }

    @Override
    public int hashCode() {

        return Objects.hash(value);
    }
}
