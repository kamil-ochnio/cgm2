#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dictionaries.repository;


import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;
import ${package}.dictionaries.service.DictionaryService;
import ${package}.model.EodDictionary;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * Created by ppiskorski on 2014-08-01.
 */
@ContextConfiguration(locations = {"classpath:/META-INF/spring/core-context-test.xml"})
@TransactionConfiguration(defaultRollback = true)
public class DictionaryFinderTest  extends AbstractTransactionalTestNGSpringContextTests {

    @Resource
    private DictionaryService dictionaryService;

    @Test
    @Rollback(true)
    public void testFinder() {
        Integer idEodDictionaries = 1;
        Collection<EodDictionary> eodDictionary = dictionaryService.getAllDictionaryElements(idEodDictionaries);
        Assert.assertTrue(eodDictionary.size() > 0);
    }

}