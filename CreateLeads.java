package drive;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeads {
	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver ().setup();
	 ChromeDriver drive=new ChromeDriver();
	 drive.get("http://leaftaps.com/opentaps/control/main");
    drive.manage().window().maximize();
    drive.findElement(By.id("username")).sendKeys("demoSalesManager");
    drive.findElement(By.id("password")).sendKeys("crmsfa");
    drive.findElement(By.className("decorativeSubmit")).click();
    String title = drive.getTitle();
    System.out.println(title);
    drive.findElement(By.linkText("CRM/SFA")).click();        
    drive.findElement(By.linkText("Leads")).click();
    String title1 = drive.getTitle();
    System.out.println(title1);         
    drive.findElement(By.linkText("Create Lead")).click();
    drive.findElement(By.id("createLeadForm companyName")).sendKeys("HCL");
    WebElement sId = drive.findElement(By.id("createLeadForm dataSourceId"));
    Select choose=new Select(sId);
    choose.selectByIndex(3);
    drive.findElement(By.id("createLeadForm firstName")).sendKeys("GIRITHARAN");
    drive.findElement(By.id("createLeadForm lastName")).sendKeys("MUTHUSAMY");
 
    drive.findElement(By.className("input Box")).sendKeys("Non IT");
    drive.findElement(By.id("createLeadForm departName")).sendKeys("IT");
    drive.findElement(By.id("createLeadForm description")).sendKeys("To create Leads");
    drive.findElement(By.id("createLeadForm Email")).sendKeys("giritharanec004@gmail.com");
    WebElement StId = drive.findElement(By.id("createLeadForm on leaftaps"));
    Select state=new Select(StId);
    state.selectByVisibleText("tamil");
    drive.findElement(By.className("smallSubmit")).click();
    String title2 = drive.getTitle();
    System.out.println(title2);   
}
}