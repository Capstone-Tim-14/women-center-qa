package starter.WebAdmin.Article;

import io.cucumber.java.en.And;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.GenerateToken;

import java.io.File;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class UpdateArticle {
    private String url = "https://api-ferminacare.tech/api/v1/admin";

    @Step("saya menetapkan Api endpoint untuk mengupdate data artikel dengan ID valid")
    public String menetapkanApiEndpointUntukMengupdateDataArtikelDenganIdValid() {
        return url + "/articles/6";
    }

    @Step("saya mengirimkan request untuk mengupdate data artikel dengan mengirimkan data lengkap seluruh field menggunakan method Put")
    public void mengirimkanRequestUntukmengupdateDataArtikelDenganMengirimkanDataLengkapSeluruhFieldMenggunakanMethodPut() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .multiPart("thumbnail", new File("src/test/resources/Image/QA.jpeg"))
                .multiPart("title", "Artikel Baru")
                .multiPart("content", "Lorem Ipsum")
                .put(menetapkanApiEndpointUntukMengupdateDataArtikelDenganIdValid());
    }

    @Step("saya mengirimkan request untuk mengupdate data artikel dengan mengirimkan data beberapa field menggunakan method Put")
    public void mengirimkanRequestUntukmengupdateDataArtikelDenganMengirimkanDataLengkapBeberapaField() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .multiPart("thumbnail", new File("src/test/resources/Image/QA.jpeg"))
                .put(menetapkanApiEndpointUntukMengupdateDataArtikelDenganIdValid());
    }

    @Step("saya mengirimkan request untuk mengupdate data artikel dengan mengosongkan data")
    public void mengirimkanRequestUntukmengupdateDataArtikelDenganMengsongkanData() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .put(menetapkanApiEndpointUntukMengupdateDataArtikelDenganIdValid());
    }

    @Step("saya menetapkan Api endpoint untuk mengupdate data artikel dengan ID invalid")
    public String menetapkanApiEndpointUntukMengupdateDataArtikelDenganIdInvalid() {
        return url + "/articles/1";
    }

    @Step("saya mengirimkan request untuk mengupdate data artikel dengan mengirimkan data lengkap seluruh field namun dengan ID invalid")
    public void mengirimkanRequestUntukmengupdateDataArtikelDenganMengirimkanDataLengkapSeluruhFieldNamunMenggunakanIdInvalid() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .multiPart("thumbnail", new File("src/test/resources/Image/QA.jpeg"))
                .multiPart("title", "Artikel Baru")
                .multiPart("content", "Lorem Ipsum")
                .put(menetapkanApiEndpointUntukMengupdateDataArtikelDenganIdInvalid());
    }

    @Step("saya mengirimkan request untuk mengupdate data artikel dengan mengirimkan data lengkap seluruh field menggunakan menggunakan data yang sudah tersedia")
    public void mengirimkanRequestUntukmengupdateDataArtikelDenganMengirimkanDataLengkapSeluruhFieldMenggunakanDataYangSudahTersedia() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .multiPart("thumbnail", new File("src/test/resources/Image/QA.jpeg"))
                .multiPart("title", "Artikel Baru")
                .multiPart("content", "Lorem Ipsum")
                .put(menetapkanApiEndpointUntukMengupdateDataArtikelDenganIdValid());
    }

    @Step("saya mengirimkan request untuk mengupdate data artikel dengan mengirimkan data lengkap seluruh field menggunakan method Get")
    public void mengirimkanRequestUntukmengupdateDataArtikelDenganMengirimkanDataLengkapSeluruhFieldMenggunakanMethodGet() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .multiPart("thumbnail", new File("src/test/resources/Image/QA.jpeg"))
                .multiPart("title", "Artikel Baru")
                .multiPart("content", "Lorem Ipsum")
                .get(menetapkanApiEndpointUntukMengupdateDataArtikelDenganIdValid());
    }

    @Step("saya mengirimkan request untuk mengupdate data artikel dengan mengirimkan data lengkap seluruh field menggunakan method POST")
    public void mengirimkanRequestUntukmengupdateDataArtikelDenganMengirimkanDataLengkapSeluruhFieldMenggunakanMethodPost() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .multiPart("thumbnail", new File("src/test/resources/Image/QA.jpeg"))
                .multiPart("title", "Artikel Baru")
                .multiPart("content", "Lorem Ipsum")
                .post(menetapkanApiEndpointUntukMengupdateDataArtikelDenganIdValid());
    }

    @Step("saya mengirimkan request untuk mengupdate data artikel dengan mengirimkan data lengkap seluruh field menggunakan method DELETE")
    public void mengirimkanRequestUntukmengupdateDataArtikelDenganMengirimkanDataLengkapSeluruhFieldMenggunakanMethodDelete() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .multiPart("thumbnail", new File("src/test/resources/Image/QA.jpeg"))
                .multiPart("title", "Artikel Baru")
                .multiPart("content", "Lorem Ipsum")
                .delete(menetapkanApiEndpointUntukMengupdateDataArtikelDenganIdValid());
    }

    @Step("saya menetapkan Api endpoint yang salah untuk mengupdate data artikel")
    public String menetapkanApiEndpointYangSalahUntukMengupdateDataArtikel() {
        return url + "/Articles/6";
    }

    @Step("saya mengirimkan request untuk mengupdate data artikel dengan mengirimkan data lengkap seluruh field menggunakan endpoint yang salah")
    public void mengirimkanRequestUntukMengupdateDataArtikelDenganmenetapkanApiEndpointYangSalah() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .multiPart("thumbnail", new File("src/test/resources/Image/QA.jpeg"))
                .multiPart("title", "Artikel Baru")
                .multiPart("content", "Lorem Ipsum")
                .put(menetapkanApiEndpointYangSalahUntukMengupdateDataArtikel());
    }
    @Step("saya menerima pesan data artikel berhasil diperbaharui")
    public void sayaMenerimaPesanDataArtikelBerhasilDiperbaharui () {
        restAssuredThat(response -> response.body("code", equalTo(200)));
        restAssuredThat(response -> response.body("message", equalTo("Article updated!")));
    }
    @Step("saya menerima pesan error artikel tidak ditemukan")
    public void sayaMenerimaPesanErrorArtikelTidakDitemukan() {
        restAssuredThat(response -> response.body("message", equalTo("article not found")));
    }
}
