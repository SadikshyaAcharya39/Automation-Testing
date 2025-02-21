import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        // Normal Alert with OK Button

        // Click on JS Alert, these are web element, but the popUps came after clicking buttons ar enot web elements

//        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        // We can't use click method of alerts

//        Thread.sleep(5000);

        // Capture the alert window
//        driver.switchTo().alert().accept();

//        Alert myAlert = driver.switchTo().alert();

        // Can compare the text as well

//        System.out.println(myAlert.getText());
//        myAlert.accept();

        // 2. Confirmation Alert OK and Cancel Button

        /*
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        Thread.sleep(5000);

        Alert myAlert = driver.switchTo().alert();
        System.out.println(myAlert.getText());

        // For ok button
        myAlert.accept();

         */


        // For cancel button
//        myAlert.dismiss();;

//        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
//        driver.switchTo().alert().accept();
//        driver.switchTo().alert().dismiss();


//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
//        Alert myPrompt = driver.switchTo().alert();
//        myPrompt.sendKeys("Welcome");
//        myPrompt.accept();

    }
}
