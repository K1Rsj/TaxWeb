package my.app.model.database;

import my.app.model.entities.User;

import java.util.List;

public interface UserDAO {

    List<User> findById();
    List<User> findByName();
    List<User> getAllUsers();
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(User user);
}
