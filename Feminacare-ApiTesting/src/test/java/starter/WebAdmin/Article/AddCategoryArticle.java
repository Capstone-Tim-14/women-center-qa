package starter.WebAdmin.Article;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;

import java.io.File;

public class AddCategoryArticle {
    private String url = "https://api-ferminacare.tech/api/v1/admin/articles";
    @Step("saya menetapkan Api endpoint untuk membuat kategori artikel baru")
    public String menetapkanApiEndpointUntukMembuatKategoriArticleBaru() {
        // Implementasi logika untuk menetapkan API endpoint
        return url + "/9/add-category";
    }
    @Step("saya mengirimkan request untuk membuat kategori artikel dengan mengisi data lengkap dan valid")
    public void mengirimkanRequestMembuatKategoriDenganDataValid() {
        JSONObject requestBody = new JSONObject();
        String token = GenerateToken.generateTokenAdmin();
        requestBody.put("name", "Sejarah");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .post(menetapkanApiEndpointUntukMembuatKategoriArticleBaru());
    }
    @Step("saya menetapkan Api endpoint untuk membuat kategori artikel baru dengan ID yang invalid")
    public String menetapkanApiEndpointUntukMembuatKategoriArticleBaruDenganIdYangInvalid() {
        // Implementasi logika untuk menetapkan API endpoint
        return url + "/1/add-category";
    }
    @Step("saya mengirimkan request untuk membuat kategori artikel baru dengan ID yang invalid")
    public void mengirimkanRequestMembuatKategoriDenganIdInvalid() {
        JSONObject requestBody = new JSONObject();
        String token = GenerateToken.generateTokenAdmin();
        requestBody.put("name", "Sejarah");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .post(menetapkanApiEndpointUntukMembuatKategoriArticleBaruDenganIdYangInvalid());
    }
    @Step("saya mengirimkan request untuk membuat kategori artikel dengan mengosongkan field data")
    public void mengirimkanRequestDataKosong() {
        JSONObject requestBody = new JSONObject();
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .post(menetapkanApiEndpointUntukMembuatKategoriArticleBaru());
    }
    @Step("saya mengirimkan request untuk membuat kategori artikel tanpa menggunakan token")
    public void mengirimkanRequestTanpaToken() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Sejarah");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .post(menetapkanApiEndpointUntukMembuatKategoriArticleBaru());
    }
    @Step("saya mengirimkan request untuk membuat kategori artikel baru dengan mengisikan data yang sudah tersimpan")
    public void mengirimkanRequestMenambahkanKategoriArtikelDenganDataDuplikat() {
        JSONObject requestBody = new JSONObject();
        String token = GenerateToken.generateTokenAdmin();
        requestBody.put("name", "Sejarah");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .post(menetapkanApiEndpointUntukMembuatKategoriArticleBaru());
    }

}
