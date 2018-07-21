package com.course.testng;

import org.testng.annotations.Test;

public class IgnoreTest {
    @Test
    public void ignorel(){
        System.out.println("忽略测试111111");
    }
    @Test(enabled = false)
    public void ignore2(){
        System.out.println("忽略测试222222");

    }
    @Test
    public void ignore3(){
        System.out.println("忽略测试33333333333");
    }
}
