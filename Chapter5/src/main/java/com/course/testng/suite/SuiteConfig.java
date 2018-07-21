package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuit() {
         System.out.println("测试套before suit运行了");
    }
    @AfterSuite
    public void AfterSuit() {
        System.out.println("测试套After suit运行了");
    }
    @AfterTest
    public void AfterTest() {
        System.out.println("测试After test运行了");
    }
    @BeforeTest
    public void Before() {
        System.out.println("测试before test运行了");
    }
}
