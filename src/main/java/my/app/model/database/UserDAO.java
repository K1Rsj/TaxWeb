package my.app.model.database;

import my.app.model.entities.User;

import java.util.List;

public interface UserDAO {

    void addUser(User user);
    User findById();
    List<User> findByName();
    List<User> getAllUsers();
    void updateUser(User user);
    void deleteUser(User user);
}
