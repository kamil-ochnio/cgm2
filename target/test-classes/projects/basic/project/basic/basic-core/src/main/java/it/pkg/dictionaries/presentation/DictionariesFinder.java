package it.pkg.dictionaries.presentation;

import it.pkg.hibernate.DAO;
import it.pkg.model.EodDictionaries;

import java.util.Collection;

/**
 * Created by ppiskorski on 2014-07-31.
 */
public interface DictionariesFinder extends DAO<EodDictionaries,Integer> {
    Collection<EodDictionaries> findAllDictionaries();
}
