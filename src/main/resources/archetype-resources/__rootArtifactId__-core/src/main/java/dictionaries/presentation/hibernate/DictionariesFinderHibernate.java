#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dictionaries.presentation.hibernate;

import org.springframework.stereotype.Repository;
import ${package}.dictionaries.presentation.DictionariesFinder;
import ${package}.dictionaries.presentation.DictionariesFinder;
import ${package}.hibernate.AbstractHibernateDAO;
import ${package}.model.EodDictionaries;

import java.util.Collection;

/**
 * Created by ppiskorski on 2014-07-31.
 */
@Repository
public class DictionariesFinderHibernate extends AbstractHibernateDAO<EodDictionaries, Integer> implements DictionariesFinder {

    public DictionariesFinderHibernate() {
        super(EodDictionaries.class);
    }

    @Override
    public Collection<EodDictionaries> findAllDictionaries() {
        return createQuery("from  EodDictionaries")
                .getResultList();
    }
}
