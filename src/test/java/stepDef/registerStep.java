package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.registerPages;

public class registerStep {
    registerPages RegisterPages;

    public registerStep(){
        this.RegisterPages = new registerPages();
    }

    @Given("user is on the registration page")
    public void userIsOnTheRegistrationPage() {
        RegisterPages.userIsOnTheRegistrationPage();
    }

    @When("user input all mandatory fields")
    public void userInputAllMandatoryFields() {
        RegisterPages.userInputAllMandatoryFields();
    }

    @And("click button daftar")
    public void clickButtonDaftar() {
        RegisterPages.clickButtonDaftar();
    }

    @Then("user will be redirect to otp page")
    public void userWillBeRedirectToOtpPage() {
        RegisterPages.userWillBeRedirectToOtpPage();
    }

    @When("user input phone number using invalid number")
    public void userInputPhoneNumberUsingInvalidNumber() {
        RegisterPages.userInputPhoneNumberUsingInvalidNumber();
    }

    @Then("button daftar will be disable")
    public void buttonDaftarWillBeDisable() {
        RegisterPages.buttonDaftarWillBeDisable();
    }

    @And("shown error Nomor handphone tidak valid")
    public void shownErrorNomorHandphoneTidakValid() {
        RegisterPages.shownErrorNomorHandphoneTidakValid();
    }

    @And("input other field")
    public void inputOtherField() {
        RegisterPages.inputOtherField();
    }

    @When("user input email using invalid email")
    public void userInputEmailUsingInvalidEmail() {
        RegisterPages.userInputEmailUsingInvalidEmail();
    }

    @And("shown error Format email tidak valid")
    public void shownErrorFormatEmailTidakValid() {
        RegisterPages.shownErrorFormatEmailTidakValid();
    }

    @When("user click syarat dan ketentuan")
    public void userClickSyaratDanKetentuan() {
        RegisterPages.userClickSyaratDanKetentuan();
    }

    @Then("redirect to syarat dan ketentuan page")
    public void redirectToSyaratDanKetentuanPage() {
        RegisterPages.redirectToSyaratDanKetentuanPage();
    }

    @When("user click kebijakan privasi")
    public void userClickKebijakanPrivasi() {
        RegisterPages.userClickKebijakanPrivasi();
    }

    @Then("redirect to kebijakan privasi page")
    public void redirectToKebijakanPrivasiPage() {
    }
}
