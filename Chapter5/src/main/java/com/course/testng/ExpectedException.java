package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedException {
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("shibai 异常测试");
    }

   @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("chegngong,异常测试");
        throw new RuntimeException();

    }
}
