package starter.WebAdmin.Career;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.GenerateToken;

import java.io.File;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class UpdateCareer {
    private String url = "https://api-ferminacare.tech/api/v1/admin";

    @Step("saya menetapkan Api endpoint untuk mengupdate data karir dengan ID valid")
    public String menetapkanApiEndpointUntukMengupdateDataKarirDenganIdValid() {
        return url + "/career/24";
    }

    @Step("saya mengirimkan request untuk mengupdate data karir dengan mengirimkan data lengkap seluruh field menggunakan method Put")
    public void mengirimkanRequestUntukmengupdateDataKarirDenganMengirimkanDataLengkapSeluruhFieldMenggunakanMethodPut() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .multiPart("logo", new File("src/test/resources/Image/QA.jpeg"))
                .multiPart("cover", new File("src/test/resources/Image/cover.jpeg"))
                .multiPart("title_job", "Quality Engineer")
                .multiPart("company_name", "Google")
                .multiPart("location", "yogyakarta")
                .multiPart("size_company_employee", "1000")
                .multiPart("company_industry", "software development")
                .multiPart("required_skill", "programming languages")
                .multiPart("linkedin_url", "https://www.linkedin.com/company/google/job")
                .multiPart("about_job", "Create test case")
                .multiPart("about_company", "Lorem Ipsum")
                .put(menetapkanApiEndpointUntukMengupdateDataKarirDenganIdValid());
    }

    @Step("saya mengirimkan request untuk mengupdate data karir dengan mengirimkan data beberapa field menggunakan method Put")
    public void mengirimkanRequestUntukmengupdateDataKarirDenganMengirimkanDataLengkapBeberapaField() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .multiPart("logo", new File("src/test/resources/Image/QA.jpeg"))
                .multiPart("cover", new File("src/test/resources/Image/cover.jpeg"))
                .multiPart("title_job", "Quality Engineer")
                .multiPart("company_name", "Google")
                .multiPart("location", "yogyakarta")
                .put(menetapkanApiEndpointUntukMengupdateDataKarirDenganIdValid());
    }

    @Step("saya mengirimkan request untuk mengupdate data karir dengan mengosongkan data")
    public void mengirimkanRequestUntukmengupdateDataKarirDenganMengsongkanData() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .put(menetapkanApiEndpointUntukMengupdateDataKarirDenganIdValid());
    }

    @Step("saya menetapkan Api endpoint untuk mengupdate data karir dengan ID invalid")
    public String menetapkanApiEndpointUntukMengupdateDataKarirDenganIdInvalid() {
        return url + "/career/1";
    }

    @Step("saya mengirimkan request untuk mengupdate data karir dengan mengirimkan data lengkap seluruh field namun dengan ID invalid")
    public void mengirimkanRequestUntukmengupdateDataKarirDenganMengirimkanDataLengkapSeluruhFieldNamunMenggunakanIdInvalid() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .multiPart("logo", new File("src/test/resources/Image/QA.jpeg"))
                .multiPart("cover", new File("src/test/resources/Image/cover.jpeg"))
                .multiPart("title_job", "Quality Engineer")
                .multiPart("company_name", "Google")
                .multiPart("location", "yogyakarta")
                .multiPart("size_company_employee", "1000")
                .multiPart("company_industry", "software development")
                .multiPart("required_skill", "programming languages")
                .multiPart("linkedin_url", "https://www.linkedin.com/company/google/job")
                .multiPart("about_job", "Create test case")
                .multiPart("about_company", "Lorem Ipsum")
                .put(menetapkanApiEndpointUntukMengupdateDataKarirDenganIdInvalid());
    }

    @Step("saya mengirimkan request untuk mengupdate data karir dengan mengirimkan data lengkap seluruh field menggunakan menggunakan data yang sudah tersedia")
    public void mengirimkanRequestUntukmengupdateDataKarirDenganMengirimkanDataLengkapSeluruhFieldMenggunakanDataYangSudahTersedia() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .multiPart("logo", new File("src/test/resources/Image/QA.jpeg"))
                .multiPart("cover", new File("src/test/resources/Image/cover.jpeg"))
                .multiPart("title_job", "Quality Engineer")
                .multiPart("company_name", "Google")
                .multiPart("location", "yogyakarta")
                .multiPart("size_company_employee", "1000")
                .multiPart("company_industry", "software development")
                .multiPart("required_skill", "programming languages")
                .multiPart("linkedin_url", "https://www.linkedin.com/company/google/job")
                .multiPart("about_job", "Create test case")
                .multiPart("about_company", "Lorem Ipsum")
                .put(menetapkanApiEndpointUntukMengupdateDataKarirDenganIdValid());
    }

    @Step("saya mengirimkan request untuk mengupdate data karir dengan mengirimkan data lengkap seluruh field menggunakan method Get")
    public void mengirimkanRequestUntukmengupdateDataKarirDenganMengirimkanDataLengkapSeluruhFieldMenggunakanMethodGet() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .multiPart("logo", new File("src/test/resources/Image/QA.jpeg"))
                .multiPart("cover", new File("src/test/resources/Image/cover.jpeg"))
                .multiPart("title_job", "Quality Engineer")
                .multiPart("company_name", "Google")
                .multiPart("location", "yogyakarta")
                .multiPart("size_company_employee", "1000")
                .multiPart("company_industry", "software development")
                .multiPart("required_skill", "programming languages")
                .multiPart("linkedin_url", "https://www.linkedin.com/company/google/job")
                .multiPart("about_job", "Create test case")
                .multiPart("about_company", "Lorem Ipsum")
                .get(menetapkanApiEndpointUntukMengupdateDataKarirDenganIdValid());
    }

    @Step("saya mengirimkan request untuk mengupdate data karir dengan mengirimkan data lengkap seluruh field menggunakan method POST")
    public void mengirimkanRequestUntukmengupdateDataKarirDenganMengirimkanDataLengkapSeluruhFieldMenggunakanMethodPost() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .multiPart("logo", new File("src/test/resources/Image/QA.jpeg"))
                .multiPart("cover", new File("src/test/resources/Image/cover.jpeg"))
                .multiPart("title_job", "Quality Engineer")
                .multiPart("company_name", "Google")
                .multiPart("location", "yogyakarta")
                .multiPart("size_company_employee", "1000")
                .multiPart("company_industry", "software development")
                .multiPart("required_skill", "programming languages")
                .multiPart("linkedin_url", "https://www.linkedin.com/company/google/job")
                .multiPart("about_job", "Create test case")
                .multiPart("about_company", "Lorem Ipsum")
                .post(menetapkanApiEndpointUntukMengupdateDataKarirDenganIdValid());
    }

    @Step("saya mengirimkan request untuk mengupdate data karir dengan mengirimkan data lengkap seluruh field menggunakan method DELETE")
    public void mengirimkanRequestUntukmengupdateDataKarirDenganMengirimkanDataLengkapSeluruhFieldMenggunakanMethodDelete() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .multiPart("logo", new File("src/test/resources/Image/QA.jpeg"))
                .multiPart("cover", new File("src/test/resources/Image/cover.jpeg"))
                .multiPart("title_job", "Quality Engineer")
                .multiPart("company_name", "Google")
                .multiPart("location", "yogyakarta")
                .multiPart("size_company_employee", "1000")
                .multiPart("company_industry", "software development")
                .multiPart("required_skill", "programming languages")
                .multiPart("linkedin_url", "https://www.linkedin.com/company/google/job")
                .multiPart("about_job", "Create test case")
                .multiPart("about_company", "Lorem Ipsum")
                .delete(menetapkanApiEndpointUntukMengupdateDataKarirDenganIdValid());
    }

    @Step("saya menetapkan Api endpoint yang salah untuk mengupdate data karir")
    public String menetapkanApiEndpointYangSalahUntukMengupdateDataKarir() {
        return "/Career/4";
    }

    @Step("saya mengirimkan request untuk mengupdate data karir dengan mengirimkan data lengkap seluruh field menggunakan endpoint yang salah")
    public void mengirimkanRequestUntukMengupdateDataKarirDenganmenetapkanApiEndpointYangSalah() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .multiPart("logo", new File("src/test/resources/Image/QA.jpeg"))
                .multiPart("cover", new File("src/test/resources/Image/cover.jpeg"))
                .multiPart("title_job", "Quality Engineer")
                .multiPart("company_name", "Google")
                .multiPart("location", "yogyakarta")
                .multiPart("size_company_employee", "1000")
                .multiPart("company_industry", "software development")
                .multiPart("required_skill", "programming languages")
                .multiPart("linkedin_url", "https://www.linkedin.com/company/google/job")
                .multiPart("about_job", "Create test case")
                .multiPart("about_company", "Lorem Ipsum")
                .put(menetapkanApiEndpointYangSalahUntukMengupdateDataKarir());
    }
    @Step("saya menerima pesan data karir berhasil diperbaharui")
    public void sayaMenerimaPesanDataKarirBerhasilDiperbaharui () {
        restAssuredThat(response -> response.body("code", equalTo(200)));
        restAssuredThat(response -> response.body("message", equalTo("Counselor updated successfully")));
    }
}
