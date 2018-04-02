package my.app.model;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class SalesTaxTest {

    @Test
    public void calculateTax() {
        SalesTax salesTax = new SalesTax(BigDecimal.valueOf(10000));
        Assert.assertEquals(new BigDecimal("500.00"), salesTax.value);
    }
}