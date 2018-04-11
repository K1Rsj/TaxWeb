import my.app.model.entities.InterestTax;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class InterestTaxTest {

    @Test
    public void calculateTax() {
        InterestTax interestTax = new InterestTax(BigDecimal.valueOf(10000));
        Assert.assertEquals(new BigDecimal("500.00"), interestTax.getValue());
    }
}