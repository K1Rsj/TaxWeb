package my.app.model.entities;


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
            if ("income".equals(pair.getKey())) {
                income = (new IncomeTax(pair.getValue())).getValue();

            } else if ("sales".equals(pair.getKey())) {
                sales = (new SalesTax(pair.getValue())).getValue();

            } else if ("interest".equals(pair.getKey())) {
                interest = (new InterestTax(pair.getValue())).getValue();

            } else if ("gift".equals(pair.getKey())) {
                gift = (new GiftTax(pair.getValue())).getValue();

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
