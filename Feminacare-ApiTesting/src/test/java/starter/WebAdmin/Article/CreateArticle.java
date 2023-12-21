package starter.WebAdmin.Article;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;
import java.io.File;
public class CreateArticle {
    private String url = "https://api-ferminacare.tech/api/v1/admin/";

    @Step("saya menetapkan Api endpoint untuk membuat artikel baru")
    public String menetapkanApiEndpointUntukMembuatArticleBaru() {
        // Implementasi logika untuk menetapkan API endpoint
        return url + "articles";
    }

    @Step("saya mengirimkan request untuk membuat artikel dengan mengisi data lengkap dan valid")
    public void mengirimkanRequestDataLengkapDanValid() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .multiPart("thumbnail", new File("src/test/resources/Image/QA.jpeg"))
                .multiPart("title", "Artikel Baru")
                .multiPart("content", "Lorem Ipsum")
                .post(menetapkanApiEndpointUntukMembuatArticleBaru());
    }


    @Step("saya mengirimkan request untuk membuat artikel dengan mengisi data yang tidak lengkap")
    public void mengirimkanRequestDataTidakLengkap() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART)
                .multiPart("thumbnail", new File("src/test/resources/Image/QA.jpeg"))
                .multiPart("title", "Artikel Baru")
                .header("Authorization", "Bearer " + token)
                .post(menetapkanApiEndpointUntukMembuatArticleBaru());
    }

    @Step("saya mengirimkan request untuk membuat artikel dengan mengosongkan seluruh field data")
    public void mengirimkanRequestDataKosong() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .post(menetapkanApiEndpointUntukMembuatArticleBaru());
    }

    @Step("saya mengirimkan request untuk membuat artikel tanpa menggunakan token")
    public void mengirimkanRequestTanpaToken() {
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .multiPart("thumbnail", new File("src/test/resources/Image/QA.jpeg"))
                .multiPart("title", "Artikel Baru")
                .multiPart("content", "Lorem Ipsum")
                .post(menetapkanApiEndpointUntukMembuatArticleBaru());
    }

    @Step("saya mengirimkan request untuk membuat artikel baru dengan mengisikan data yang sudah tersimpan")
    public void mengirimkanRequestDataDuplikat() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .multiPart("thumbnail", new File("src/test/resources/Image/QA.jpeg"))
                .multiPart("title", "Artikel Baru")
                .multiPart("content", "Lorem Ipsum")
                .post(menetapkanApiEndpointUntukMembuatArticleBaru());
    }

    @Step("saya mengirimkan request untuk membuat artikel dengan menggunakan method Get")
    public void mengirimkanRequestDenganMethodGet() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .multiPart("thumbnail", new File("src/test/resources/Image/QA.jpeg"))
                .multiPart("title", "Artikel Baru")
                .multiPart("content", "Lorem Ipsum")
                .get(menetapkanApiEndpointUntukMembuatArticleBaru());
    }

    @Step("saya mengirimkan request untuk membuat artikel dengan menggunakan method Put")
    public void mengirimkanRequestDenganMethodPut() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .multiPart("thumbnail", new File("src/test/resources/Image/QA.jpeg"))
                .multiPart("title", "Artikel Baru")
                .multiPart("content", "Lorem Ipsum")
                .put(menetapkanApiEndpointUntukMembuatArticleBaru());
    }

    @Step("saya mengirimkan request untuk membuat artikel dengan menggunakan method Delete")
    public void mengirimkanRequestDenganMethodDelete() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .multiPart("thumbnail", new File("src/test/resources/Image/QA.jpeg"))
                .multiPart("title", "Artikel Baru")
                .multiPart("content", "Lorem Ipsum")
                .delete(menetapkanApiEndpointUntukMembuatArticleBaru());
    }
}
