package starter.stepdefinitions.WebAdmin.Event;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.WebAdmin.Event.GetDetailEvent;

public class GetDetailEventSteps {
    @Steps
    GetDetailEvent getDetailEvent;
    @Given("saya menetapkan API endpoint untuk mendapatkan detail event dengan memasukan ID valid")
    public void menetapkanApiEndpointUntukmendapatkanDetailEventDenganMemasukanIdValid(){

        getDetailEvent.menetapkanApiEndpointUntukmendapatkanDetailEventDenganMemasukanIdValid();
    }
    @When("saya mengirimkan request untuk mendapatkan detail event dengan menggunakan token")
    public void mengirimkanRequestUntukMendapatkanDetailEventDenganMenggunakanToken(){
        getDetailEvent.mengirimkanRequestUntukMendapatkanDetailEventDenganMenggunakanToken();
    }

    @Given("saya menetapkan API endpoint untuk mendapatkan detail event dengan memasukan ID invalid")
    public void menetapkanApiEndpointUntukmendapatkanDetailEventDenganMemasukanIdInvalid(){

        getDetailEvent.menetapkanApiEndpointUntukmendapatkanDetailEventDenganMemasukanIdInvalid();
    }
    @When("saya mengirimkan request untuk mendapatkan detail event tanpa menggunakan token")
    public void mengirimkanRequestUntukmendapatkanDetailEventTanpaMenggunakanToken(){
        getDetailEvent.mengirimkanRequestUntukmendapatkanDetailEventTanpaMenggunakanToken();
    }

    @Given("saya menetapkan API endpoint untuk mendapatkan detail event tanpa memasukan ID")
    public void menetapkanApiEndpointUntukMendapatkanDetailEventTanpaMemasukanId(){

        getDetailEvent.menetapkanApiEndpointUntukMendapatkanDetailEventTanpaMemasukanId();
    }
    @When("saya mengirimkan request untuk mendapatkan detail event tanpa memasukan ID")
    public void mengrimkanRequestUtukMendapatkanDetailEventTanpaMemasukanID(){
        getDetailEvent.mengrimkanRequestUtukMendapatkanDetailEventTanpaMemasukanID();
    }

    @Given("saya menetapkan API endpoint yang salah untuk mendapatkan detail event")
    public void menetapkanApiEndpointYangSalahUntukmendapatkanDetailEvent(){

        getDetailEvent.menetapkanApiEndpointYangSalahUntukmendapatkanDetailEvent();
    }
    @When("saya mengirimkan request untuk mendapatkan detail event dengan API endpoint yang salah")
    public void mengirimkanRequestUntukmendapatkanDetailKarirDenganApiEndpointSalah(){
        getDetailEvent.mengirimkanRequestUntukmendapatkanDetailKarirDenganApiEndpointSalah();
    }


    @When("saya mengirimkan request untuk mendapatkan detail event dengan menggunakan method POST")
    public void mengirimkanRequestUntukMendapatkanDetailKarirDenganMethodPost(){
        getDetailEvent.mengirimkanRequestUntukMendapatkanDetailEventDenganMethodPost();
    }

    @When("saya mengirimkan request untuk mendapatkan detail event dengan menggunakan method PUT")
    public void mengirimkanRequestUntukmendapatkanDetailEventDenganMenggunakanMethodPut(){
        getDetailEvent.mengirimkanRequestUntukmendapatkanDetailEventDenganMenggunakanMethodPut();
    }
    @When("saya mengirimkan request untuk mendapatkan detail event dengan menggunakan method DELETE")
    public void mengirimkanRequestUntukMendapatkanKarirDenganMenggunakanMethodDelete(){
        getDetailEvent.mengirimkanRequestUntukMendapatkanKarirDenganMenggunakanMethodDelete();
    }


}
