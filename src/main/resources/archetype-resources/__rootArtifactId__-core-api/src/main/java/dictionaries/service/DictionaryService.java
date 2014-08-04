#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dictionaries.service;

import ${package}.model.EodDictionary;

import java.util.Collection;

/**
 * Created by ppiskorski on 2014-08-01.
 */
public interface DictionaryService {
    Collection<EodDictionary> getAllDictionaryElements(Integer idEodDictionaries);
}
