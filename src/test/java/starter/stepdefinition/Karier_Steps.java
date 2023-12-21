package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.karier.karierAdmin;
import starter.paket.paketAdmin;
public class Karier_Steps {

    @Steps
    karierAdmin karierAdmin;
    @Steps
    paketAdmin paketAdmin;


    @Step
    @When("Admin klik button karier")
    public void adminKlikButtonKarier() {
        karierAdmin.clickbuttonkarier();
    }

    @Step
    @And("Admin klik button tambah karier")
    public void adminKlikButtonTambahKarier() {
        karierAdmin.clickbuttontambahkarier();
    }

    @Step
    @And("Admin mengisi data karier")
    public void adminMengisiDataKarier() {
        karierAdmin.uploadGambarKarier("gambarprofil.jpg", "gambarprofil.jpg");
    }

    @Step
    @And("Admin klik button simpan")
    public void adminKlikButtonSimpan() {

    }

    @Step
    @Then("karier berhasil ditambahkan")
    public void karierBerhasilDitambahkan() {
    }
}
