package com.course.testng.groups;

import org.testng.annotations.Test;

//依赖测试,如果依赖错误，被依赖汇被跳过，不执行
public class DependTest {
    @Test
    public void test1(){
        System.out.println("11111run,");
        throw new RuntimeException();
    }
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("1222222run");
    }
}
