package it.pkg.dictionaries.presentation.hibernate;

import org.springframework.stereotype.Repository;
import it.pkg.dictionaries.presentation.DictionariesFinder;
import it.pkg.dictionaries.presentation.DictionariesFinder;
import it.pkg.hibernate.AbstractHibernateDAO;
import it.pkg.model.EodDictionaries;

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
