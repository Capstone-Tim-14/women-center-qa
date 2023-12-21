package starter.stepdefinitions.WebAdmin.Career;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.WebAdmin.Career.GetAllCareers;


public class GetAllCareersSteps {
    @Steps
    GetAllCareers getAllCareers;
    @Given("saya menetapkan API endpoint untuk mendapatkan semua karir")
    public void menetapkanApiEndpointUntukmendapatkanSemuaKarir(){
        getAllCareers.menetapkanApiEndpointUntukmendapatkanSemuaKarir();
    }
    @Given("saya menetapkan API endpoint untuk mendapatkan semua karir dengan sebuah ID")
    public void menetapkanApiEndpointUntukMendapatkanSemuaKarirDenganSebuahID(){
        getAllCareers.menetapkanApiEndpointUntukMendapatkanSemuaKarirDenganSebuahID();
    }
    @Given("saya menetapkan API endpoint yang salah untuk mendapatkan semua karir")
    public void menetapkanApiEndpointYangSalahUntukMendapatkanSemuaKarir(){
        getAllCareers.menetapkanApiEndpointYangSalahUntukMendapatkanSemuaKarir();
    }

    @When("saya mengirimkan request untuk mendapatkan semua karir dengan menggunakan token")
    public void mengirimkanRequestUntukMendapatkanSemuaKarirDenganMenggunakanToken(){
        getAllCareers.mengirimkanRequestUntukMendapatkanSemuaKarirDenganMenggunakanToken();
    }
    @And("saya menerima data karir")
    public void menerimaDataKarir(){
        getAllCareers.menerimaDataKarir();
    }
    @When("saya mengirimkan request untuk mendapatkan semua karir tanpa menggunakan token")
    public void mengirimkanRequestUntukMendapatkanSemuaKarirTanpaMenggunakanToken(){
        getAllCareers.mengirimkanRequestUntukMendapatkanSemuaKarirTanpaMenggunakanToken();
    }

    @When("saya mengirimkan request untuk mendapatkan semua karir dengan API endpoint yang salah")
    public void mengirimkanRequestUntukMendapatkanSemuaKarirDenganApEndpointYangSalah(){
        getAllCareers.mengirimkanRequestUntukMendapatkanSemuaKarirDenganApEndpointYangSalah();
    }

    @When("saya mengirimkan request untuk mendapatkan semua karir dengan menggunakan method POST")
    public void mengirimkanRequestUntukMendapatkanSemuaKarirDenganMenggunakanMethodPost(){
        getAllCareers.mengirimkanRequestUntukMendapatkanSemuaKarirDenganMenggunakanMethodPost();
    }
    @When("saya mengirimkan request untuk mendapatkan semua karir dengan menggunakan method PUT")
    public void mengirimkanRequestUntukMendapatkanSemuaKarirDenganMenggunakanMethodPut(){
        getAllCareers.mengirimkanRequestUntukMendapatkanSemuaKarirDenganMenggunakanMethodPut();
    }
    @When("saya mengirimkan request untuk mendapatkan semua karir dengan menggunakan method DELETE")
    public void mengirimkanRequestUntukMendapatkanSemuaKarirDenganMenggunakanMethodDelete(){
        getAllCareers.mengirimkanRequestUntukMendapatkanSemuaKarirDenganMenggunakanMethodDelete();
    }

    @When("saya mengirimkan request untuk mendapatkan semua karir dengan menggunakan sebuah ID")
    public void sayaMengirimkanRequestUntukMendapatkanSemuaKarirDenganMenggunakanSebuahID() {
        getAllCareers.mengirimkanRequestUntukMendapatkanSemuaKarirDenganMenggunakanIdValid();
    }
    @And("saya menerima data detail karir")
    public void menerimaDetalKarir() {
        getAllCareers.menerimaDetailKarir();
    }
    @Then("saya menerima status kode 400")
    public void menerimaStatuskode400(){
        getAllCareers.menerimaStatuskode400();
    }
    @And("saya menerima pesan error bad request")
    public void menerimaPesanErrorBadRequest(){
        getAllCareers.menerimaPesanErrorBadrequest();
    }

}


