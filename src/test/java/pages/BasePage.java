package pages;

// Importaciones necesarias
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.Serenity;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage() {
        this.driver = Serenity.getWebdriverManager().getWebdriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        maximizeWindow();
    }

     public void navigateTo(String url) {
        driver.get(url);
    }

      private void maximizeWindow() {
        driver.manage().window().maximize();
    }

    public void closeBrowser() {
        driver.quit();
    }

    private WebElement find(String locator) {
            return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }

    public void clickElement(String locator) {
        find(locator).click();
    }

    public void write(String locator, String text) {
        find(locator).sendKeys(text);
    }

    public void acceptAlert() {
        Alert alerta = wait.until(ExpectedConditions.alertIsPresent());
        alerta.accept();
    }

    public void esperarUnosSegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String acceptarAlertaRegistro() {
        esperarUnosSegundos(2);
        Alert alert = driver.switchTo().alert();

         String alertaTexto = alert.getText();

        alert.accept();

            return alertaTexto;
    }
}