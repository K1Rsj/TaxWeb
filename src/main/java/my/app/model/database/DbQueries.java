package my.app.model.database;

public interface DbQueries {
    String SELECT_ALL_FROM_TAX = "select * from tax";
    String ADD_INTO_TAX = "insert into tax(name, surname, gift, income, interest, sales) values (?, ?, ?, ?, ?, ? )";
}
