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
            switch (pair.getKey()) {
                case "income":
                    outputData.add(new IncomeTax(pair.getValue()));
                    break;
                case "sales":
                    outputData.add(new SalesTax(pair.getValue()));
                    break;
                case "interest":
                    outputData.add(new InterestTax(pair.getValue()));
                    break;
                case "gift":
                    outputData.add(new GiftTax(pair.getValue()));
                    break;
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
