package starter.WebAdmin.TagArticle;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllTags {
    private String url = "https://api-ferminacare.tech/api/v1/admin";
    @Step("saya menetapkan API endpoint untuk mendapatkan semua tag artikel")
    public java.lang.String menetapkanApiEndpointUntukMendapatkanSemuaTagArtikel(){
        return url + "/articles/category";
    }
    @Step("saya mengirimkan request untuk mendapatkan semua tag artikel dengan menggunakan token")
    public void mengirimkanRequestUntukMendapatkanSemuaTagArtikelDenganMenggunakanToken(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .get(menetapkanApiEndpointUntukMendapatkanSemuaTagArtikel());
    }
    @Step("saya menerima data tag artikel")
    public void menerimaDataTagArtikel(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_ALL_TAGS_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("saya mengirimkan request untuk mendapatkan semua tag artikel tanpa menggunakan token")
    public void mengirimkanRequestUntukMendapatkanSemuaTagArtikelTanpaMenggunakanToken(){
        SerenityRest.given()
                .header("Content-Type","application/json")
                .get(menetapkanApiEndpointUntukMendapatkanSemuaTagArtikel());
    }
    @Step("saya menetapkan API endpoint dengan sebuah ID untuk mendapatkan tag artikel")
    public String menetapkanApiEndpointUntukMendapatkanTagArtikelDenganMenggunakanSebuahID(){
        return url + "/articles/category/1";
    }
    @Step("saya mengirimkan request untuk mendapatkan semua tag artikel dengan menggunakan sebuah ID")
    public void mengirimkanRequestUntukMendaptkanSemuaTagArtikelDenganMenggunakanSebuahID(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .get(menetapkanApiEndpointUntukMendapatkanTagArtikelDenganMenggunakanSebuahID());
    }
    @Step("saya menetapkan API endpoint yang salah untuk mendapatkan semua tag artikel")
    public String menetapkanApiEndpointYangSalahUntukmendapatkanSemuaTagArtikel(){
        return url + "/Articles/Category";
    }
    @Step("saya mengirimkan request untuk mendapatkan semua tag artikel dengan API endpoint yang salah")
    public void mengirimkanRequestUntukMendapatkanSemuaTagArtikelDenganApiEndpointYangSalah(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .get(menetapkanApiEndpointYangSalahUntukmendapatkanSemuaTagArtikel());
    }
    @Step("saya mengirimkan request untuk mendapatkan semua tag artikel dengan menggunakan method POST")
    public void mengirimkanRequestUntukMendapatkanSemuaTagArtikelDenganMethodPost(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .post(menetapkanApiEndpointUntukMendapatkanSemuaTagArtikel());
    }
    @Step("saya mengirimkan request untuk mendapatkan semua tag artikel dengan menggunakan method PUT")
    public void mengirimkanRequestUntukMendapatkanSemuaTagArtikelDenganMethodPut(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .put(menetapkanApiEndpointUntukMendapatkanSemuaTagArtikel());
    }
    @Step("saya mengirimkan request untuk mendapatkan semua tag artikel dengan menggunakan method DELETE")
    public void mengirimkanRequestUntukMendapatkanSemuaTagArtikelDenganMethodDelete(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .delete(menetapkanApiEndpointUntukMendapatkanSemuaTagArtikel());
    }
    @Step("saya menerima status kode 500")
    public void menerimaStatusKode500(){
        restAssuredThat(response->response.statusCode(500));
    }
    @Step("saya menerima pesan error record not found")
    public void menerimaPesanErrorRecordNotfound(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.MESSAGE_ERROR_500);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
