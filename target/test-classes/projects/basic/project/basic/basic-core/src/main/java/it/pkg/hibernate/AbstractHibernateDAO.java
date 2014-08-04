package it.pkg.hibernate;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.io.Serializable;
import java.util.List;

/**
 * Base DAO implementation
 *
 * @author Jakub Starek, PL
 */

public abstract class AbstractHibernateDAO<T, I extends Serializable> implements DAO<T, I> {


    private final Class<T> entityType;
    @Autowired
    private EntityManager entityManager;

    @SuppressWarnings("unchecked")
    public AbstractHibernateDAO(Class<T> entityType) {
        this.entityType = entityType;
    }

    public void delete(T entity) {
        if (entity == null) {
            throw new IllegalArgumentException("entity cannot be null");
        }

        T merged = (T) entityManager.merge(entity);
        entityManager.remove(merged);
    }


    public List<Integer> findAllIds() {
        return createQuery("select id from " + entityType.getName()).getResultList();
    }


    public T get(I id) {
        if (id == null) {
            throw new IllegalArgumentException("id cannot be null");
        }

        return (T) entityManager.find(this.entityType, id);
    }

    public T saveOrUpdate(T entity) {
        if (entity == null) {
            throw new IllegalArgumentException("entity cannot be null");
        }
        T t = (T) entityManager.merge(entity);

        return t;
    }

    public T saveOrUpdateFlush(T entity) {
        if (entity == null) {
            throw new IllegalArgumentException("entity cannot be null");
        }

        T t = (T) entityManager.merge(entity);
        entityManager.flush();

        return t;
    }

    protected Query createQuery(String hqlQuery) {
        return entityManager.createQuery(hqlQuery);
    }

}
