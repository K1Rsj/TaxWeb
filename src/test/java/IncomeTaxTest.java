import my.app.model.entities.IncomeTax;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class IncomeTaxTest {

    @Test
    public void calculateTax() {
        IncomeTax incomeTax = new IncomeTax(BigDecimal.valueOf(10000));
        Assert.assertEquals(new BigDecimal("1800.00"), incomeTax.getValue());
    }
}