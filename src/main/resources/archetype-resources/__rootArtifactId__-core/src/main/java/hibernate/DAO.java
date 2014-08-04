#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.hibernate;

import java.io.Serializable;
import java.util.List;

/**
 * Base interface for NFZ application's DAOs.
 *
 * @param <T> type of the entity
 * @param <I> type of the ID
 * @author Jakub Starek, PL
 */
public interface DAO<T, I extends Serializable> {
    /**
     * Return an object with given <code>id</code>.
     *
     * @param id id of the object that will be loaded
     * @return Returning object with given type.
     */
    T get(I id);

    /**
     * Saving or updating the given entity. Return instance of the persisted
     * object (might be the same instance) with it's id set. If the instance was
     * already persisted the method return an updated (merged) instance.
     *
     * @param entity entity that will be persisted or merged
     * @return entity with values of the persisted object
     * @throws UnsupportedOperationException when the pool of objects is constant and cannot be changed
     *                                       (e.g. a dictionary)
     */
    T saveOrUpdate(T entity);

    /**
     * Removes given entity from the persistence context (database).
     *
     * @param entity entity that will be removed
     * @throws UnsupportedOperationException when the pool of objects is constant and cannot be changed
     *                                       (e.g. a dictionary)
     */
    void delete(T entity);

    List<Integer> findAllIds();

    T saveOrUpdateFlush(T entity);
}
