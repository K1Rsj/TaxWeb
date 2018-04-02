package my.app.model;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class InterestTaxTest {

    @Test
    public void calculateTax() {
        InterestTax interestTax = new InterestTax(BigDecimal.valueOf(10000));
        Assert.assertEquals(new BigDecimal("500.00"), interestTax.value);
    }
}