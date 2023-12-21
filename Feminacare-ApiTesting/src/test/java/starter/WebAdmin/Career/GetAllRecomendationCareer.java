package starter.WebAdmin.Career;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetAllRecomendationCareer {
    private String url = "https://api-ferminacare.tech/api/v1/admin";
    @Step("saya menetapkan API endpoint untuk mendapatkan semua rekomendasi karir")
    public String menetapkanApiEndpointUntukmendapatkanSemuaRekomendasiKarir(){
        return url +"/career/recomendation";
    }

    @Step("saya menerima data detail rekomendasi karir")
    public void menerimaDetailRekomendasiKarir(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_ALL_RECOMENDATION_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
    @Step("saya menetapkan API endpoint yang salah untuk mendapatkan semua rekomendasi karir")
    public String menetapkanApiEndpointYangSalahUntukMendapatkanSemuaRekomendasiKarir(){
        return url + "/Career/Recomendation";
    }

    @Step("saya mengirimkan request untuk mendapatkan semua karir dengan menggunakan token")
    public void mengirimkanRequestUntukMendapatkanSemuaRekomendasiKarirDenganMenggunakanToken(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application")
                .header("Authorization", "Bearer " + token)
                .get((menetapkanApiEndpointUntukmendapatkanSemuaRekomendasiKarir()));
    }
    @Step("saya menerima data rekomendasi karir")
    public void menerimaDataRekomendasiKarir(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_ALL_CAREERS_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
    @Step("saya mengirimkan request untuk mendapatkan semua rekomendasi karir tanpa menggunakan token")
    public void mengirimkanRequestUntukMendapatkanSemuaRekomendasiKarirTanpaMenggunakanToken(){
        SerenityRest.given()
                .header("Content-Type","application/json")
                .get((menetapkanApiEndpointUntukmendapatkanSemuaRekomendasiKarir()));
    }

    @Step("saya mengirimkan request untuk mendapatkan semua rekomendasi karir dengan API endpoint yang salah")
    public void mengirimkanRequestUntukMendapatkanSemuaRekomendasiKarirDenganApEndpointYangSalah(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .get((menetapkanApiEndpointYangSalahUntukMendapatkanSemuaRekomendasiKarir()));
    }

    @Step("saya mengirimkan request untuk mendapatkan semua rekomendasi karir dengan menggunakan method POST")
    public void mengirimkanRequestUntukMendapatkanSemuaKarirDenganMenggunakanMethodPost(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .post((menetapkanApiEndpointUntukmendapatkanSemuaRekomendasiKarir()));
    }
    @Step("saya mengirimkan request untuk mendapatkan semua rekomendasi karir dengan menggunakan method PUT")
    public void mengirimkanRequestUntukMendapatkanSemuaRekomendasiKarirDenganMenggunakanMethodPut(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .put((menetapkanApiEndpointUntukmendapatkanSemuaRekomendasiKarir()));
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
