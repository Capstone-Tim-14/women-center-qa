package starter.WebAdmin.Career;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetAllCareers {
    private String url = "https://api-ferminacare.tech/api/v1/admin";
    @Step("saya menetapkan API endpoint untuk mendapatkan semua karir")
    public String menetapkanApiEndpointUntukmendapatkanSemuaKarir(){
        return url +"/career";
    }
    @Step("saya menetapkan API endpoint untuk mendapatkan semua karir dengan sebuah ID")
    public String menetapkanApiEndpointUntukMendapatkanSemuaKarirDenganSebuahID(){
        return url + "/career/24";
    }
    @Step("saya menerima data detail karir")
    public void menerimaDetailKarir(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_DETAIL_CAREERS_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
    @Step("saya menetapkan API endpoint yang salah untuk mendapatkan semua karir")
    public String menetapkanApiEndpointYangSalahUntukMendapatkanSemuaKarir(){
        return url + "/Career";
    }

    @Step("saya mengirimkan request untuk mendapatkan semua karir dengan menggunakan token")
    public void mengirimkanRequestUntukMendapatkanSemuaKarirDenganMenggunakanToken(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application")
                .header("Authorization", "Bearer " + token)
                .get((menetapkanApiEndpointUntukmendapatkanSemuaKarir()));
    }
    @Step("saya menerima data karir")
    public void menerimaDataKarir(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_ALL_CAREERS_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
    @Step("saya mengirimkan request untuk mendapatkan semua karir tanpa menggunakan token")
    public void mengirimkanRequestUntukMendapatkanSemuaKarirTanpaMenggunakanToken(){
        SerenityRest.given()
                .header("Content-Type","application/json")
                .get((menetapkanApiEndpointUntukmendapatkanSemuaKarir()));
    }
    @Step("saya mengirimkan request untuk mendapatkan semua karir dengan menggunakan ID")
    public void mengirimkanRequestUntukMendapatkanSemuaKarirDenganMenggunakanIdValid(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .get((menetapkanApiEndpointUntukMendapatkanSemuaKarirDenganSebuahID()));
    }

    @Step("saya mengirimkan request untuk mendapatkan semua karir dengan API endpoint yang salah")
    public void mengirimkanRequestUntukMendapatkanSemuaKarirDenganApEndpointYangSalah(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .get((menetapkanApiEndpointYangSalahUntukMendapatkanSemuaKarir()));
    }

    @Step("saya mengirimkan request untuk mendapatkan semua karir dengan menggunakan method POST")
    public void mengirimkanRequestUntukMendapatkanSemuaKarirDenganMenggunakanMethodPost(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .post((menetapkanApiEndpointUntukmendapatkanSemuaKarir()));
    }
    @Step("saya mengirimkan request untuk mendapatkan semua karir dengan menggunakan method PUT")
    public void mengirimkanRequestUntukMendapatkanSemuaKarirDenganMenggunakanMethodPut(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .put((menetapkanApiEndpointUntukmendapatkanSemuaKarir()));
    }
    @Step("saya mengirimkan request untuk mendapatkan semua karir dengan menggunakan method DELETE")
    public void mengirimkanRequestUntukMendapatkanSemuaKarirDenganMenggunakanMethodDelete(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .delete((menetapkanApiEndpointUntukmendapatkanSemuaKarir()));
    }
    @Step("saya menerima status kode 400")
    public void menerimaStatuskode400(){
        restAssuredThat(response->response.statusCode(400));
    }

    @Step("And saya menerima pesan error bad request")
    public void menerimaPesanErrorBadrequest(){
        restAssuredThat(response->response.body("code",equalTo(400)));
        restAssuredThat(response->response.body("message",equalTo("request Content-Type isn't multipart/form-data")));
    }
}
