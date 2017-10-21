package service;

import java.util.List;
import org.hibernate.Session;
import util.HibernateUtil;

public abstract class Service<T> {

    Session session;

    protected Class<T> clazz;

    public Service() {
        this.session = HibernateUtil.getSessionFactory().openSession();
    }

    public void save(T object) {
        session.getTransaction().begin();
        session.save(object);
        session.getTransaction().commit();
    }

    public T findById(int id) {
        return (T) session.get(clazz, id);
    }

    public List<T> findAll() {
        return session.createQuery("from " + clazz.getName()).list();
    }
}
