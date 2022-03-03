package drive;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeads {
	

		public static void main(String[] args)
				throws InterruptedException  {
			// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			 ChromeDriver driver=new ChromeDriver();
			 driver.get("http://leaftaps.com/opentaps/control/main");
	         driver.manage().window().maximize();
	         driver.findElement(By.id("username")).sendKeys("demoSalesManager");
	         driver.findElement(By.id("password")).sendKeys("crmsfa");
	         driver.findElement(By.className("decorativeSubmit")).click();
	         String title = driver.getTitle();
	         System.out.println(title);
	         driver.findElement(By.linkText("CRM/SFA")).click();        
	         driver.findElement(By.linkText("Leads")).click();
	         String title1 = driver.getTitle();
	         System.out.println(title1);         
	         driver.findElement(By.linkText("Create Lead")).click();
	         driver.findElement(By.id("createLeadForm companyName")).sendKeys("HCL");
	         WebElement sourceId = driver.findElement(By.id("createLeadForm dataSourceId"));
	         Select choose=new Select(sourceId);
	         choose.selectByIndex(3);
	         driver.findElement(By.id("createLeadForm firstName")).sendKeys("Giritharan");
	         driver.findElement(By.id("createLeadForm lastName")).sendKeys("Muthusamy");
	         
	         driver.findElement(By.className("inputBox")).sendKeys("Non IT");
	         driver.findElement(By.id("createLeadForm departmentName")).sendKeys("IT");
	         driver.findElement(By.id("createLeadForm description")).sendKeys("To Edit Leads");
	         driver.findElement(By.id("createLeadForm primaryEmail")).sendKeys("giritharanec004@gmail.com");
	         WebElement StateId = driver.findElement(By.id("createLeadForm generalStateProvinceGeoId"));
	         Select state=new Select(StateId);
	         state.selectByVisibleText("Tamilnadu");
	         driver.findElement(By.className("smallSubmit")).click();
	         String title2 = driver.getTitle();
	         System.out.println(title2);         
	         driver.findElement(By.linkText("Edit")).click();  
	         WebElement Description = driver.findElement(By.id("updateLeadForm description"));
	         Description.clear();
	         driver.findElement(By.id("updateLeadForm importantNote")).sendKeys("Important Note field to be Importantly Noted");
	         driver.findElement(By.className("smallSubmit")).click();
	         String title3 = driver.getTitle();
	         System.out.println(title3);         
}
}