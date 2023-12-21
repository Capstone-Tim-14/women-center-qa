package starter.stepdefinitions.WebAdmin.Article;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.WebAdmin.Article.CreateArticle;
import starter.utils.GenerateToken;

import java.io.File;

public class CreateArticlesSteps {
    @Steps
    CreateArticle createArticle;

    @Given("saya menetapkan Api endpoint untuk membuat artikel baru")
    public void menetapkanApiEndpointUntukMembuatArticleBaru() {
        createArticle.menetapkanApiEndpointUntukMembuatArticleBaru();
    }

    @When("saya mengirimkan request untuk membuat artikel dengan mengisi data lengkap dan valid")
    public void mengirimkanRequestDataLengkapDanValid() {
        createArticle.mengirimkanRequestDataLengkapDanValid();
    }


    @When("saya mengirimkan request untuk membuat artikel dengan mengisi data yang tidak lengkap")
    public void mengirimkanRequestDataTidakLengkap() {
        createArticle.mengirimkanRequestDataTidakLengkap();
    }

    @When("saya mengirimkan request untuk membuat artikel dengan mengosongkan seluruh field data")
    public void mengirimkanRequestDataKosong() {
        createArticle.mengirimkanRequestDataKosong();
    }

    @When("saya mengirimkan request untuk membuat artikel tanpa menggunakan token")
    public void mengirimkanRequestTanpaToken() {
        createArticle.mengirimkanRequestTanpaToken();
    }

    @When("saya mengirimkan request untuk membuat artikel baru dengan mengisikan data yang sudah tersimpan")
    public void mengirimkanRequestDataDuplikat() {
        createArticle.mengirimkanRequestDataDuplikat();
    }

    @When("saya mengirimkan request untuk membuat artikel dengan menggunakan method Get")
    public void mengirimkanRequestDenganMethodGet() {
        createArticle.mengirimkanRequestDenganMethodGet();
    }

    @When("saya mengirimkan request untuk membuat artikel dengan menggunakan method Put")
    public void mengirimkanRequestDenganMethodPut() {
        createArticle.mengirimkanRequestDenganMethodPut();
    }

    @When("saya mengirimkan request untuk membuat artikel dengan menggunakan method Delete")
    public void mengirimkanRequestDenganMethodDelete() {
        createArticle.mengirimkanRequestDenganMethodDelete();
    }
}
