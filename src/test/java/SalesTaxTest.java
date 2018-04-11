import my.app.model.entities.SalesTax;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class SalesTaxTest {

    @Test
    public void calculateTax() {
        SalesTax salesTax = new SalesTax(BigDecimal.valueOf(10000));
        Assert.assertEquals(new BigDecimal("1000.0"), salesTax.getValue());
    }
}