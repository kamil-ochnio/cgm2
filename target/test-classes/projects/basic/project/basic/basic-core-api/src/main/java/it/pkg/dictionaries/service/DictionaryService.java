package it.pkg.dictionaries.service;

import it.pkg.model.EodDictionary;

import java.util.Collection;

/**
 * Created by ppiskorski on 2014-08-01.
 */
public interface DictionaryService {
    Collection<EodDictionary> getAllDictionaryElements(Integer idEodDictionaries);
}
