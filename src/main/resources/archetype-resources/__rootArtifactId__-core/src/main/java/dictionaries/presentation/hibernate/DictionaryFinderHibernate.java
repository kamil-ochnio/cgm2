#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dictionaries.presentation.hibernate;

import ${package}.dictionaries.presentation.DictionaryFinder;
import ${package}.hibernate.AbstractHibernateDAO;
import ${package}.model.EodDictionary;

import java.util.Collection;

/**
 * Created by ppiskorski on 2014-08-01.
 */
public class DictionaryFinderHibernate extends AbstractHibernateDAO<EodDictionary, Integer> implements DictionaryFinder {

    public DictionaryFinderHibernate() {
        super(EodDictionary.class);
    }

    @Override
    public Collection<EodDictionary> findAllDictionaryElements(Integer idEodDictionaries) {
        return createQuery("from  EodDictionary WHERE idEodDictionaries = :ID_EOD_DICTIONARIES")
                .setParameter("ID_EOD_DICTIONARIES", idEodDictionaries)
                .getResultList();
    }
}