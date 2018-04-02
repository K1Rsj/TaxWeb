package my.app.model;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class GiftTaxTest {

    @Test
    public void calculateTax() {
        GiftTax giftTax = new GiftTax(BigDecimal.valueOf(10500));
        Assert.assertEquals(new BigDecimal("1890.00"), giftTax.value);
    }
}