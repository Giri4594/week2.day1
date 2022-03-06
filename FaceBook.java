package week2.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class FaceBook {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver ocrmdriver = new ChromeDriver();
		ocrmdriver.get("https://en-gb.facebook.com/");
		ocrmdriver.manage().window().maximize();
		ocrmdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ocrmdriver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		ocrmdriver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Giri Giri");
		ocrmdriver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Pollachi");
		ocrmdriver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("giritharanec004@gmail.com");
		ocrmdriver.findElement(By.xpath("//input[@name='re-enter email__']")).sendKeys("giritharanec004@gmail.com");
		ocrmdriver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("99654$90635");
		WebElement day = ocrmdriver.findElement(By.xpath("//select[@id='day']"));
		Select obday = new Select(day);
		obday.selectByVisibleText("04");
		WebElement month = ocrmdriver.findElement(By.xpath("//select[@id='month']"));
		Select obmonth = new Select(month);
		obmonth.selectByVisibleText("May");
		WebElement year = ocrmdriver.findElement(By.xpath("//select[@id='year']"));
		Select obyr = new Select(year);
		obyr.selectByVisibleText("0000");
		ocrmdriver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		ocrmdriver.findElement(By.xpath("//button[@name='websubmit']")).click();
	}
}
