package starter.WebAdmin.Event;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetDetailEvent {
    private String url ="https://api-ferminacare.tech/api/v1/admin/event";
    @Step("saya menetapkan API endpoint untuk mendapatkan detail event dengan memasukan ID valid")
    public String menetapkanApiEndpointUntukmendapatkanDetailEventDenganMemasukanIdValid(){
        return url + "/2";
    }
    @Step("saya mengirimkan request untuk mendapatkan detail event dengan menggunakan token")
    public void mengirimkanRequestUntukMendapatkanDetailEventDenganMenggunakanToken(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application")
                .header("Authorization", "Bearer " + token)
                .get((menetapkanApiEndpointUntukmendapatkanDetailEventDenganMemasukanIdValid()));
    }

    @Step("saya menetapkan API endpoint untuk mendapatkan detail event dengan memasukan ID invalid")
    public String menetapkanApiEndpointUntukmendapatkanDetailEventDenganMemasukanIdInvalid(){
        return url + "/109";
    }
    @Step("saya mengirimkan request untuk mendapatkan detail event dengan memasukan ID invalid")
    public void mengirimkanRequestUntukMendapatkanDetailEventDenganMemasukanInvalidID(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application")
                .header("Authorization", "Bearer " + token)
                .get((menetapkanApiEndpointUntukmendapatkanDetailEventDenganMemasukanIdInvalid()));
    }
    @And("saya menerima data detail event")
    public void sayaMenerimaDataDetailEvent() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_DETAIL_EVENT_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @When("saya mengirimkan request dengan invalid ID untuk mendapatkan detail event")
    public void sayaMengirimkanRequestDenganInvalidIDUntukMendapatkanDetailEvent() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application")
                .header("Authorization", "Bearer " + token)
                .get((menetapkanApiEndpointUntukmendapatkanDetailEventDenganMemasukanIdInvalid()));
    }

    @Step("saya mengirimkan request untuk mendapatkan detail event tanpa menggunakan token")
    public void mengirimkanRequestUntukmendapatkanDetailEventTanpaMenggunakanToken(){
        SerenityRest.given()
                .header("Content-Type","application")
                .get((menetapkanApiEndpointUntukmendapatkanDetailEventDenganMemasukanIdValid()));
    }

    @Step("saya menetapkan API endpoint untuk mendapatkan detail event tanpa memasukan ID")
    public String menetapkanApiEndpointUntukMendapatkanDetailEventTanpaMemasukanId(){
        return url;
    }
    @Step("saya mengirimkan request untuk mendapatkan detail event tanpa memasukan ID")
    public void mengrimkanRequestUtukMendapatkanDetailEventTanpaMemasukanID(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application")
                .header("Authorization", "Bearer " + token)
                .get((menetapkanApiEndpointUntukMendapatkanDetailEventTanpaMemasukanId()));
    }

    @Step("saya menetapkan API endpoint yang salah untuk mendapatkan detail event")
    public String menetapkanApiEndpointYangSalahUntukmendapatkanDetailEvent(){
        return url + "s/2";
    }
    @Step("saya mengirimkan request untuk mendapatkan detail event dengan API endpoint yang salah")
    public void mengirimkanRequestUntukmendapatkanDetailKarirDenganApiEndpointSalah(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application")
                .header("Authorization", "Bearer " + token)
                .get((menetapkanApiEndpointYangSalahUntukmendapatkanDetailEvent()));
    }


    @Step("saya mengirimkan request untuk mendapatkan detail event dengan menggunakan method POST")
    public void mengirimkanRequestUntukMendapatkanDetailEventDenganMethodPost(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application")
                .header("Authorization", "Bearer " + token)
                .post((menetapkanApiEndpointUntukmendapatkanDetailEventDenganMemasukanIdValid()));
    }

    @Step("saya mengirimkan request untuk mendapatkan detail event dengan menggunakan method PUT")
    public void mengirimkanRequestUntukmendapatkanDetailEventDenganMenggunakanMethodPut(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application")
                .header("Authorization", "Bearer " + token)
                .put((menetapkanApiEndpointUntukmendapatkanDetailEventDenganMemasukanIdValid()));
    }

    @Step("saya mengirimkan request untuk mendapatkan detail event dengan menggunakan method DELETE")
    public void mengirimkanRequestUntukMendapatkanKarirDenganMenggunakanMethodDelete(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application")
                .header("Authorization", "Bearer " + token)
                .delete((menetapkanApiEndpointUntukmendapatkanDetailEventDenganMemasukanIdValid()));
    }
}
