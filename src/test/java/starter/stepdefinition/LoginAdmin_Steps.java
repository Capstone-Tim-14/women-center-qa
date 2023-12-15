package starter.stepdefinition;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.loginAdmin;
public class LoginAdmin_Steps {

    @Steps
    loginAdmin loginAdmin;
    @Given("Admin berada di halaman login")
    public void adminberadadihalamanlogin() {
        loginAdmin.openVite();
    }

    @When("Admin memasukkan email")
    public void adminMemasukkanEmail() {
        loginAdmin.inputemail("adminA@ferminacare.com");
    }

    @And("Admin memasukkan password")
    public void adminMemasukkanPassword() {
        loginAdmin.inputpassword("admin123");
    }

    @And("Admin klik button login")
    public void theyClickTheLoginButton() {
        loginAdmin.clickbuttonlogin();
    }

    @Then("Admin diarahkan ke halaman {string}")
    public void theyShouldBeRedirectedToTheHomePage(String successLogin) {
        loginAdmin.validasiloginsuccess(successLogin);
    }

    @When("Admin memasukkan email yang salah")
    public void adminMemasukkanEmailYangSalah() {
        loginAdmin.inputemail("admin@ferminacare.com");
    }

    @Then("Muncul pesan error email salah")
    public void munculPesanErrorEmailPasswordSalah() {
        loginAdmin.failedLoginBecauseInvalidEmail();
    }

    @And("Admin memasukkan password yang salah")
    public void adminMemasukkanPasswordYangSalah() {
        loginAdmin.inputpassword("admin321");
    }


    @Then("Muncul pesan error password salah")
    public void munculPesanErrorPasswordSalah() {
        loginAdmin.failedLoginBecauseInvalidPassword();
    }

    @When("Admin mengosongkan email")
    public void adminMengosongkanEmail() {
        loginAdmin.inputemail("");
    }

    @And("Admin mengosongkan password yang salah")
    public void adminMengosongkanPasswordYangSalah() {
        loginAdmin.inputpassword("");
    }

    @Then("Muncul pesan error email dan password harus diisi")
    public void munculPesanErrorEmailDanPasswordHarusDiisi() {
        loginAdmin.failedLoginBecauseNotFillEmailPassword();
    }
}
