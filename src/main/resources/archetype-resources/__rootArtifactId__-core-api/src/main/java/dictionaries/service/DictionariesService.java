#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dictionaries.service;

import java.util.Collection;
import ${package}.model.EodDictionaries;

/**
 * Created by ppiskorski on 2014-07-31.
 */
public interface DictionariesService {
    Collection<EodDictionaries> getAllDictionaries();
}
