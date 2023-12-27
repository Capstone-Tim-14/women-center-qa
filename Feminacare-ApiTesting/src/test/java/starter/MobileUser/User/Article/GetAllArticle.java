package starter.MobileUser.User.Article;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllArticle {
    private String url = "https://api-ferminacare.tech/api/v1/";

    @Step("saya menetapkan API endpoint sebagai user untuk mendapatkan semua artikel")
    public String menetapkanApiEndpointUntukmendapatkanSemuaArtikel(){
        return url +"/articles";
    }
    @Step("saya menetapkan API endpoint sebagai user dengan sebuah ID untuk mendapatkan semua artikel")
    public String menetapkanApiEndpointDenganSebuahID(){
        return url + "/articles/1";
    }
    @Step("saya menetapkan API endpoint sebagai user untuk mendapatkan semua artikel berdasarkan halaman")
    public String menetapkanApiEndpointUntukmendapatkanSemuaArtikelBerdasarkanHalaman(){
        return url + "/articles?page=2";
    }
    @Step("saya mengirimkan request sebagai useruntuk mendapatkan semua artikel dengan menggunakan token")
    public void mengirimkanRequestUntukMendapatkanSemuaArtikelDenganMenggunakanToken(){
        String token = GenerateToken.generateTokenUser();
        SerenityRest.given()
                .header("Content-Type","application")
                .header("Authorization", "Bearer " + token)
                .get(menetapkanApiEndpointUntukmendapatkanSemuaArtikel());
    }
    @Step("saya mengirimkan request sebagai user untuk mendapatkan semua artikel berdasarkan halaman")
    public void mengirimkanRequestUntukMendapatkanSemuaArtikelBerdasarkanHalaman(){
        String token = GenerateToken.generateTokenUser();
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
    @Step("saya mengirimkan request sebagai user untuk mendapatkan semua artikel tanpa menggunakan token")
    public void mengirimkanRequestUntukMendapatkanSemuaArtikelTanpaMenggunakanToken(){
        SerenityRest.given()
                .header("Content-Type","application/json")
                .get(menetapkanApiEndpointUntukmendapatkanSemuaArtikel());
    }
    @Step("saya mengirimkan request sebagai user untuk mendapatkan semua artikel dengan menggunakan ID")
    public void mengirimkanRequestUntukMendapatkanSemuaArtikelDenganMenggunakanIdValid(){
        String token = GenerateToken.generateTokenUser();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .get(menetapkanApiEndpointDenganSebuahID());
    }

    @Step("saya menerima data artikel sesuai no halaman")
    public void sayaMenerimaDataArtikelSesuaiNoHalaman() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_ALL_ARTICLES_PAGE_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
