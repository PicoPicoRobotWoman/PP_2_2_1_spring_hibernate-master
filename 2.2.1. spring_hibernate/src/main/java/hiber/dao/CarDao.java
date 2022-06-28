package hiber.dao;

import hiber.model.User;

import java.util.List;

public interface CarDao {

    List<User> getUsersByModel(String model);
}
