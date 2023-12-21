package starter.stepdefinitions.WebAdmin.Specialist;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.WebAdmin.Specialist.GetAllSpecialist;

public class GetAllSpecialistSteps {
    @Steps
    GetAllSpecialist getAllSpecialist;
    @Given("saya menetapkan API endpoint untuk mendapatkan semua spesialis")
    public void menetapkanApiEndpointUntukmendapatkanSemuaSpesialis(){
        getAllSpecialist.menetapkanApiEndpointUntukmendapatkanSemuaSpesialis();
    }
    @Given("saya menetapkan API endpoint untuk mendapatkan semua spesialis dengan sebuah ID")
    public void menetapkanApiEndpointUntukMendapatkanSemuaSpesialisDenganSebuahID(){
        getAllSpecialist.menetapkanApiEndpointUntukMendapatkanSemuaSpesialisDenganSebuahID();
    }
    @Given("saya menetapkan API endpoint yang salah untuk mendapatkan semua spesialis")
    public void menetapkanApiEndpointYangSalahUntukMendapatkanSemuaSpesialis(){
        getAllSpecialist.menetapkanApiEndpointYangSalahUntukMendapatkanSemuaSpesialis();
    }

    @When("saya mengirimkan request untuk mendapatkan semua spesialis dengan menggunakan token")
    public void mengirimkanRequestUntukMendapatkanSemuaSpesialisDenganMenggunakanToken(){
        getAllSpecialist.mengirimkanRequestUntukMendapatkanSemuaSpesialisDenganMenggunakanToken();
    }
    @And("saya menerima data spesialis")
    public void menerimaDataSpesialis(){
        getAllSpecialist.menerimaDataSpesialis();
    }
    @When("saya mengirimkan request untuk mendapatkan semua spesialis tanpa menggunakan token")
    public void mengirimkanRequestUntukMendapatkanSemuaSpesialisTanpaMenggunakanToken(){
        getAllSpecialist.mengirimkanRequestUntukMendapatkanSemuaSpesialisTanpaMenggunakanToken();
    }
    @When("saya mengirimkan request untuk mendapatkan semua spesialis dengan menggunakan ID")
    public void mengirimkanRequestUntukMendapatkanSemuaSpesialisDenganMenggunakanIdValid(){
        getAllSpecialist.mengirimkanRequestUntukMendapatkanSemuaSpesialisDenganMenggunakanIdValid();
    }

    @When("saya mengirimkan request untuk mendapatkan semua spesialis dengan API endpoint yang salah")
    public void mengirimkanRequestUntukMendapatkanSemuaSpesialisDenganApEndpointYangSalah(){
        getAllSpecialist.mengirimkanRequestUntukMendapatkanSemuaSpesialisDenganApEndpointYangSalah();
    }

    @When("saya mengirimkan request untuk mendapatkan semua spesialis dengan menggunakan method POST")
    public void mengirimkanRequestUntukMendapatkanSemuaSpesialisDenganMenggunakanMethodPost(){
        getAllSpecialist.mengirimkanRequestUntukMendapatkanSemuaSpesialisDenganMenggunakanMethodPost();
    }
    @When("saya mengirimkan request untuk mendapatkan semua spesialis dengan menggunakan method PUT")
    public void mengirimkanRequestUntukMendapatkanSemuaSpesialisDenganMenggunakanMethodPut(){
        getAllSpecialist.mengirimkanRequestUntukMendapatkanSemuaSpesialisDenganMenggunakanMethodPut();
    }
    @When("saya mengirimkan request untuk mendapatkan semua spesialis dengan menggunakan method DELETE")
    public void mengirimkanRequestUntukMendapatkanSemuaSpesialisDenganMenggunakanMethodDelete(){
        getAllSpecialist.mengirimkanRequestUntukMendapatkanSemuaSpesialisDenganMenggunakanMethodDelete();
    }

    @When("saya mengirimkan request untuk mendapatkan semua spesialis dengan menggunakan sebuah ID")
    public void sayaMengirimkanRequestUntukMendapatkanSemuaSpesialisDenganMenggunakanSebuahID() {
        getAllSpecialist.mengirimkanRequestUntukMendapatkanSemuaSpesialisDenganMenggunakanIdValid();
    }
}
