package starter.stepdefinitions.WebAdmin.Article;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.WebAdmin.Article.GetAllArticles;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;


public class GetAllArticlesSteps {

    @Steps
    GetAllArticles getAllArticles;

    @Given("saya menetapkan API endpoint untuk mendapatkan semua artikel")
    public void menetapkanApiEndpointUntukmendapatkanSemuaArtikel(){
        getAllArticles.menetapkanApiEndpointUntukmendapatkanSemuaArtikel();
    }
    @Given("saya menetapkan API endpoint dengan sebuah ID untuk mendapatkan semua artikel")
    public void menetapkanApiEndpointDenganSebuahID(){
        getAllArticles.menetapkanApiEndpointDenganSebuahID();
    }
    @Given("saya menetapkan API endpoint yang salah untuk mendapatkan semua artikel")
    public void menetapkanApiEndpointYangSalahUntukMendapatkanSemuaArtikel(){
        getAllArticles.menetapkanApiEndpointYangSalahUntukMendapatkanSemuaArtikel();
    }
    @Given("saya menetapkan API endpoint untuk mendapatkan semua artikel berdasarkan halaman")
    public void menetapkanApiEndpointUntukmendapatkanSemuaArtikelBerdasarkanHalaman(){
        getAllArticles.menetapkanApiEndpointUntukmendapatkanSemuaArtikelBerdasarkanHalaman();
    }
    @When("saya mengirimkan request untuk mendapatkan semua artikel dengan menggunakan token")
    public void mengirimkanRequestUntukMendapatkanSemuaArtikelDenganMenggunakanToken(){
        getAllArticles.mengirimkanRequestUntukMendapatkanSemuaArtikelDenganMenggunakanToken();
    }
    @When("saya mengirimkan request untuk mendapatkan semua artikel berdasarkan halaman")
    public void mengirimkanRequestUntukMendapatkanSemuaArtikelBerdasarkanHalaman(){
       getAllArticles.mengirimkanRequestUntukMendapatkanSemuaArtikelBerdasarkanHalaman();
    }
    @And("saya menerima data artikel")
    public void menerimaDataArtikel(){
        getAllArticles.menerimaDataArtikel();
    }
    @When("saya mengirimkan request untuk mendapatkan semua artikel tanpa menggunakan token")
    public void mengirimkanRequestUntukMendapatkanSemuaArtikelTanpaMenggunakanToken(){
        getAllArticles.mengirimkanRequestUntukMendapatkanSemuaArtikelTanpaMenggunakanToken();
    }
    @When("saya mengirimkan request untuk mendapatkan semua artikel dengan menggunakan sebuah ID")
    public void mengirimkanRequestUntukMendapatkanSemuaArtikelDenganMenggunakanIdValid(){
        getAllArticles.mengirimkanRequestUntukMendapatkanSemuaArtikelDenganMenggunakanIdValid();
    }


    @When("saya mengirimkan request untuk mendapatkan semua artikel dengan API endpoint yang salah")
    public void mengirimkanRequestUntukMendapatkanSemuaArtikelDenganApEndpointYangSalah(){
        getAllArticles.mengirimkanRequestUntukMendapatkanSemuaArtikelDenganApEndpointYangSalah();
    }

    @When("saya mengirimkan request untuk mendapatkan semua artikel dengan menggunakan method POST")
    public void mengirimkanRequestUntukMendapatkanSemuaArtikelDenganMenggunakanMethodPost(){
        getAllArticles.mengirimkanRequestUntukMendapatkanSemuaArtikelDenganMenggunakanMethodPost();
    }
    @When("saya mengirimkan request untuk mendapatkan semua artikel dengan menggunakan method PUT")
    public void mengirimkanRequestUntukMendapatkanSemuaArtikelDenganMenggunakanMethodPut(){
        getAllArticles.mengirimkanRequestUntukMendapatkanSemuaArtikelDenganMenggunakanMethodPut();
    }
    @When("saya mengirimkan request untuk mendapatkan semua artikel dengan menggunakan method DELETE")
    public void mengirimkanRequestUntukMendapatkanSemuaArtikelDenganMenggunakanMethodDelete(){
       getAllArticles.mengirimkanRequestUntukMendapatkanSemuaArtikelDenganMenggunakanMethodDelete();
    }
    @And("saya menerima pesan error article Not Found")
    public void sayaMenerimaPesanErrorArtcileNotFound() {
        getAllArticles.sayaMenerimaPesanErrorArtcileNotFound();
    }
    @And("saya menerima data artikel sesuai no halaman")
    public void sayaMenerimaDataArtikelSesuaiNoHalaman() {
        getAllArticles.sayaMenerimaDataArtikelSesuaiNoHalaman();
    }
}
