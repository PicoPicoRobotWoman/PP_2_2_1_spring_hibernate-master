package hiber.service;

import hiber.dao.CarDao;
import hiber.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CarServiseImp implements CarServise {

    @Autowired
    private CarDao carDao;

    @Transactional(readOnly = true)
    @Override
    public List<User> getUsersByModel(String model) { return carDao.getUsersByModel(model);}
}
