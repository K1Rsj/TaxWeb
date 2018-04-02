package my.app.model;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class IncomeTaxTest {

    @Test
    public void calculateTax() {
        IncomeTax incomeTax = new IncomeTax(BigDecimal.valueOf(10000));
        Assert.assertEquals(new BigDecimal("1800.00"), incomeTax.value);
    }
}