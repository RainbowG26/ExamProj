package loginTests;

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
        File fileFF = new File("../ExamProj/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileFF.getAbsolutePath());

        //создали обьект ChromeDriver для работы с ним //ChromeDriver - это реализация webDriver
        //открыли браузер в маленьком размере
        webDriver = new ChromeDriver();
        // Менеджеру webDriver дали команды открыть браузер в макс размере
        webDriver.manage().window().maximize();

        //настроить дефолтное ожидание браузера при выполнении
        //браузер будет повторять действия которые мы задаем в течении 10 секунд, если не выполнит выведет ошибку
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Вставляет URL в адресную строку браузера
        webDriver.get("https://www.blablacar.co.uk/");

        //Найди мне елемент по xpath -> указать локатор и вставь мне данные(sendKeys) в поле
        webDriver.findElement(By.xpath(".//a[@href='/login']")).click();
        webDriver.findElement(By.xpath(".//div[@class='Dropdown Dropdown--login dropdown-menu']"));
        webDriver.findElement(By.xpath(".//input[@id='loginFormEmail']")).sendKeys("dim8035@gmail.com");
        webDriver.findElement(By.xpath(".//input[@id='loginFormPassword']")).sendKeys("dimag262017");
        webDriver.findElement(By.xpath(".//button[@class='c-button c-button--primary u-fullWidth u-block apply-btn-loader']")).click();
        webDriver.findElement(By.xpath(".//div[@class='tab-container']"));
        System.out.println("Successful entry to the site");

        //Дать команду webDriver -> close - закрывает вкладку quit - закрывает браузер
        //webDriver.quit();

    }
}
