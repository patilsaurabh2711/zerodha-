package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.TestBase;

public class HomePage extends TestBase {
	@Test
	public void basenavigation() throws IOException 
	{
	driver=initaliaztion();
	driver.get("http://www.qaclickacademy.com/");
		
	}

}
