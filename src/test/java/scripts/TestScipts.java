package scripts;

import java.io.IOException;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generics.BaseTest;
import generics.Basepage;

import generics.genericUtils;
import pom.HomePage;

public class TestScipts extends BaseTest {
	public HomePage pi=null;
	@Test(enabled=true)
	public void testCreateEmployee(){
	    pi=new HomePage(driver);
		pi.setUserName("Admin");
		pi.setPwd("admin");
		pi.clickLogin();
		Basepage.verifyTitle("OrangeHRM");
		pi.clickPiM_Menu();
		pi.clickAddEmp_Menu();
		pi.setFirstName("Pratibha");
		pi.setLastName("MN");
		pi.clickSaveBtn();
		pi.verifyFirstName("Pratibha");
		
	}
}
	
	/*@Test(enabled=false)
	public void testDeleteEmployee() throws InterruptedException{
	     pi=new HomePage(driver);
		pi.setUserName("Admin");
		pi.setPwd("admin");
		pi.clickLogin();
		Basepage.verifyTitle("OrangeHRM");
		pi.clickPiM_Menu();
		pi.clickAddEmpList();
		Thread.sleep(2000);
		pi.clickEmpCheckBox("Hannah");
		pi.clickDelete();
		Thread.sleep(2000);
		pi.clickOK();
		Thread.sleep(2000);
		pi.verifyEmpIsNotPresent("Hannah");
	}

	@Test(enabled=false)
	public void testSortList() throws InterruptedException{
		 pi=new HomePage(driver);
		pi.setUserName("Admin");
		Thread.sleep(3000);
		pi.setPwd("admin");
		Thread.sleep(2000);
		pi.clickLogin();
		Basepage.verifyTitle("OrangeHRM");
		pi.clickPiM_Menu();
		//Thread.sleep(2000);
		pi.clickAddEmpList();
		//Thread.sleep(4000);
		genericUtils.sortListBox(driver.findElement(By.xpath("//select[@id='empsearch_job_title']")));
	}
}
*/