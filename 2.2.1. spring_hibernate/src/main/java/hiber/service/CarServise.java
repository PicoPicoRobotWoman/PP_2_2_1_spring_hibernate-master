package hiber.service;

import hiber.model.User;

import java.util.List;

public interface CarServise {

    List<User> getUsersByModel(String model);
}
