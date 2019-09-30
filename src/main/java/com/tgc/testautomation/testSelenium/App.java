package com.tgc.testautomation.testSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


/**
 * Hello world!
 *
 */
public class App 
{


    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App obj = new App();
        obj.iniciarWikipedia();
        
    }
    
    public void iniciarWikipedia() {
    	WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\jrobledo\\Documents\\tools\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize() ;
        driver.get("http:\\wikipedia.org");
    	WebDriverWait wait=new WebDriverWait(driver, 20);

    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        System.out.println( driver.getTitle());
        try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        WebElement button = driver.findElementById("js-link-box-es");
        button.click();
        WebElement searchbar = driver.findElementById("searchInput");

        searchbar.sendKeys("Agujero Negro");
        driver.findElementById("searchButton").click();
        
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.println( driver.findElementById("mw-content-text").getText());
    }
}
