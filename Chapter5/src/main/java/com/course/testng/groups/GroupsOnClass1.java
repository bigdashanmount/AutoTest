package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass1 {

    public void stu1(){
        System.out.println("分组测试，GroupsOnClass1,stu1()方法运行");
    }
    public void stu2(){
        System.out.println("分组测试，GroupsOnClass1,stu2222)方法运行");
    }
}
