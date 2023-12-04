package starter.stepdefinitions.WebAdmin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.WebAdmin.TagArticle.GetAllTags;
import starter.utils.GenerateToken;

public class GetAllTagsSteps {
    @Steps
    GetAllTags getAllTags;

    @Given("saya menetapkan API endpoint untuk mendapatkan semua tag artikel")
    public void menetapkanApiEndpointUntukMendapatkanSemuaTagArtikel(){
        getAllTags.menetapkanApiEndpointUntukMendapatkanSemuaTagArtikel();
    }
    @When("saya mengirimkan request untuk mendapatkan semua tag artikel dengan menggunakan token")
    public void mengirimkanRequestUntukMendapatkanSemuaTagArtikelDenganMenggunakanToken(){
        getAllTags.mengirimkanRequestUntukMendapatkanSemuaTagArtikelDenganMenggunakanToken();
    }
    @And("saya menerima data tag artikel")
    public void menerimaDataTagArtikel(){
        getAllTags.menerimaDataTagArtikel();
    }
    @When("saya mengirimkan request untuk mendapatkan semua tag artikel tanpa menggunakan token")
    public void mengirimkanRequestUntukMendapatkanSemuaTagArtikelTanpaMenggunakanToken(){
        getAllTags.mengirimkanRequestUntukMendapatkanSemuaTagArtikelTanpaMenggunakanToken();
    }
    @Given("saya menetapkan API endpoint dengan sebuah ID untuk mendapatkan tag artikel")
    public void menetapkanApiEndpointUntukMendapatkanTagArtikelDenganMenggunakanSebuahID(){
        getAllTags.menetapkanApiEndpointUntukMendapatkanTagArtikelDenganMenggunakanSebuahID();
    }
    @When("saya mengirimkan request untuk mendapatkan semua tag artikel dengan menggunakan sebuah ID")
    public void mengirimkanRequestUntukMendaptkanSemuaTagArtikelDenganMenggunakanSebuahID(){
        getAllTags.mengirimkanRequestUntukMendaptkanSemuaTagArtikelDenganMenggunakanSebuahID();
    }
    @Given("saya menetapkan API endpoint yang salah untuk mendapatkan semua tag artikel")
    public void menetapkanApiEndpointYangSalahUntukmendapatkanSemuaTagArtikel(){
        getAllTags.menetapkanApiEndpointYangSalahUntukmendapatkanSemuaTagArtikel();
    }
    @When("saya mengirimkan request untuk mendapatkan semua tag artikel dengan API endpoint yang salah")
    public void mengirimkanRequestUntukMendapatkanSemuaTagArtikelDenganApiEndpointYangSalah(){
        getAllTags.mengirimkanRequestUntukMendapatkanSemuaTagArtikelDenganApiEndpointYangSalah();
    }
    @When("saya mengirimkan request untuk mendapatkan semua tag artikel dengan menggunakan method POST")
    public void mengirimkanRequestUntukMendapatkanSemuaTagArtikelDenganMethodPost(){
        getAllTags.mengirimkanRequestUntukMendapatkanSemuaTagArtikelDenganMethodPost();
    }
    @When("saya mengirimkan request untuk mendapatkan semua tag artikel dengan menggunakan method PUT")
    public void mengirimkanRequestUntukMendapatkanSemuaTagArtikelDenganMethodPut(){
        getAllTags.mengirimkanRequestUntukMendapatkanSemuaTagArtikelDenganMethodPut();
    }
    @When("saya mengirimkan request untuk mendapatkan semua tag artikel dengan menggunakan method DELETE")
    public void mengirimkanRequestUntukMendapatkanSemuaTagArtikelDenganMethodDelete(){
        getAllTags.mengirimkanRequestUntukMendapatkanSemuaTagArtikelDenganMethodDelete();
    }

    @Then("saya menerima status kode 500")
    public void sayaMenerimaStatusKode() {
        getAllTags.menerimaStatusKode500();
    }

    @And("saya menerima pesan error record not found")
    public void sayaMenerimaPesanErrorRecordNotFound() {
        getAllTags.menerimaPesanErrorRecordNotfound();
    }
}
