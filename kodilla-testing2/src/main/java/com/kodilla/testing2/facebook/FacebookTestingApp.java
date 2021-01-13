package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class FacebookTestingApp {

    public static final String COOKIES_BUTTON_ID = "u_0_h";
    public static final String REGISTER_BUTTON_ID = "u_0_2";
    public static final String SELECT = "//div[contains(@class, \"_5k_5\")]/span/span/";
    public static final String SELECT_DAY =   SELECT + "select[1]";
    public static final String SELECT_MONTH = SELECT + "select[2]";
    public static final String SELECT_YEAR =  SELECT + "select[3]";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com");

        while (!driver.findElement(By.id(COOKIES_BUTTON_ID)).isDisplayed());

        WebElement cookies = driver.findElement(By.id(COOKIES_BUTTON_ID));
        cookies.click();

        WebElement register = driver.findElement(By.id(REGISTER_BUTTON_ID));
        register.click();

        Thread.sleep(1000);

        WebElement day = driver.findElement(By.xpath(SELECT_DAY));
        Select selectDay = new Select(day);
        selectDay.selectByValue("19");

        WebElement month = driver.findElement(By.xpath(SELECT_MONTH));
        Select selectMonth = new Select(month);
        selectMonth.selectByIndex(3);

        WebElement year = driver.findElement(By.xpath(SELECT_YEAR));
        Select selectYear = new Select(year);
        selectYear.selectByValue("1987");









    }
}
