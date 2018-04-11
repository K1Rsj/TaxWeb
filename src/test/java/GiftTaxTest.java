import my.app.model.entities.GiftTax;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class GiftTaxTest {

    @Test
    public void calculateTax() {
        GiftTax giftTax = new GiftTax(BigDecimal.valueOf(10500));
        Assert.assertEquals(new BigDecimal("1575.00"), giftTax.getValue());
    }
}