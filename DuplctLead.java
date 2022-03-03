package drive;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class DuplctLead {
	public static void main(String[] args) throws InterruptedException {
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
        
         driver.findElement(By.className("inputBox")).sendKeys("IT");
         driver.findElement(By.id("createLeadForm departmentName")).sendKeys("IT");
         driver.findElement(By.id("createLeadForm description")).sendKeys("To create Leads");
         driver.findElement(By.id("createLeadForm primaryEmail")).sendKeys("giritharanec004@gmail.com");
         WebElement StateId = driver.findElement(By.id("createLeadForm generalStateProvinceGeoId"));
         Select state=new Select(StateId);
         state.selectByVisibleText("TAMILNADU");
         driver.findElement(By.className("smallSubmit")).click();
         String title2 = driver.getTitle();
         System.out.println(title2); 
         driver.findElement(By.linkText("Duplicate Lead")).click();
         WebElement Company = driver.findElement(By.id("createLeadForm companyName"));
         Company.clear();
         Company.sendKeys("HCL");
         WebElement Fname = driver.findElement(By.id("createLeadForm firstName"));
         Fname.clear();
         Fname.sendKeys("HAI");
         driver.findElement(By.className("smallSubmit")).click();
         String title4 = driver.getTitle();
         System.out.println(title4);
}
}