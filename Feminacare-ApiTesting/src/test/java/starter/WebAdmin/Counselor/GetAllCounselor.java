package starter.WebAdmin.Counselor;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllCounselor {
    private String url = "https://api-ferminacare.tech/api/v1/admin";
    @Step("saya menetapkan API endpoint untuk mendapatkan semua konselor")
    public String menetapkanApiEndpointUntukmendapatkanSemuaKonselor(){
        return url +"/counselors";
    }
    @Step("saya menetapkan API endpoint untuk mendapatkan semua konselor dengan sebuah ID")
    public String menetapkanApiEndpointUntukMendapatkanSemuaKonselorDenganSebuahID(){
        return url + "/counselors/1";
    }
    @Step("saya menetapkan API endpoint yang salah untuk mendapatkan semua konselor")
    public String menetapkanApiEndpointYangSalahUntukMendapatkanSemuaKonselor(){
        return url + "/Counselors";
    }

    @Step("saya mengirimkan request untuk mendapatkan semua konselor dengan menggunakan token")
    public void mengirimkanRequestUntukMendapatkanSemuaKonselorDenganMenggunakanToken(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application")
                .header("Authorization", "Bearer " + token)
                .get((menetapkanApiEndpointUntukmendapatkanSemuaKonselor()));
    }
    @Step("saya menerima data konselor")
    public void menerimaDataKonselor(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_ALL_COUNSELORS_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
    @Step("saya mengirimkan request untuk mendapatkan semua Konselor tanpa menggunakan token")
    public void mengirimkanRequestUntukMendapatkanSemuaKonselorTanpaMenggunakanToken(){
        SerenityRest.given()
                .header("Content-Type","application/json")
                .get((menetapkanApiEndpointUntukmendapatkanSemuaKonselor()));
    }
    @Step("saya mengirimkan request untuk mendapatkan semua konselor dengan menggunakan ID")
    public void mengirimkanRequestUntukMendapatkanSemuaKonselorDenganMenggunakanIdValid(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .get((menetapkanApiEndpointUntukMendapatkanSemuaKonselorDenganSebuahID()));
    }

    @Step("saya mengirimkan request untuk mendapatkan semua konselor dengan API endpoint yang salah")
    public void mengirimkanRequestUntukMendapatkanSemuaKonselorDenganApEndpointYangSalah(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .get((menetapkanApiEndpointYangSalahUntukMendapatkanSemuaKonselor()));
    }

    @Step("saya mengirimkan request untuk mendapatkan semua konselor dengan menggunakan method POST")
    public void mengirimkanRequestUntukMendapatkanSemuaKonselorDenganMenggunakanMethodPost(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .post((menetapkanApiEndpointUntukmendapatkanSemuaKonselor()));
    }
    @Step("saya mengirimkan request untuk mendapatkan semua konselor dengan menggunakan method PUT")
    public void mengirimkanRequestUntukMendapatkanSemuaKonselorDenganMenggunakanMethodPut(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .put((menetapkanApiEndpointUntukmendapatkanSemuaKonselor()));
    }
    @Step("saya mengirimkan request untuk mendapatkan semua konselor dengan menggunakan method DELETE")
    public void mengirimkanRequestUntukMendapatkanSemuaKonselorDenganMenggunakanMethodDelete(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .delete((menetapkanApiEndpointUntukmendapatkanSemuaKonselor()));
    }
}
