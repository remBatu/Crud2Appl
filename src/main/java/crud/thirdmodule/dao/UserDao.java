package crud.thirdmodule.dao;


import crud.thirdmodule.model.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();

    public void saveUser(User user);
    public User getUser(int id);

    public void update(User user);

    public void remove(User user);
}
