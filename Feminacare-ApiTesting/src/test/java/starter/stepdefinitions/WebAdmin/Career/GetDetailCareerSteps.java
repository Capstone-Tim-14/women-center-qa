package starter.stepdefinitions.WebAdmin.Career;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.WebAdmin.Career.GetDetailCareer;

public class GetDetailCareerSteps{
    @Steps
    GetDetailCareer getDetailCareer;
    @Given("saya menetapkan API endpoint untuk mendapatkan detail karir dengan memasukan ID valid")
    public void menetapkanApiEndpointUntukmendapatkanDetailKarirDenganMemasukanIdValid(){
        getDetailCareer.menetapkanApiEndpointUntukmendapatkanDetailKarirDenganMemasukanIdValid();
    }
    @When("saya mengirimkan request untuk mendapatkan detail karir dengan menggunakan token")
    public void mengirimkanRequestUntukMendapatkanDetailKarirDenganMenggunakanToken(){
        getDetailCareer.mengirimkanRequestUntukMendapatkanDetailKarirDenganMenggunakanToken();
    }

    @Given("saya menetapkan API endpoint untuk mendapatkan detail karir dengan memasukan ID invalid")
    public void menetapkanApiEndpointUntukmendapatkanGetailKarirDenganMemasukanIdInvalid(){
        getDetailCareer.menetapkanApiEndpointUntukmendapatkanDetailKarirDenganMemasukanIdInvalid();
    }

    @When("saya mengirimkan request untuk mendapatkan detail karir tanpa menggunakan token")
    public void mengirimkanRequestUntukmendapatkanDetailKarirTanpaMenggunakanToken(){
        getDetailCareer.mengirimkanRequestUntukmendapatkanDetailKarirTanpaMenggunakanToken();
    }

    @Given("saya menetapkan API endpoint untuk mendapatkan detail karir tanpa memasukan ID")
    public void menetapkanApiEndpointUntukMendapatkanDetailKarirTanpaMemasukanId(){
        getDetailCareer.menetapkanApiEndpointUntukMendapatkanDetailKarirTanpaMemasukanId();
    }
    @When("saya mengirimkan request untuk mendapatkan detail karir tanpa memasukan ID")
    public void mengrimkanRequestUtukMendapatkanDetailKarirTanpaMemasukanID(){
        getDetailCareer.mengrimkanRequestUtukMendapatkanDetailKarirTanpaMemasukanID();
    }

    @Given("saya menetapkan API endpoint yang salah untuk mendapatkan detail karir")
    public void menetapkanApiEndpointYangSalahUntukmendapatkanDetailKarir(){
        getDetailCareer.menetapkanApiEndpointYangSalahUntukmendapatkanDetailKarir();
    }
    @When("saya mengirimkan request untuk mendapatkan detail karir dengan API endpoint yang salah")
    public void mengirimkanRequestUntukmendapatkanDetailKarirDenganApiEndpointSalah(){
        getDetailCareer.mengirimkanRequestUntukmendapatkanDetailKarirDenganApiEndpointSalah();
    }

    @When("saya mengirimkan request untuk mendapatkan detail karir dengan menggunakan method POST")
    public void mengirimkanRequestUntukMendapatkanDetailKarirDenganMethodPost(){
        getDetailCareer.mengirimkanRequestUntukMendapatkanDetailKarirDenganMethodPost();
    }

    @When("saya mengirimkan request untuk mendapatkan detail karir dengan menggunakan method PUT")
    public void mengirimkanRequestUntukmendapatkanDetailKarirDenganMenggunakanMethodPut(){
        getDetailCareer.mengirimkanRequestUntukmendapatkanDetailKarirDenganMenggunakanMethodPut();
    }

    @When("saya mengirimkan request untuk mendapatkan detail karir dengan menggunakan method DELETE")
    public void mengirimkanRequestUntukMendapatkanKarirDenganMenggunakanMethodDelete(){
        getDetailCareer.mengirimkanRequestUntukMendapatkanKarirDenganMenggunakanMethodDelete();
    }

    @When("saya mengirimkan request dengan invalid ID untuk mendapatkan detail karir")
    public void sayaMengirimkanRequestDenganInvalidIDUntukMendapatkanDetailKarir() {
        getDetailCareer.mengirimkanRequestUntukMendapatkanDetailKarirDenganMemasukanInvalidID();
    }
}
