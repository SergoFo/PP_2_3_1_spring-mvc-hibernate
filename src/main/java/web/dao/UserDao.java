package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    void updateUser(User user);

    void deleteUser(Long id);

    User getUser(Long id);

    List<User> listUsers();
}
