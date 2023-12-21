package starter.WebAdmin.Event;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllEvents {
    private String url = "https://api-ferminacare.tech/api/v1/admin";
    @Step("saya menetapkan API endpoint untuk mendapatkan semua event")
    public String menetapkanApiEndpointUntukmendapatkanSemuaEvent(){
        return url +"/events";
    }
    @Step("saya menetapkan API endpoint untuk mendapatkan semua event dengan sebuah ID")
    public String menetapkanApiEndpointUntukMendapatkanSemuaEventDenganSebuahID(){
        return url + "/events/1";
    }
    @Step("saya menetapkan API endpoint yang salah untuk mendapatkan semua event")
    public String menetapkanApiEndpointYangSalahUntukMendapatkanSemuaEvent(){
        return url + "/Events";
    }

    @Step("saya mengirimkan request untuk mendapatkan semua event dengan menggunakan token")
    public void mengirimkanRequestUntukMendapatkanSemuaEventDenganMenggunakanToken(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application")
                .header("Authorization", "Bearer " + token)
                .get((menetapkanApiEndpointUntukmendapatkanSemuaEvent()));
    }
    @Step("saya menerima data event")
    public void menerimaDataEvent(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_ALL_EVENTS_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
    @Step("saya mengirimkan request untuk mendapatkan semua Konselor tanpa menggunakan token")
    public void mengirimkanRequestUntukMendapatkanSemuaEventTanpaMenggunakanToken(){
        SerenityRest.given()
                .header("Content-Type","application/json")
                .get((menetapkanApiEndpointUntukmendapatkanSemuaEvent()));
    }
    @Step("saya mengirimkan request untuk mendapatkan semua event dengan menggunakan ID")
    public void mengirimkanRequestUntukMendapatkanSemuaEventDenganMenggunakanIdValid(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .get((menetapkanApiEndpointUntukMendapatkanSemuaEventDenganSebuahID()));
    }

    @Step("saya mengirimkan request untuk mendapatkan semua event dengan API endpoint yang salah")
    public void mengirimkanRequestUntukMendapatkanSemuaEventDenganApEndpointYangSalah(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .get((menetapkanApiEndpointYangSalahUntukMendapatkanSemuaEvent()));
    }

    @Step("saya mengirimkan request untuk mendapatkan semua event dengan menggunakan method POST")
    public void mengirimkanRequestUntukMendapatkanSemuaEventDenganMenggunakanMethodPost(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .post((menetapkanApiEndpointUntukmendapatkanSemuaEvent()));
    }
    @Step("saya mengirimkan request untuk mendapatkan semua event dengan menggunakan method PUT")
    public void mengirimkanRequestUntukMendapatkanSemuaEventDenganMenggunakanMethodPut(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .put((menetapkanApiEndpointUntukmendapatkanSemuaEvent()));
    }
    @Step("saya mengirimkan request untuk mendapatkan semua event dengan menggunakan method DELETE")
    public void mengirimkanRequestUntukMendapatkanSemuaEventDenganMenggunakanMethodDelete(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .delete((menetapkanApiEndpointUntukmendapatkanSemuaEvent()));
    }
}
