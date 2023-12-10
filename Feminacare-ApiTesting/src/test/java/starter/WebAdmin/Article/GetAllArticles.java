package starter.WebAdmin.Article;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;


public class GetAllArticles {
    private String url = "https://api-ferminacare.tech/api/v1/admin/articles/";
    @Step("saya menetapkan API endpoint untuk mendapatkan semua artikel")
    public String menetapkanApiEndpointUntukmendapatkanSemuaArtikel(){
        return url ;
    }
    @Step("saya menetapkan API endpoint untuk mendapatkan semua artikel dengan sebuah ID")
    public String menetapkanApiEndpointUntukMendapatkanSemuaArtikelDenganSebuahID(){
        return url + "1";
    }
    @Step("saya menetapkan API endpoint yang salah untuk mendapatkan semua artikel")
    public String menetapkanApiEndpointYangSalahUntukMendapatkanSemuaArtikel(){
        return url + "s";
    }

    @Step("saya mengirimkan request untuk mendapatkan semua artikel dengan menggunakan token")
    public void mengirimkanRequestUntukMendapatkanSemuaArtikelDenganMenggunakanToken(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application")
                .header("Authorization", "Bearer " + token)
                .get((menetapkanApiEndpointUntukmendapatkanSemuaArtikel()));
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
                .get((menetapkanApiEndpointUntukmendapatkanSemuaArtikel()));
    }
    @Step("saya mengirimkan request untuk mendapatkan semua artikel dengan menggunakan ID")
    public void mengirimkanRequestUntukMendapatkanSemuaArtikelDenganMenggunakanIdValid(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .get((menetapkanApiEndpointUntukMendapatkanSemuaArtikelDenganSebuahID()));
    }

    @Step("saya mengirimkan request untuk mendapatkan semua artikel dengan API endpoint yang salah")
    public void mengirimkanRequestUntukMendapatkanSemuaArtikelDenganApEndpointYangSalah(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .get((menetapkanApiEndpointYangSalahUntukMendapatkanSemuaArtikel()));
    }

    @Step("saya mengirimkan request untuk mendapatkan semua artikel dengan menggunakan method POST")
    public void mengirimkanRequestUntukMendapatkanSemuaArtikelDenganMenggunakanMethodPost(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .post((menetapkanApiEndpointUntukmendapatkanSemuaArtikel()));
    }
    @Step("saya mengirimkan request untuk mendapatkan semua artikel dengan menggunakan method PUT")
    public void mengirimkanRequestUntukMendapatkanSemuaArtikelDenganMenggunakanMethodPut(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .put((menetapkanApiEndpointUntukmendapatkanSemuaArtikel()));
    }
    @Step("saya mengirimkan request untuk mendapatkan semua artikel dengan menggunakan method DELETE")
    public void mengirimkanRequestUntukMendapatkanSemuaArtikelDenganMenggunakanMethodDelete(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .delete((menetapkanApiEndpointUntukmendapatkanSemuaArtikel()));
    }
}
