package LoginTests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by Dmitriy on 04.09.2017.
 */
public class LoginTestWithOutPageObject {
    //создаем обьект браузер
    //обьявили переменную
    WebDriver webDriver;

    @Test //аннотацию junit
    public void validLogOn() {
        //эта надпись нужно для того чтобы указать путь к файлу chromedriver для работы с ним
        File fileFF = new File(".././drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileFF.getAbsolutePath());

        //создали обьект ChromeDriver для работы с ним //ChromeDriver - это реализация webDriver
        //открыли браузер в маленьком размере
        webDriver = new ChromeDriver();
        // Менеджеру webDriver дали команды открыть браузер в макс размере
        webDriver.manage().window().maximize();

        //настроить дефолтное ожидание браузера при выполнении
        //браузер будет повторять действия которые мы задаем в течении 10 секунд, если не выполнит выведет ошибку
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Вствляет URL в адресную строку браузера
        webDriver.get("https://www.gog.com/");

        //Найди мне елемент по xpath -> указать локатор и вставь мне данные(sendKeys) в поле
        webDriver.findElement(By.xpath(".//a[@class='menu-link menu-link--anonymous menu-uppercase hide-on-touch-device']")).click();
        webDriver.findElement(By.xpath(".//form[@name='login']//h2[@class='form__title']"));
        webDriver.findElement(By.xpath(".//input[@id='login_username' and @name='login[username]']")).sendKeys("dim8035@gmail.com");
        webDriver.findElement(By.xpath(".//input[@id='login_password' and @name='login[password]']")).sendKeys("fagonom123live");
        webDriver.findElement(By.xpath(".//button[@id='login_login' and @name='login[login]']")).click();
        webDriver.findElement(By.xpath(".//a[@class='menu-link']"));

        //webDriver.findElement(By.xpath(".//li[@class='dropdown user user-menu']")).click();
        //webDriver.findElement(By.xpath(".//div[2][@class='pull-right']//a[@href='/logout']")).click();
        System.out.println("Successful entry to the site");

        //Дать команду webDriver -> close - закрывает вкладку quit - закрывает браузер
        //webDriver.quit();

    }
}
