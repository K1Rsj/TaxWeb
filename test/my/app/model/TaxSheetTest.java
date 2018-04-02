package my.app.model;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class TaxSheetTest {
    private static HashMap<String, BigDecimal> inputData = new HashMap<>();

    @BeforeClass
    public static void kek() {
        inputData.put("income", BigDecimal.valueOf(9000));
        inputData.put("sales", BigDecimal.valueOf(1000));
        inputData.put("interest", BigDecimal.valueOf(8000));
        inputData.put("gift", BigDecimal.valueOf(10000));

    }

    @Test
    public void createTaxSheet() {
        TaxSheet taxSheet = new TaxSheet();
        taxSheet.setInputData(inputData);
        taxSheet.createTaxSheet();
        ArrayList<Tax> actual = new ArrayList<>();
        actual.add(new IncomeTax(BigDecimal.valueOf(9000)));
        actual.add(new SalesTax(BigDecimal.valueOf(1000)));
        actual.add(new InterestTax(BigDecimal.valueOf(8000)));
        actual.add(new GiftTax(BigDecimal.valueOf(10000)));
        actual.sort(new TaxComparator());
        Assert.assertEquals(taxSheet.getOutputData(), actual);
    }
}