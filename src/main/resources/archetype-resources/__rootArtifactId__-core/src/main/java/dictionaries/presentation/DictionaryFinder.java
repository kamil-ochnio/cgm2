#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dictionaries.presentation;

import ${package}.hibernate.DAO;
import ${package}.model.EodDictionary;

import java.util.Collection;

/**
 * Created by ppiskorski on 2014-08-01.
 */
public interface DictionaryFinder extends DAO<EodDictionary,Integer> {
    Collection<EodDictionary> findAllDictionaryElements(Integer idEodDictionaries);
}