package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age){
        System.out.println("name = "+name+";   age ="+age);
    }
    @DataProvider(name="data")
    public Object[] [] providerDate(){
        //定义一个对象的二维数组并存储数据
        //提供返回值具体怎么实现都行
        Object [] [] o = new Object[][]{
                {"zhangsan",10},
                {"lisi",20},
                {"wangwu",30}
        };
        return o;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("name = "+name+";  方法11  age ="+age);
    }

   @Test(dataProvider = "methodData")
    public void test2(String name,int age){
    System.out.println("name = "+name+";  方法22  age ="+age);
}

    @DataProvider(name="methodData")
    public Object[] [] methodDataTest(Method method){
       Object[][] result=null;
       if(method.getName().equals("test1")){
           result = new Object[][]{
           {"zhangsan",10},
           {"lisi",20}
           };
       }else if (method.getName().equals("test2")){
           result = new Object[][]{
                   {"wangwu",100},
                   {"zhaoliu",200}
           };
       }
            return result;
    }

}
