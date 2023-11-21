package test_suite;

import browser_factory.Base_Test;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Write down the following test into ‘LoginTest’ class
 * 1. userSholdLoginSuccessfullyWithValidCredentials
 * <p>
 * * Enter “standard_user” username
 * * Enter “secret_sauce” password
 * * Click on ‘LOGIN’ button
 * * Verify the text “PRODUCTS”
 * <p>
 * <p>
 * 2. verifyThatSixProductsAreDisplayedOnPage
 * <p>
 * * Enter “standard_user” username
 * * Enter “secret_sauce” password
 * * Click on ‘LOGIN’ button
 * * Verify that six products are displayed on
 * page
 */
public class Login_Test extends Base_Test {

    String baseUrl = "https://www.saucedemo.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {

        //Enter “standard_user” username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        //Enter “secret_sauce” password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        //click on ‘LOGIN’ button
        driver.findElement(By.id("login-button")).click();

        //Verify the text “PRODUCTS”
        String expectedText="PRODUCTS";
        String actualText=driver.findElement(By.xpath("//span")).getText();

        Assert.assertEquals(expectedText,actualText);
        System.out.println("Method 1");
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {

        // Enter “standard_user” username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        //Enter “secret_sauce” password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        // Click on ‘LOGIN’ button
        driver.findElement(By.id("login-button")).click();

        //Verify that six products are displayed page

        //product 1
        String expectedProduct1="Sauce Labs Backpack";
        String actaulProduct1=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).getText();
          Assert.assertEquals(expectedProduct1,actaulProduct1);

        //product 2
        String expectedProduct2="Sauce Labs Bike Light";
        String actaulProduct2=driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']")).getText();
        Assert.assertEquals(expectedProduct2,actaulProduct2);

        //product 3
        String expectedProduct3="Sauce Labs Bolt T-Shirt";
        String actaulProduct3=driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']")).getText();
        Assert.assertEquals(expectedProduct3,actaulProduct3);

        //product 4
        String expectedProduct4="Sauce Labs Fleece Jacket";
        String actaulProduct4=driver.findElement(By.xpath("//div[text()='Sauce Labs Fleece Jacket']")).getText();
        Assert.assertEquals(expectedProduct4,actaulProduct4);

        //product 5
        String expectedProduct5="Sauce Labs Onesie";
        String actaulProduct5=driver.findElement(By.xpath("//div[text()='Sauce Labs Onesie']")).getText();
        Assert.assertEquals(expectedProduct5,actaulProduct5);

        //product 1
        String expectedProduct6="Test.allTheThings() T-Shirt (Red)";
        String actaulProduct6=driver.findElement(By.xpath("//div[text()='Test.allTheThings() T-Shirt (Red)']")).getText();
        Assert.assertEquals(expectedProduct6,actaulProduct6);

        System.out.println("Method 2");
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
