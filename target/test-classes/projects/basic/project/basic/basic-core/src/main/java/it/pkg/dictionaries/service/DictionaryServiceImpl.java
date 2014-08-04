package it.pkg.dictionaries.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import it.pkg.dictionaries.presentation.DictionariesFinder;
import it.pkg.dictionaries.presentation.DictionaryFinder;
import it.pkg.model.EodDictionary;

import java.util.Collection;

/**
 * Created by ppiskorski on 2014-08-01.
 */
public class DictionaryServiceImpl implements DictionaryService {

    @Autowired
    DictionaryFinder dictionaryFinder;

    private Logger log = LoggerFactory.getLogger(DictionariesFinder.class);

    @Override
    public Collection<EodDictionary> getAllDictionaryElements(Integer idEodDictionaries) {
        log.info("Action get dictionary elements");
        return dictionaryFinder.findAllDictionaryElements(idEodDictionaries);
    }
}