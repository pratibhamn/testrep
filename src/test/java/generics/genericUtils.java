package generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class genericUtils extends BaseTest{
	public  static void gSelectByIndex(WebElement element,int n){
		Select select=new Select(element);
		select.selectByIndex(n);
	}
public static void gSelectByValue(WebElement element,String value){
	Select select=new Select(element);
	select.selectByValue(value);
}
public static void  gSelectByVisibleText(WebElement element,String v){
	Select select=new Select(element);
	select.deselectByVisibleText(v);
}
public static void hover(WebDriver driver,WebElement toElement){
	Actions action=new Actions(driver);
	action.moveToElement(toElement).perform();
}

}
