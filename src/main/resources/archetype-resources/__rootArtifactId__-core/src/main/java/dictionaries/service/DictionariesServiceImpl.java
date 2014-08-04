#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dictionaries.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import ${package}.dictionaries.presentation.DictionariesFinder;
import ${package}.model.EodDictionaries;

import java.util.Collection;

/**
 * Created by ppiskorski on 2014-07-31.
 */
public class DictionariesServiceImpl implements DictionariesService {

    @Autowired
    DictionariesFinder dictionariesFinder;

    private Logger log = LoggerFactory.getLogger(DictionariesFinder.class);

    @Override
    public Collection<EodDictionaries> getAllDictionaries() {
        log.info("Action get all Dictionaries");
        return dictionariesFinder.findAllDictionaries();
    }
}
