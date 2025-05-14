package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static helper.utility.driver;
import static org.assertj.core.api.Assertions.assertThat;
public class registerPages {
    WebElement section;

    By phoneNumber = By.id("mobilePhone");
    By email = By.id("email");
    By firstName = By.id("firstName");
    By lastName = By.id("lastName");
    By buttonDaftar = By.xpath("(//button[@class='btn_SGZcZ btn-track btn--action_kallT RegistrationForm_form-container__button__pzJ9p'])[1]");
    By errorPhoneNumber = By.xpath("//div[text()='Nomor handphone tidak valid']\n");
    By errorEmail = By.xpath("//div[text()='Format email tidak valid']\n");
    By buttonSyaratKetentuan = By.xpath("//*[@id=\"__next\"]/main/div/div[2]/div/div[4]/label/span/button[1]");
    By buttonKebijakanPrivasi = By.xpath("//*[@id=\"__next\"]/main/div/div[2]/div/div[4]/label/span/button[2]");


    public void userIsOnTheRegistrationPage(){
        driver.get("https://www.cermati.com/app/gabung");
    }

    public void userInputAllMandatoryFields(){
        driver.findElement(phoneNumber).sendKeys("08120000001");
        driver.findElement(email).sendKeys("anantawidy@gmail.com");
        driver.findElement(firstName).sendKeys("Ananta");
        driver.findElement(lastName).sendKeys("Widyaswara");
    }

    public void clickButtonDaftar(){
        driver.findElement(buttonDaftar).click();
    }

    public void userWillBeRedirectToOtpPage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlContains("/verify-otp"));

        String url ="https://www.cermati.com/app/verify-otp?isWhatsAppFirst=true&target=/";
        assertThat(driver.getCurrentUrl())
                .as("User was not redirected to the expected URL")
                .isEqualTo(url);
    }

    public void userInputPhoneNumberUsingInvalidNumber(){
        driver.findElement(phoneNumber).sendKeys("0800000001");
    }

    public void inputOtherField(){
        driver.findElement(firstName).sendKeys("Ananta");
        driver.findElement(lastName).sendKeys("Widyaswara");
    }

    public void buttonDaftarWillBeDisable(){
        WebElement daftarButton = driver.findElement(buttonDaftar);
        boolean isDisabled = !daftarButton.isEnabled();

        assertThat(isDisabled)
                .as("Expected 'Daftar' button to be disabled, but it was enabled.")
                .isTrue();
    }

    public void shownErrorNomorHandphoneTidakValid(){
        WebElement errorElement = driver.findElement(errorPhoneNumber);

        String expectedError = "Nomor handphone tidak valid";
        String actualError = errorElement.getText();

        assertThat(actualError)
                .as("Pesan error tidak sesuai")
                .isEqualTo(expectedError);
    }

    public void userInputEmailUsingInvalidEmail(){
        driver.findElement(email).sendKeys("anantawidygmailcom");
    }

    public void shownErrorFormatEmailTidakValid(){
        WebElement errorElement = driver.findElement(errorEmail);

        String expectedError = "Format email tidak valid";
        String actualError = errorElement.getText();

        assertThat(actualError)
                .as("Pesan error tidak sesuai")
                .isEqualTo(expectedError);
    }

    public void userClickSyaratDanKetentuan(){
        driver.findElement(buttonSyaratKetentuan).click();
    }

    public void redirectToSyaratDanKetentuanPage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlContains("/pages/"));

        String url ="https://www.cermati.com/pages/terms-and-conditions";
        assertThat(driver.getCurrentUrl())
                .as("User was not redirected to the expected URL")
                .isEqualTo(url);
    }

    public void userClickKebijakanPrivasi(){
        driver.findElement(buttonKebijakanPrivasi).click();
    }

    public void redirectToKebijakanPrivasiPage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlContains("/pages/"));

        String url ="https://www.cermati.com/pages/privacy-policy";
        assertThat(driver.getCurrentUrl())
                .as("User was not redirected to the expected URL")
                .isEqualTo(url);
    }
}
