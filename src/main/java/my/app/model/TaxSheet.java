package my.app.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TaxSheet {
    private HashMap<String, BigDecimal> inputData;
    private ArrayList<Tax> outputData;

    public synchronized void createTaxSheet() {
        outputData = new ArrayList<>();
        for (Map.Entry<String, BigDecimal> pair : inputData.entrySet()) {
            if ("income".equals(pair.getKey())) {
                outputData.add(new IncomeTax(pair.getValue()));

            } else if ("sales".equals(pair.getKey())) {
                outputData.add(new SalesTax(pair.getValue()));

            } else if ("interest".equals(pair.getKey())) {
                outputData.add(new InterestTax(pair.getValue()));

            } else if ("gift".equals(pair.getKey())) {
                outputData.add(new GiftTax(pair.getValue()));

            }
        }
        outputData.sort(new TaxComparator());
    }

    public void setInputData(HashMap<String, BigDecimal> inputData) {
        this.inputData = inputData;
    }

    public ArrayList<Tax> getOutputData() {
        return outputData;
    }
}
