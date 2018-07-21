package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass2 {
    public void stu1(){
        System.out.println("分组测试，GroupsOnClass22222,stu1(111)方法运行");
    }
    public void stu2(){
        System.out.println("分组测试，GroupsOnClass22222,stu222()方法运行");
    }
}
