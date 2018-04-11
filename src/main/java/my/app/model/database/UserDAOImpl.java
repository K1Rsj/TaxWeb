package my.app.model.database;

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

    public boolean addUser(User user) {
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
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(DbQueries.SELECT_ALL_FROM_TAX);
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setSurname(rs.getString("surname"));
                user.setGift(rs.getBigDecimal("gift"));
                user.setIncome(rs.getBigDecimal("income"));
                user.setInterest(rs.getBigDecimal("interest"));
                user.setSales(rs.getBigDecimal("sales"));
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public List<User> findById() {
        return null;
    }

    @Override
    public List<User> findByName() {
        return null;
    }

    @Override
    public boolean updateUser(User user) {
        return false;
    }

    @Override
    public boolean deleteUser(User user) {
        return false;
    }



}


