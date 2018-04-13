package my.app.model.services;

import java.math.BigDecimal;

public class TaxCalculator {
    public static BigDecimal calculateIncomeTax(BigDecimal data) {
        return data.multiply(BigDecimal.valueOf(0.18));
    }
    public static BigDecimal calculateSalesTax(BigDecimal data) {
        return data.multiply(BigDecimal.valueOf(0.1));
    }
    public static BigDecimal calculateInterestTax(BigDecimal data) {
        return data.multiply(BigDecimal.valueOf(0.05));
    }
    public static BigDecimal calculateGiftTax(BigDecimal data) {
        return data.multiply(BigDecimal.valueOf(0.15));
    }
}
