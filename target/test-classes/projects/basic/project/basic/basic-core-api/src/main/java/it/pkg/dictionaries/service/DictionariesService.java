package it.pkg.dictionaries.service;

import java.util.Collection;
import it.pkg.model.EodDictionaries;

/**
 * Created by ppiskorski on 2014-07-31.
 */
public interface DictionariesService {
    Collection<EodDictionaries> getAllDictionaries();
}
