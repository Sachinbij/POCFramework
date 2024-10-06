package com.onelot.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class OneLotbase {
	public WebDriver d;
	@Parameters("browsers")

	@BeforeTest(groups = {"smoke","regression"})
	public void launchBrowser(String browsers) throws IOException {
		
		switch(browsers) {
		case "chrome": d=new ChromeDriver();
		break;
		case "edge" : d=new EdgeDriver();
		break;
		case "firefox" : d=new FirefoxDriver();
		break;
		default : d=new ChromeDriver();
			
		}

		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		FileLib_OneLot filelib=new FileLib_OneLot();
		String propertydata=filelib.radDataFromPropertyFile("url");
			d.get(propertydata);
			System.out.println("BeforeTest");
		}

	@AfterMethod(groups = {"smoke","regression"})

	public void AM() {
		System.out.println("After method");
	}

	@BeforeMethod(groups = {"smoke","regression"})

	public void BM() {
		System.out.println("BeforeMethods");
	}

	@AfterTest(groups = {"smoke","regression"})
	

	public void closeBrowser() {
		d.quit();
	}

}
