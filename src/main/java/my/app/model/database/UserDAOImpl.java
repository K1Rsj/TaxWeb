package my.app.model.database;

import my.app.GlobalConstants;
import my.app.model.entities.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class UserDAOImpl implements UserDAO {
    private Connection connection;

    public UserDAOImpl() {
        connection = DbUtil.getConnection();
    }

    public void addUser(User user) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement(DbQueries.ADD_INTO_TAX);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getSurname());
            preparedStatement.setBigDecimal(3, user.getGift());
            preparedStatement.setBigDecimal(4, user.getIncome());
            preparedStatement.setBigDecimal(5, user.getInterest());
            preparedStatement.setBigDecimal(6, user.getSales());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(DbQueries.SELECT_ALL_FROM_TAX);
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt(GlobalConstants.USER_ID));
                user.setName(rs.getString(GlobalConstants.NAME));
                user.setSurname(rs.getString(GlobalConstants.SURNAME));
                user.setGift(rs.getBigDecimal(GlobalConstants.GIFT));
                user.setIncome(rs.getBigDecimal(GlobalConstants.INCOME));
                user.setInterest(rs.getBigDecimal(GlobalConstants.INTEREST));
                user.setSales(rs.getBigDecimal(GlobalConstants.SALES));
                users.add(user);
            }
        } catch (SQLException e) {
            throw new RuntimeException();
        }
        return users;
    }

    @Override
    public User findById() {
        return null;
    }

    @Override
    public List<User> findByName() {
        return null;
    }

    @Override
    public void updateUser(User user) {
    }

    @Override
    public void deleteUser(User user) {
    }



}


