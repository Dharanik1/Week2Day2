package week2Day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		String title=driver.getTitle();
		System.out.println(title);
		 driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		 String leadpage=driver.getTitle();
		 System.out.println(leadpage);
		 driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		 driver.findElement(By.xpath("//input[@id='ext-gen248']")).sendKeys("Dhara");
			driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
			driver.findElement(By.xpath("//span[text()='Lead List']")).click();
			driver.findElement(By.xpath("//a[contains(text(),'17926')]")).click();


		 driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		 WebElement description=driver.findElement(By.xpath("//input[@id='updateLeadForm_firstName']"));
		 description.clear();
		 driver.findElement(By.xpath("//input[@id='updateLeadForm_firstName']")).sendKeys("Dhara");

		 driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();

		 String lead =driver.getTitle();
		 System.out.println("lead");
         driver.close();

	}

}
