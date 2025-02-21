import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class HandlingCheckBoxes {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/2018/09/automation-form.html");
        driver.manage().window().maximize();

//        // 1. Select specific check box
//        driver.findElement(By.xpath("//input[@id='sunday']")).click();
//
//        // 2. Select all the checkboxes
//
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
//
////         Using for loop
//        for(int i = 0; i < checkboxes.size(); i++){
//            checkboxes.get(i).click();
//        }
//
////         Using Enhanced Loop
//        for(WebElement checkbox:checkboxes){
//            checkbox.click();
//        }


        // 3. Select last 3 check boxes, we don't know how many check boxes we have

        // Dynamically finding last three check boxes
         // Formula: Total number of checkBoxes - 3 = starting index

//        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
//        System.out.println(checkBoxes.size()-3);
//
//        for(int i = 4; i < checkBoxes.size(); i++){
//            checkBoxes.get(i).click();
//        }


        // 4. Select first 3 check boxes, we don't know how many check boxes we have

        // Dynamically finding first three check boxes


        /*
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        for(int i = 0; i < 3; i++){
             checkBoxes.get(i).click();
        }

         */

        // Unselect the selected check box

//        driver.findElement(By.xpath("//input[@id='monday']")).click();
//        driver.findElement(By.xpath("//input[@id='wednesday']")).click();
//        driver.findElement(By.xpath("//input[@id='saturday']")).click();

//        driver.findElement(By.xpath("//input[@id='monday']")).click();
//        driver.findElement(By.xpath("//input[@id='wednesday']")).click();
//        driver.findElement(By.xpath("//input[@id='saturday']")).click();


//        for(int i = 0; i < checkboxes.size(); i += 2){
//            checkboxes.get(i).click();
//            Thread.sleep(5000);
//            checkboxes.get(i).click();
//        }

        // 5. Unselect the selected one, and select the unselect ones

        // To select

        for(int i = 0; i < 3; i++){
            checkboxes.get(i).click();
        }

        // To unselect selected ones and select the unselect ones

        /*
        for(int i = 0; i < checkboxes.size(); i++){

            checkboxes.get(i).click();
        }

         */

        // To only unselect the selected ones

        Thread.sleep(5000);
        for(int i = 0; i < 3; i++){
            if(checkboxes.get(i).isSelected()){
                checkboxes.get(i).click();
            }
        }

    }
}
