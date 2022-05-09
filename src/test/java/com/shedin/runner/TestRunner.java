package com.shedin.runner;

import com.shedin.pagetest.AccountPageTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Categories.class)
@Suite.SuiteClasses(AccountPageTest.class)

public class TestRunner {

}