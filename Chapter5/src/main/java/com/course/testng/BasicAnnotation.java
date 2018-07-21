package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testCase1() {
        System.out.println("测试的第一个注解Test11111111111111");
    }

    @BeforeMethod
    public void beforeMthod() {
        System.out.println("测试注解beforeMethod测试方法");
    }

    @AfterMethod
    public void AfterMthod() {
        System.out.println("测试注解AfterMethod测试方法");
    }

    @Test
    public void testCase2() {
        System.out.println("测试的第一个注解Test22222222222222");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("测试注解beforeClass测试类");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("测试注解afterClass测试类");
    }
    @BeforeSuite
    public void beforeSuit() {
        System.out.println("测试注解beforesuit测试套");
    }
    @AfterSuite
    public void afterSuit() {
        System.out.println("测试注解aftersuit测试套");
    }
}


