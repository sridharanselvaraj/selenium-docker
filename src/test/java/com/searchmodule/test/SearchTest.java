package com.searchmodule.test;

import com.searchmodule.pages.SearchPage;
import com.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {

    @Test
    @Parameters({"searchContent"})
    public void search(String searchContent){
        SearchPage searchPage = new SearchPage(driver);
        searchPage.goTo();
        searchPage.doSearch(searchContent);
        searchPage.goToVideos();
        int size =searchPage.printResult();
        Assert.assertTrue(size>0);
    }


}
