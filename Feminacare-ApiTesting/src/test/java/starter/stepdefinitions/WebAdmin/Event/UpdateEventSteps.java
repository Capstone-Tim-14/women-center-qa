package starter.stepdefinitions.WebAdmin.Event;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.WebAdmin.Event.UpdateEvent;

public class UpdateEventSteps {
    @Steps
    UpdateEvent updateEvent;
    @Given("saya menetapkan Api endpoint untuk mengupdate data event dengan ID valid")
    public void menetapkanApiEndpointUntukMengupdateDataEventDenganIdValid(){
        updateEvent.menetapkanApiEndpointUntukMengupdateDataEventDenganIdValid();
    }
    @When("saya mengirimkan request untuk mengupdate data event dengan mengirimkan data lengkap seluruh field menggunakan method Put")
    public void mengirimkanRequestUntukmengupdateDataEventDenganMengirimkanDataLengkapSeluruhFieldMenggunakanMethodPut(){
        updateEvent.mengirimkanRequestUntukmengupdateDataEventDenganMengirimkanDataLengkapSeluruhFieldMenggunakanMethodPut();
    }
    @When("saya mengirimkan request untuk mengupdate data event dengan mengirimkan data beberapa field menggunakan method Put")
    public void mengirimkanRequestUntukmengupdateDataEventDenganMengirimkanDataLengkapBeberapaField(){
        updateEvent.mengirimkanRequestUntukmengupdateDataEventDenganMengirimkanDataLengkapBeberapaField();
    }
    @When("saya mengirimkan request untuk mengupdate data event dengan mengosongkan data")
    public void mengirimkanRequestUntukmengupdateDataEventDenganMengsongkanData(){
        updateEvent.mengirimkanRequestUntukmengupdateDataEventDenganMengsongkanData();
    }
    @Given("saya menetapkan Api endpoint untuk mengupdate data event dengan ID invalid")
    public void menetapkanApiEndpointUntukMengupdateDataEventDenganIdInvalid(){
        updateEvent.menetapkanApiEndpointUntukMengupdateDataEventDenganIdInvalid();
    }
    @When("saya mengirimkan request untuk mengupdate data event dengan mengirimkan data lengkap seluruh field namun dengan ID invalid")
    public void mengirimkanRequestUntukmengupdateDataEventDenganMengirimkanDataLengkapSeluruhFieldNamunMenggunakanIdInvalid(){
        updateEvent.mengirimkanRequestUntukmengupdateDataEventDenganMengirimkanDataLengkapSeluruhFieldNamunMenggunakanIdInvalid();
    }
    @When("saya mengirimkan request untuk mengupdate data event dengan mengirimkan data lengkap seluruh field menggunakan menggunakan data yang sudah tersedia")
    public void mengirimkanRequestUntukmengupdateDataEventDenganMengirimkanDataLengkapSeluruhFieldMenggunakanDataYangSudahTersedia(){
        updateEvent.mengirimkanRequestUntukmengupdateDataEventDenganMengirimkanDataLengkapSeluruhFieldMenggunakanDataYangSudahTersedia();
    }

    @And("saya menerima pesan data event berhasil diperbaharui")
    public void sayaMenerimaPesanDataEventBerhasilDiperbaharui() {
        updateEvent.sayaMenerimaPesanDataEventBerhasilDiperbaharui();
    }
}
