#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dictionaries.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import ${package}.dictionaries.presentation.DictionariesFinder;
import ${package}.dictionaries.presentation.DictionaryFinder;
import ${package}.model.EodDictionary;

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