package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.paket.paketAdmin;

public class Paket_Steps {
    @Steps
    paketAdmin paketAdmin;

    @Step
    @Given("Admin berada di halaman dashboard")
    public void adminBeradaDiHalamanDasboard() {
        paketAdmin.openVite();
        paketAdmin.inputemail("adminA@ferminacare.com");
        paketAdmin.inputpassword("admin123");
        paketAdmin.clickbuttonlogin();
    }

    @Step
    @When("Admin klik button paket")
    public void adminKlikButtonPaket() {
        paketAdmin.clickbuttonpaket();
    }

    @Step
    @And("Admin klik button buat paket")
    public void adminKlikButtonBuatPaket() {
        paketAdmin.clickbuttonbuatpaket();
    }

    @Step
    @And("Admin mengisi data paket")
    public void adminMengisiDataPaket() {
        paketAdmin.isinamapaket("Paket Video Call");
        paketAdmin.isiharga("350000");
        paketAdmin.isidisplay("350000");
        paketAdmin.tipepaket();
        paketAdmin.jumlahsesi("2");
        paketAdmin.durasi("30");
        paketAdmin.benefit1();
        paketAdmin.benefit2();
    }

    @Step
    @And("Admin klik button tambah")
    public void adminKlikButtonTambah() {
        paketAdmin.tambah();
    }

    @Step
    @Then("paket berhasil ditambahkan")
    public void paketBerhasilDitambahkan() {
        paketAdmin.berhasil();
    }
}
