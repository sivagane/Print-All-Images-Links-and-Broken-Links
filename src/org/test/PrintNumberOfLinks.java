package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintNumberOfLinks {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Links\\div\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	List<WebElement> alllinks = driver.findElements(By.tagName("a"));
	int count=0;
	int s = alllinks.size();
    for(int i=0;i<s;i++) {
    	String st = alllinks.get(i).getAttribute("href");
    	
    		
    		count++;
    	
    	}
    System.out.println(count);
    }
}
