import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class HandlingRadioButtons {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://testautomationpractice.blogspot.com/2018/09/automation-form.html");
        driver.manage().window().maximize();

        List<WebElement> radioButtons = driver.findElements(By.xpath("//div[@class='form-check form-check-inline' and @type='radio']"));

        // 1. Select multiple radio buttons
//        for(int i = 0; i < radioButtons.size(); i++){
//            radioButtons.get(i).click();
//        }
//
        // Using enhanced loop

//        for(WebElement radioButton:radioButtons){
//            radioButton.click();
//        }

        // 2. Select single radio button
        driver.findElement(By.xpath("//input[@value='female']")).click();



    }
}
