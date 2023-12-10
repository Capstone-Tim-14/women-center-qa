package starter.WebAdmin.Specialist;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllSpecialist {
    private String url = "https://api-ferminacare.tech/api/v1/admin";
    @Step("saya menetapkan API endpoint untuk mendapatkan semua spesialis")
    public String menetapkanApiEndpointUntukmendapatkanSemuaSpesialis(){
        return url +"/specialist";
    }
    @Step("saya menetapkan API endpoint untuk mendapatkan semua spesialis dengan sebuah ID")
    public String menetapkanApiEndpointUntukMendapatkanSemuaSpesialisDenganSebuahID(){
        return url + "/specialist/1";
    }
    @Step("saya menetapkan API endpoint yang salah untuk mendapatkan semua spesialis")
    public String menetapkanApiEndpointYangSalahUntukMendapatkanSemuaSpesialis(){
        return url + "/Specialist";
    }

    @Step("saya mengirimkan request untuk mendapatkan semua spesialis dengan menggunakan token")
    public void mengirimkanRequestUntukMendapatkanSemuaSpesialisDenganMenggunakanToken(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application")
                .header("Authorization", "Bearer " + token)
                .get((menetapkanApiEndpointUntukmendapatkanSemuaSpesialis()));
    }
    @Step("saya menerima data spesialis")
    public void menerimaDataSpesialis(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_ALL_SPECIALIST_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
    @Step("saya mengirimkan request untuk mendapatkan semua spesialis tanpa menggunakan token")
    public void mengirimkanRequestUntukMendapatkanSemuaSpesialisTanpaMenggunakanToken(){
        SerenityRest.given()
                .header("Content-Type","application/json")
                .get((menetapkanApiEndpointUntukmendapatkanSemuaSpesialis()));
    }
    @Step("saya mengirimkan request untuk mendapatkan semua spesialis dengan menggunakan ID")
    public void mengirimkanRequestUntukMendapatkanSemuaSpesialisDenganMenggunakanIdValid(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .get((menetapkanApiEndpointUntukMendapatkanSemuaSpesialisDenganSebuahID()));
    }

    @Step("saya mengirimkan request untuk mendapatkan semua spesialis dengan API endpoint yang salah")
    public void mengirimkanRequestUntukMendapatkanSemuaSpesialisDenganApEndpointYangSalah(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .get((menetapkanApiEndpointYangSalahUntukMendapatkanSemuaSpesialis()));
    }

    @Step("saya mengirimkan request untuk mendapatkan semua spesialis dengan menggunakan method POST")
    public void mengirimkanRequestUntukMendapatkanSemuaSpesialisDenganMenggunakanMethodPost(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .post((menetapkanApiEndpointUntukmendapatkanSemuaSpesialis()));
    }
    @Step("saya mengirimkan request untuk mendapatkan semua spesialis dengan menggunakan method PUT")
    public void mengirimkanRequestUntukMendapatkanSemuaSpesialisDenganMenggunakanMethodPut(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .put((menetapkanApiEndpointUntukmendapatkanSemuaSpesialis()));
    }
    @Step("saya mengirimkan request untuk mendapatkan semua spesialis dengan menggunakan method DELETE")
    public void mengirimkanRequestUntukMendapatkanSemuaSpesialisDenganMenggunakanMethodDelete(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .delete((menetapkanApiEndpointUntukmendapatkanSemuaSpesialis()));
    }
}
