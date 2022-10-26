package crud.thirdmodule.service;


import crud.thirdmodule.model.User;

import java.util.List;


public interface UserService {
    public List<User> getAllUsers();
    public void saveUser(User user);

    public User getUser(int id);

    public void update(User user);

    public void delete( int id);
}
