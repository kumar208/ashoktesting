package dargAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_MouseHoverOperation {

	public static void main(String[] args) {


		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		Actions act = new Actions(driver);
				
		WebElement DragEle=driver.findElement(By.id("draggable"));
		WebElement DropEle=driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(DragEle, DropEle).perform();

		driver.close();
	}

}
