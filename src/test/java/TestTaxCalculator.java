import my.app.model.services.TaxCalculator;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class TestTaxCalculator {

    @Test
    public void calculateIncomeTax() {
        BigDecimal actual = TaxCalculator.calculateIncomeTax(BigDecimal.valueOf(100500));
        Assert.assertEquals(new BigDecimal("18090.00"), actual);
    }

    @Test
    public void calculateSalesTax() {
        BigDecimal actual = TaxCalculator.calculateSalesTax(BigDecimal.valueOf(100500));
        Assert.assertEquals(new BigDecimal("10050.0"), actual);
    }
    @Test
    public void calculateInterestTax() {
        BigDecimal actual = TaxCalculator.calculateInterestTax(BigDecimal.valueOf(100500));
        Assert.assertEquals(new BigDecimal("5025.00"), actual);
    }
    @Test
    public void calculateGiftTax() {
        BigDecimal actual = TaxCalculator.calculateGiftTax(BigDecimal.valueOf(100500));
        Assert.assertEquals(new BigDecimal("15075.00"), actual);
    }
}