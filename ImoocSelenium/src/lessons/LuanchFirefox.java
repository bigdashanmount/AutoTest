package lessons;
import java.util.concurrent.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.firefox.FirefoxDriver;  
public class LuanchFirefox {

	public static void main(String[] args) {
		//System.setProperty("webdriver.firefox.marionette", ".\\Tools\\geckodriver.exe");  
		
        System.setProperty("webdriver.gecko.driver", ".\\Tools\\geckodriver.exe");  
          
        //初始化一个火狐浏览器实例，实例名称叫driver  
        WebDriver driver = new FirefoxDriver();  
        //最大化窗口  
        driver.manage().window().maximize();  
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);  
        // get()打开一个站点    
        driver.get("http://10.5.11.26/#/app/place-list#placeListBar");
        //点击个人信息，弹出登录界面
        //driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);  
        ///html/body/div/header/nav/div[2]/ul[2]/li[7]/a/em
        driver.findElement(By.xpath("/html/body/div/header/nav/div[2]/ul[2]/li[7]/a/em")).click();  
        System.out.println("显示登录状态为未登录");
        //点击登录
        driver.findElement(By.xpath("/html/body/div/aside[2]/nav/div/div/div/div/div/button[2]")).click();      
        //输入账号      
        driver.findElement(By.xpath("//*[@id='exampleInputEmail1']")).sendKeys("changsong.sun");
        //输入密码
        driver.findElement(By.xpath("//*[@id='exampleInputPassword1']")).sendKeys("11");
        //点击登录
        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/form/button")).click(); 
        //getTitle()获取当前页面title的值    
        System.out.println("当前打开页面的标题是： "+ driver.getTitle()+"没Bug");    
         
        //关闭并退出浏览器    
        //driver.quit();    
            
	}

}
