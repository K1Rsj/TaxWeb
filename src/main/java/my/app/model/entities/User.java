package my.app.model.entities;


import my.app.GlobalConstants;
import my.app.model.services.TaxCalculator;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class User {
    private int id;
    private String name;
    private String surname;
    private BigDecimal income;
    private BigDecimal sales;
    private BigDecimal interest;
    private BigDecimal gift;


    public void createTaxSheet(HashMap<String, BigDecimal> inputData) {
        for (Map.Entry<String, BigDecimal> pair : inputData.entrySet()) {
            if (GlobalConstants.INCOME.equals(pair.getKey())) {
                income = TaxCalculator.calculateIncomeTax(pair.getValue());

            } else if (GlobalConstants.SALES.equals(pair.getKey())) {
                sales = TaxCalculator.calculateSalesTax(pair.getValue());

            } else if (GlobalConstants.INTEREST.equals(pair.getKey())) {
                interest = TaxCalculator.calculateInterestTax(pair.getValue());

            } else if (GlobalConstants.GIFT.equals(pair.getKey())) {
                gift = TaxCalculator.calculateGiftTax(pair.getValue());

            }
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public BigDecimal getIncome() {
        return income;
    }

    public void setIncome(BigDecimal income) {
        this.income = income;
    }

    public BigDecimal getSales() {
        return sales;
    }

    public void setSales(BigDecimal sales) {
        this.sales = sales;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public BigDecimal getGift() {
        return gift;
    }

    public void setGift(BigDecimal gift) {
        this.gift = gift;
    }


    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", income tax=" + income +
                ", sales tax=" + sales +
                ", interest tax=" + interest +
                ", gift tax=" + gift;
    }
}
