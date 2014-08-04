#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dictionaries.presentation;

import ${package}.hibernate.DAO;
import ${package}.model.EodDictionaries;

import java.util.Collection;

/**
 * Created by ppiskorski on 2014-07-31.
 */
public interface DictionariesFinder extends DAO<EodDictionaries,Integer> {
    Collection<EodDictionaries> findAllDictionaries();
}
