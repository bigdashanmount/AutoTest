package lessons;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\Tools\\geckodriver.exe");  
        
		//初始化一个火狐浏览器实例，实例名称叫driver  
        WebDriver driver = new FirefoxDriver();  
         
        
     // 打开登录界面
        driver.get("https://www.imooc.com/user/newlogin/from_url/");
        driver.manage().window().maximize();
        //输入账号密码
        driver.findElement(By.tagName("input")).sendKeys("850512700@qq.com");
        driver.findElement(By.name("password")).sendKeys("shan6500333jie");
        //取消七天自动登录
        driver.findElement(By.id("auto-signin")).click();
        //点击立即注册
        driver.findElement(By.linkText("立即注册")).click();
        //点击直接登录,就会返回登录界面  
        driver.findElement(By.partialLinkText("直接")).click();
        //输入密码
        driver.findElement(By.tagName("input")).sendKeys("850512700@qq.com");
        driver.findElement(By.name("password")).sendKeys("shan6500333jing");
        //点击登录
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[3]/div[1]/div/div/form/div[5]/input")).click();
        
        driver.get("https://www.imooc.com/");
        driver.findElement(By.className("icon-search")).click();
	    driver.findElement(By.className("search-input")).sendKeys("6666");
	    WebElement element = driver.findElement(By.className("nav-item"));
	    List<WebElement>elements =  element.findElements(By.tagName("li"));
	    elements.get(3).click();
	    
	}

}
