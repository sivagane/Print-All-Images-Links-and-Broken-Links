package org.test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintBrokenLinksandNumberofBrokenLinks {
public static void main(String[] args) throws IOException,  MalformedURLException{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Links\\div\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.get("https://www.facebook.com/");
	List<WebElement> alllinks = d.findElements(By.tagName("a"));
	int count=0;
	for(int i=0;i<alllinks.size();i++){
		String linkname = alllinks.get(i).getAttribute("href");
		if(linkname!=null) {
			URL u=new URL(linkname);
		URLConnection uc = u.openConnection();
		 			HttpURLConnection h=(HttpURLConnection)uc;
					int rc = h.getResponseCode();
					if(rc!=200) {
						System.out.println(linkname);
						count++;
			}
		}
	}
	System.out.println(count);
}
}
