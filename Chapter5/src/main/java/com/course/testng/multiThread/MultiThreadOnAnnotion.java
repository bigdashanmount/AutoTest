package com.course.testng.multiThread;

import org.testng.annotations.Test;
//多线程测试,线程池默认1个，修改数量，增加线程池数量
public class MultiThreadOnAnnotion {
    @Test(invocationCount = 10,threadPoolSize = 4)
    public void test(){
        System.out.println(11);
        System.out.printf("Thread Id ; %s%n",Thread.currentThread().getId());
    }
}
