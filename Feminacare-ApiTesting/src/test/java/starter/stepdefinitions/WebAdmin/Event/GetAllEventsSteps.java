package starter.stepdefinitions.WebAdmin.Event;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.WebAdmin.Event.GetAllEvents;

public class GetAllEventsSteps {
    @Steps
    GetAllEvents getAllEvents;
    @Given("saya menetapkan API endpoint untuk mendapatkan semua event")
    public void menetapkanApiEndpointUntukmendapatkanSemuaEvent(){
        getAllEvents.menetapkanApiEndpointUntukmendapatkanSemuaEvent();    }
    @Given("saya menetapkan API endpoint untuk mendapatkan semua event dengan sebuah ID")
    public void menetapkanApiEndpointUntukMendapatkanSemuaEventDenganSebuahID(){
        getAllEvents.menetapkanApiEndpointUntukMendapatkanSemuaEventDenganSebuahID();
    }
    @Given("saya menetapkan API endpoint yang salah untuk mendapatkan semua event")
    public void menetapkanApiEndpointYangSalahUntukMendapatkanSemuaEvent(){
        getAllEvents.menetapkanApiEndpointYangSalahUntukMendapatkanSemuaEvent();
    }

    @When("saya mengirimkan request untuk mendapatkan semua event dengan menggunakan token")
    public void mengirimkanRequestUntukMendapatkanSemuaEventDenganMenggunakanToken(){
        getAllEvents.mengirimkanRequestUntukMendapatkanSemuaEventDenganMenggunakanToken();
    }
    @And("saya menerima data event")
    public void menerimaDataEvent(){
        getAllEvents.menerimaDataEvent();
    }
    @When("saya mengirimkan request untuk mendapatkan semua event dengan menggunakan sebuah ID")
    public void mengirimkanRequestUntukMendapatkanSemuaEventDenganMenggunakanIdValid(){
        getAllEvents.mengirimkanRequestUntukMendapatkanSemuaEventDenganMenggunakanIdValid();
    }

    @When("saya mengirimkan request untuk mendapatkan semua event dengan API endpoint yang salah")
    public void mengirimkanRequestUntukMendapatkanSemuaEventDenganApEndpointYangSalah(){
        getAllEvents.mengirimkanRequestUntukMendapatkanSemuaEventDenganApEndpointYangSalah();
    }

    @When("saya mengirimkan request untuk mendapatkan semua event dengan menggunakan method POST")
    public void mengirimkanRequestUntukMendapatkanSemuaEventDenganMenggunakanMethodPost(){
        getAllEvents.mengirimkanRequestUntukMendapatkanSemuaEventDenganMenggunakanMethodPost();
    }
    @When("saya mengirimkan request untuk mendapatkan semua event dengan menggunakan method PUT")
    public void mengirimkanRequestUntukMendapatkanSemuaEventDenganMenggunakanMethodPut(){
        getAllEvents.mengirimkanRequestUntukMendapatkanSemuaEventDenganMenggunakanMethodPut();
    }
    @When("saya mengirimkan request untuk mendapatkan semua event dengan menggunakan method DELETE")
    public void mengirimkanRequestUntukMendapatkanSemuaEventDenganMenggunakanMethodDelete(){
        getAllEvents.mengirimkanRequestUntukMendapatkanSemuaEventDenganMenggunakanMethodDelete();
    }

    @When("saya mengirimkan request untuk mendapatkan semua event tanpa menggunakan token")
    public void sayaMengirimkanRequestUntukMendapatkanSemuaEventTanpaMenggunakanToken() {
        getAllEvents.mengirimkanRequestUntukMendapatkanSemuaEventTanpaMenggunakanToken();
    }
}
