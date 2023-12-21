package starter.stepdefinitions.WebAdmin.Career;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.WebAdmin.Career.GetAllRecomendationCareer;


public class GetAllRecomendationSteps {
    @Steps
    GetAllRecomendationCareer getAllRecomendationCareer;
    @Given("saya menetapkan API endpoint untuk mendapatkan semua rekomendasi karir")
    public void menetapkanApiEndpointUntukmendapatkanSemuaRekomendasiKarir(){
        getAllRecomendationCareer.menetapkanApiEndpointUntukmendapatkanSemuaRekomendasiKarir();
    }
    @And("saya menerima data detail rekomendasi karir")
    public void menerimaDetailRekomendasiKarir(){
        getAllRecomendationCareer.menerimaDetailRekomendasiKarir();
    }
    @Given("saya menetapkan API endpoint yang salah untuk mendapatkan semua rekomendasi karir")
    public void menetapkanApiEndpointYangSalahUntukMendapatkanSemuaRekomendasiKarir(){
        getAllRecomendationCareer.menetapkanApiEndpointYangSalahUntukMendapatkanSemuaRekomendasiKarir();
    }

    @When("saya mengirimkan request untuk mendapatkan semua rekomendasi karir dengan menggunakan token")
    public void mengirimkanRequestUntukMendapatkanSemuaRekomendasiKarirDenganMenggunakanToken(){
        getAllRecomendationCareer.mengirimkanRequestUntukMendapatkanSemuaRekomendasiKarirDenganMenggunakanToken();
    }
    @And("saya menerima data rekomendasi karir")
    public void menerimaDataRekomendasiKarir(){
        getAllRecomendationCareer.menerimaDataRekomendasiKarir();
    }
    @When("saya mengirimkan request untuk mendapatkan semua rekomendasi karir tanpa menggunakan token")
    public void mengirimkanRequestUntukMendapatkanSemuaRekomendasiKarirTanpaMenggunakanToken(){
        getAllRecomendationCareer.mengirimkanRequestUntukMendapatkanSemuaRekomendasiKarirTanpaMenggunakanToken();
    }

    @When("saya mengirimkan request untuk mendapatkan semua rekomendasi karir dengan API endpoint yang salah")
    public void mengirimkanRequestUntukMendapatkanSemuaRekomendasiKarirDenganApEndpointYangSalah(){
        getAllRecomendationCareer.mengirimkanRequestUntukMendapatkanSemuaRekomendasiKarirDenganApEndpointYangSalah();
    }

    @When("saya mengirimkan request untuk mendapatkan semua rekomendasi karir dengan menggunakan method POST")
    public void mengirimkanRequestUntukMendapatkanSemuaKarirDenganMenggunakanMethodPost(){
        getAllRecomendationCareer.mengirimkanRequestUntukMendapatkanSemuaKarirDenganMenggunakanMethodPost();
    }
    @When("saya mengirimkan request untuk mendapatkan semua rekomendasi karir dengan menggunakan method PUT")
    public void mengirimkanRequestUntukMendapatkanSemuaRekomendasiKarirDenganMenggunakanMethodPut(){
        getAllRecomendationCareer.mengirimkanRequestUntukMendapatkanSemuaRekomendasiKarirDenganMenggunakanMethodPut();
    }

}
