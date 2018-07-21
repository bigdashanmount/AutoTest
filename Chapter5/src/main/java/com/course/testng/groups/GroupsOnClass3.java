package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void teacher1(){
        System.out.println("分组测试，GroupsOnClass3,teacher11()方法运行");
    }
    public void teacher2(){
        System.out.println("分组测试，GroupsOnClass3,teacher22222()方法运行");
    }
}
