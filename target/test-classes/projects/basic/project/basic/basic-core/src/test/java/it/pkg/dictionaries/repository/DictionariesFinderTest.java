package it.pkg.dictionaries.repository;

import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;
import it.pkg.dictionaries.service.DictionariesService;
import it.pkg.model.EodDictionaries;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * Created by ppiskorski on 2014-07-31.
 */
@ContextConfiguration(locations = {"classpath:/META-INF/spring/core-context-test.xml"})
@TransactionConfiguration(defaultRollback = true)
public class DictionariesFinderTest  extends AbstractTransactionalTestNGSpringContextTests {

    @Resource
    private DictionariesService dictionariesService;

    @Test
    @Rollback(true)
    public void testFinder() {
        Collection<EodDictionaries> eodDictionaries = dictionariesService.getAllDictionaries();
        Assert.assertTrue(eodDictionaries.size() > 0);
    }

}
