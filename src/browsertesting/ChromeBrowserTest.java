package browsertesting;
/**
 * BaseUrl = https://demowebshop.tricentis.com/
 * 1. Set up Chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current URL.
 * 5. Print the page source.
 * 6. Navigate to Url.
 * “https://demowebshop.tricentis.com/login ”
 * 7. Print the current URL.
 * 8. Navigate back to the home page.
 * 9. Navigate to the login page.
 * 10. Print the current URL.
 * 11. Refresh the page.
 * 12. Enter the email in the email field.
 * 13. Enter the password in the password field.
 * 14. Click on the Login Button.
 * 15. Close the browser.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {
        String baseUrl = "https://demowebshop.tricentis.com/";
        //1.Set up Chrome browser
        WebDriver driver = new ChromeDriver();

        //2.Open the URL into browser
        driver.get(baseUrl);
        //Maximise the Browser window
        driver.manage().window().maximize();
        //We give Implicit wait to the driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //3.Print the title of page
        String title = driver.getTitle();
        System.out.println(title);

        //4.Print the Current URL
        String currentUrl = driver.getCurrentUrl();
        System.out.println("The Current URL " + currentUrl);

        //5.Print the page source
        System.out.println("The page source : " + driver.getPageSource());

        //6.Navigate to URL
        String loginUrl = "https://demowebshop.tricentis.com/login";
        driver.navigate().to(loginUrl);

        //7.Print the current URL
        System.out.println("The Current URL " + currentUrl);

        //8.Navigate back to home page
        driver.navigate().back();
        System.out.println("The Current URL " + currentUrl);

        //9.Navigate to the login page
        driver.navigate().to(loginUrl);

        //10.Print the current URL
        System.out.println("The Current URL " + currentUrl);

        //11.Refresh the page
        driver.navigate().refresh();

        //12.Enter the email in the email field
        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("Pinal@gmail.com");

        //13.Enter the password in the password field
        WebElement password = driver.findElement(By.name("Password"));
        password.sendKeys("12345");

        //14.Click on the Login Button
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        //15.Close the browser
        driver.quit();

    }
}
