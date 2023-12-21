package starter.stepdefinitions.WebAdmin.Event;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.WebAdmin.Event.CreateEvent;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import java.io.File;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class CreateEventSteps {
    @Steps
    CreateEvent createEvent;
    @Given("saya menetapkan Api endpoint untuk membuat event baru")
    public void menetapkanApiEndpointUntukMembuatEventBaru() {
       createEvent.menetapkanApiEndpointUntukMembuatEventBaru();
    }

    @When("saya mengirimkan request untuk membuat event dengan mengisi data lengkap dan valid")
    public void mengirimkanRequestDataLengkapDanValid() {
        createEvent.mengirimkanRequestDataLengkapDanValid();
    }

    @And("saya menerima pesan data event berhasil dibuat")
    public void menerimaPesanDataEventBerhasilDibuat() {
        createEvent.menerimaPesanDataEventBerhasilDibuat();
    }

    @When("saya mengirimkan request untuk membuat event dengan mengisi data yang tidak lengkap")
    public void mengirimkanRequestDataTidakLengkap() {
        createEvent.mengirimkanRequestDataTidakLengkap();
    }

    @When("saya mengirimkan request untuk membuat event dengan mengosongkan seluruh field data")
    public void mengirimkanRequestDataKosong() {
        createEvent.mengirimkanRequestDataKosong();
    }

    @When("saya mengirimkan request untuk membuat event tanpa menggunakan token")
    public void mengirimkanRequestTanpaToken() {
        createEvent.mengirimkanRequestTanpaToken();
    }

    @When("saya mengirimkan request untuk membuat event baru dengan mengisikan data yang sudah tersimpan")
    public void mengirimkanRequestDataDuplikat() {
        createEvent.mengirimkanRequestDataDuplikat();
    }

    @When("saya mengirimkan request untuk membuat event dengan menggunakan method Get")
    public void mengirimkanRequestDenganMethodGet() {
        createEvent.mengirimkanRequestDenganMethodGet();
    }

    @When("saya mengirimkan request untuk membuat event dengan menggunakan method Put")
    public void mengirimkanRequestDenganMethodPut() {
        createEvent.mengirimkanRequestDenganMethodPut();
    }

    @When("saya mengirimkan request untuk membuat event dengan menggunakan method Delete")
    public void mengirimkanRequestDenganMethodDelete() {
        createEvent.mengirimkanRequestDenganMethodDelete();
    }
}
