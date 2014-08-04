package it.pkg.dictionaries.presentation;

import it.pkg.hibernate.DAO;
import it.pkg.model.EodDictionary;

import java.util.Collection;

/**
 * Created by ppiskorski on 2014-08-01.
 */
public interface DictionaryFinder extends DAO<EodDictionary,Integer> {
    Collection<EodDictionary> findAllDictionaryElements(Integer idEodDictionaries);
}