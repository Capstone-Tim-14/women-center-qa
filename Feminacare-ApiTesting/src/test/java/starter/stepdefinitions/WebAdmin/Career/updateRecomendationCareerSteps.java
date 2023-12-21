package starter.stepdefinitions.WebAdmin.Career;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.WebAdmin.Career.UpdateRecomendationCareer;

public class updateRecomendationCareerSteps {
    @Steps
    UpdateRecomendationCareer updateRecomendationCareer;
    @Given("saya menetapkan Api endpoint untuk mengedit status rekomendasi karir")
    public void menetapkanApiEndpointUntukMengeditStatusRekomendasiKarir(){
        updateRecomendationCareer.menetapkanApiEndpointUntukMengeditStatusRekomendasiKarir();
    }
    @When("saya mengirimkan request untuk mengedit status rekomendasi karir dengan memasukan data valid")
    public void mengirimkanRequestUntukMengeditStatusRekomendasiKarirDenganMemasukanDataValid(){
        updateRecomendationCareer.mengirimkanRequestUntukMengeditStatusRekomendasiKarirDenganMemasukanDataValid();
    }

    @When("saya mengirimkan request untuk mengedit status rekomendasi karir dengan memasukan data invalid")
    public void mengirmkanRequestUntukMengeditStatusRekomendasiKarirDEnganMemasukanDataInvalid(){
        updateRecomendationCareer.mengirmkanRequestUntukMengeditStatusRekomendasiKarirDEnganMemasukanDataInvalid();
    }

    @When("saya mengirimkan request untuk mengedit status rekomendasi karir dengan mengosongkan data status")
    public void mengirimkanRequestUntukMengeditStatusRekomendasiKarirDenganMengosongkanDataStatus(){
        updateRecomendationCareer.mengirimkanRequestUntukMengeditStatusRekomendasiKarirDenganMengosongkanDataStatus();
    }
    @And("saya mendapatkan pesan status rekomendasi karir berhasil diubah")
    public void mendapatkanPesanStatusRekomendasiKarirBerhasilDiubah(){
        updateRecomendationCareer.mendapatkanPesanStatusRekomendasiKarirBerhasilDiubah();
    }
}
