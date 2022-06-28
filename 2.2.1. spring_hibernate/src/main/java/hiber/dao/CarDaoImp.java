package hiber.dao;

import hiber.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    @SuppressWarnings("unchecked")
    public List<User> getUsersByModel(String model) {
        String HQLQuery = "from User where car.model = :model";
        TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery(HQLQuery);
        query.setParameter("model", model);
        return query.getResultList();
    }
}
