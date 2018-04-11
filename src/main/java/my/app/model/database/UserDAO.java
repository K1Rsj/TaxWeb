package my.app.model.database;

import my.app.model.entities.User;

import java.util.List;

public interface UserDAO {

    List<User> findById();
    List<User> findByName();
    List<User> getAllUsers();
    boolean addUser(User user);
    boolean updateUser(User user);
    boolean deleteUser(User user);
}
