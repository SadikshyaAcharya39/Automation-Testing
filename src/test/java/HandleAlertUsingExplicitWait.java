import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandleAlertUsingExplicitWait {
    public static void main(String[] args) {

        // Handling alert without using switching command

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();


        // 1st condition

//        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
//        Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
//        System.out.println(myAlert.getText());
//        myAlert.accept();


        // 2nd Condition

//        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
//        Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
//        myAlert.accept();
//        myAlert.dismiss();

        // 3rd Condition

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
        myAlert.sendKeys("Welcome");
        myAlert.accept();
    }

}
