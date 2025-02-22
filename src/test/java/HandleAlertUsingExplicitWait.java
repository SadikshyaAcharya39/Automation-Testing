import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public class HandleAlertUsingExplicitWait {
    public static void main(String[] args) throws InterruptedException {

        // Handling alert without using switching command

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

//        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.get("https://testautomationpractice.blogspot.com/2018/09/automation-form.html");
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

//        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
//        Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
//        myAlert.sendKeys("Welcome");
//        myAlert.accept();


        // Scroll down

       /* Actions actions = new Actions(driver);
        Thread.sleep(5000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        WebElement txtBox = driver.findElement(By.xpath("//input[@id='input1']"));
        txtBox.click();
        Thread.sleep(5000);
        txtBox.sendKeys("Welcome");
        driver.findElement(By.xpath("//button[@id='btn1']")).click();

        */

        // To upload a file

       /*
        Actions actions = new Actions(driver);
        Thread.sleep(10000);

        for(int i = 0; i < 2; i++){
            actions.sendKeys(Keys.PAGE_DOWN).perform();
        }

        Thread.sleep(10000);
        WebElement uploadButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='singleFileInput']")));
        uploadButton.sendKeys("C:\\Users\\acer\\Documents\\2135241_Sadikshya_Acharya_Contextual_Report (1).pdf");
        driver.findElement(By.xpath("//button[normalize-space()='Upload Single File']")).click();

        */

        WebElement uploadFiles = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='multipleFilesInput']")));
        String[] files =
                {
                        "\"C:\\Users\\acer\\Documents\\Bug Reporting.xlsx\"",
                        "\"C:\\Users\\acer\\Documents\\Facebook Test Cases.xlsx\""
                };

        for(String uploadFile: files)
        {
            uploadFiles.sendKeys(uploadFile);
            Thread.sleep(5000);
        }




    }

}
