package starter.stepdefinitions.WebAdmin.Article;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.WebAdmin.Article.GetAllArticles;

public class GetAllArticlesSteps {
    @Steps
    GetAllArticles getAllArticles;
    @Given("saya menetapkan API endpoint untuk mendapatkan semua artikel")
    public void menetapkanApiEndpointUntukmendapatkanSemuaArtikel(){
        getAllArticles.menetapkanApiEndpointUntukmendapatkanSemuaArtikel();
    }
    @Given("saya menetapkan API endpoint untuk mendapatkan semua artikel dengan sebuah ID")
    public void menetapkanApiEndpointUntukMendapatkanSemuaArtikelDenganSebuahID(){
        getAllArticles.menetapkanApiEndpointUntukMendapatkanSemuaArtikelDenganSebuahID();
    }
    @Given("saya menetapkan API endpoint yang salah untuk mendapatkan semua artikel")
    public void menetapkanApiEndpointYangSalahUntukMendapatkanSemuaArtikel(){
        getAllArticles.menetapkanApiEndpointYangSalahUntukMendapatkanSemuaArtikel();
    }

    @When("saya mengirimkan request untuk mendapatkan semua artikel dengan menggunakan token")
    public void mengirimkanRequestUntukMendapatkanSemuaArtikelDenganMenggunakanToken(){
        getAllArticles.mengirimkanRequestUntukMendapatkanSemuaArtikelDenganMenggunakanToken();
    }
    @And("saya menerima data artikel")
    public void menerimaDataArtikel(){
        getAllArticles.menerimaDataArtikel();
    }
    @When("saya mengirimkan request untuk mendapatkan semua artikel tanpa menggunakan token")
    public void mengirimkanRequestUntukMendapatkanSemuaArtikelTanpaMenggunakanToken(){
        getAllArticles.mengirimkanRequestUntukMendapatkanSemuaArtikelTanpaMenggunakanToken();
    }
    @When("saya mengirimkan request untuk mendapatkan semua artikel dengan menggunakan ID")
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
}
