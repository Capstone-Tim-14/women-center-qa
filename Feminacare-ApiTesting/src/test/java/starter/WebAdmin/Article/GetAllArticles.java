package starter.WebAdmin.Article;

import io.cucumber.java.en.And;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetAllArticles {
    private String url = "https://api-ferminacare.tech/api/v1/admin";

    @Step("saya menetapkan API endpoint untuk mendapatkan semua artikel")
    public String menetapkanApiEndpointUntukmendapatkanSemuaArtikel(){
        return url +"/articles";
    }
    @Step("saya menetapkan API endpoint dengan sebuah ID untuk mendapatkan semua artikel")
    public String menetapkanApiEndpointDenganSebuahID(){
        return url + "/articles/1";
    }
    @Step("saya menetapkan API endpoint yang salah untuk mendapatkan semua artikel")
    public String menetapkanApiEndpointYangSalahUntukMendapatkanSemuaArtikel(){
        return url + "/Articles";
    }
    @Step("saya menetapkan API endpoint untuk mendapatkan semua artikel berdasarkan halaman")
    public String menetapkanApiEndpointUntukmendapatkanSemuaArtikelBerdasarkanHalaman(){
        return url + "/articles?page=2";
    }
    @Step("saya mengirimkan request untuk mendapatkan semua artikel dengan menggunakan token")
    public void mengirimkanRequestUntukMendapatkanSemuaArtikelDenganMenggunakanToken(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application")
                .header("Authorization", "Bearer " + token)
                .get(menetapkanApiEndpointUntukmendapatkanSemuaArtikel());
    }
    @Step("saya mengirimkan request untuk mendapatkan semua artikel berdasarkan halaman")
    public void mengirimkanRequestUntukMendapatkanSemuaArtikelBerdasarkanHalaman(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application")
                .header("Authorization", "Bearer " + token)
                .get(menetapkanApiEndpointUntukmendapatkanSemuaArtikelBerdasarkanHalaman());
    }
    @Step("saya menerima data artikel")
    public void menerimaDataArtikel(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_ALL_ARTICLES_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
    @Step("saya mengirimkan request untuk mendapatkan semua artikel tanpa menggunakan token")
    public void mengirimkanRequestUntukMendapatkanSemuaArtikelTanpaMenggunakanToken(){
        SerenityRest.given()
                .header("Content-Type","application/json")
                .get(menetapkanApiEndpointUntukmendapatkanSemuaArtikel());
    }
    @Step("saya mengirimkan request untuk mendapatkan semua artikel dengan menggunakan ID")
    public void mengirimkanRequestUntukMendapatkanSemuaArtikelDenganMenggunakanIdValid(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .get(menetapkanApiEndpointDenganSebuahID());
    }


    @Step("saya mengirimkan request untuk mendapatkan semua artikel dengan API endpoint yang salah")
    public void mengirimkanRequestUntukMendapatkanSemuaArtikelDenganApEndpointYangSalah(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .get(menetapkanApiEndpointYangSalahUntukMendapatkanSemuaArtikel());
    }

    @Step("saya mengirimkan request untuk mendapatkan semua artikel dengan menggunakan method POST")
    public void mengirimkanRequestUntukMendapatkanSemuaArtikelDenganMenggunakanMethodPost(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .post(menetapkanApiEndpointUntukmendapatkanSemuaArtikel());
    }
    @Step("saya mengirimkan request untuk mendapatkan semua artikel dengan menggunakan method PUT")
    public void mengirimkanRequestUntukMendapatkanSemuaArtikelDenganMenggunakanMethodPut(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .put(menetapkanApiEndpointUntukmendapatkanSemuaArtikel());
    }
    @Step("saya mengirimkan request untuk mendapatkan semua artikel dengan menggunakan method DELETE")
    public void mengirimkanRequestUntukMendapatkanSemuaArtikelDenganMenggunakanMethodDelete(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .delete(menetapkanApiEndpointUntukmendapatkanSemuaArtikel());
    }
    @Step("saya menerima data artikel sesuai no halaman")
    public void sayaMenerimaDataArtikelSesuaiNoHalaman() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_ALL_ARTICLES_PAGE_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
    @Step("saya menerima pesan error article Not Found")
    public void sayaMenerimaPesanErrorArtcileNotFound() {
        restAssuredThat(response->response.body("message",equalTo("Article not found")));
    }
}
