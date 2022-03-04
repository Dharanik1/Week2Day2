package week2Day2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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

		 driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		 driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9876543210");
			driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
			driver.findElement(By.xpath("//span[text()='Lead List']")).click();

			driver.findElement(By.xpath("//a[contains(text(),'17959')]")).click();

			String lead=driver.getTitle();
			System.out.println(lead);

			driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
			//once this id deleted it wont be shown again//
			driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10042");
			driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();

			 String lead1 =driver.getTitle();
			 System.out.println("lead1");
	}

}
