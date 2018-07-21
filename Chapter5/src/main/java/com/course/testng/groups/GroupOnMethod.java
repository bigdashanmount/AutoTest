package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupOnMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.println("分组测试，服务端11111");
        }
    @Test(groups = "server")
    public void test2(){
        System.out.println("分组测试，服务端12222222");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("分组测试，客户端13333333");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("分组测试，客户端14444444");
    }
    @BeforeGroups("server")
     public void beforeGroupOnServe(){
         System.out.println("分组测试，组前运行");
     }
    @AfterGroups("server")
    public void afterGroupOnServe(){
        System.out.println("分组测试，组后运行");
    }
    @BeforeGroups("client")
    public void beforeGroupOnClient(){
        System.out.println("分组测试，组前运行");
    }
    @AfterGroups("client")
    public void afterGroupOnClient(){
        System.out.println("分组测试，组后运行");
    }

}
