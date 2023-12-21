package starter.stepdefinition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.artikel.artikelAdmin;
import starter.paket.paketAdmin;
public class Artikel_Steps {
    @Steps
    artikelAdmin artikelAdmin;
    @Steps
    paketAdmin paketAdmin;

    @When("Admin klik button artikel")
    public void adminKlikButtonArtikel(){
        artikelAdmin.clickbuttonartikel();
    }

    @And("Admin klik button buat artikel")
    public void adminKlikButtonBuatArtikel() {
        artikelAdmin.clickbuttonbuatartikel();
    }

    @And("Admin mengisi data artike")
    public void adminMengisiDataArtike() {
        artikelAdmin.inputjudul("Hallo");
        artikelAdmin.isiartikel("Hai");
        artikelAdmin.kategori();
        artikelAdmin.uploadimage("gambarprofil.jpg");
    }

    @Step
    @Then("Admin klik button publikasikan")
    public void adminKlikButtonPublikasikan() {
        artikelAdmin.publikasi();
    }

    @Then("artikel berhasil ditambahkan")
    public void artikelBerhasilDitambahkan() {

    }
}
