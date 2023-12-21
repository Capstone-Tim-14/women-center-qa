package starter.WebAdmin.Career;

import io.cucumber.java.en.And;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import java.io.File;
import java.util.Objects;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class CreateCareer {
    private String url = "https://api-ferminacare.tech/api/v1/admin/";

    @Step("saya menetapkan Api endpoint untuk membuat karir baru")
    public String menetapkanApiEndpointUntukMembuatKarirBaru() {
        // Implementasi logika untuk menetapkan API endpoint
        return url + "career";
    }

    @Step("saya mengirimkan request untuk membuat karir dengan mengisi data lengkap dan valid")
    public void mengirimkanRequestDataLengkapDanValid() {
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
                .post(menetapkanApiEndpointUntukMembuatKarirBaru());
    }

    @Step("saya menerima pesan data berhasil dibuat")
    public void menerimaPesanDataBerhasilDibuat() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.MEMBUAT_DATA_BARU_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("saya mengirimkan request untuk membuat karir dengan mengisi data yang tidak lengkap")
    public void mengirimkanRequestDataTidakLengkap() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .multiPart("logo", new File("src/test/resources/Image/QA.jpeg"))
                .multiPart("linkedin_url", "https://www.linkedin.com/company/google/job")
                .multiPart("about_job", "Create test case")
                .multiPart("about_company", "Lorem Ipsum")
                .post(menetapkanApiEndpointUntukMembuatKarirBaru());
    }

    @Step("saya mengirimkan request untuk membuat karir dengan mengosongkan seluruh field data")
    public void mengirimkanRequestDataKosong() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .post(menetapkanApiEndpointUntukMembuatKarirBaru());
    }

    @Step("saya mengirimkan request untuk membuat karir tanpa menggunakan token")
    public void mengirimkanRequestTanpaToken() {

        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
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
                .post(menetapkanApiEndpointUntukMembuatKarirBaru());
    }

    @Step("saya mengirimkan request untuk membuat karir baru dengan mengisikan data yang sudah tersimpan")
    public void mengirimkanRequestDataDuplikat() {
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
                .post(menetapkanApiEndpointUntukMembuatKarirBaru());
    }

    @Step("saya mengirimkan request untuk membuat karir dengan menggunakan method Get")
    public void mengirimkanRequestDenganMethodGet() {
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
                .get(menetapkanApiEndpointUntukMembuatKarirBaru());
    }

    @Step("saya mengirimkan request untuk membuat karir dengan menggunakan method Put")
    public void mengirimkanRequestDenganMethodPut() {
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
                .put(menetapkanApiEndpointUntukMembuatKarirBaru());
    }

    @Step("saya mengirimkan request untuk membuat karir dengan menggunakan method Delete")
    public void mengirimkanRequestDenganMethodDelete() {
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
                .delete(menetapkanApiEndpointUntukMembuatKarirBaru());
}
    @Step("saya menerima pesan karir berhasil dibuat")
    public void sayaMenerimaPesanKarirBerhasilDibuat() {
        restAssuredThat(response->response.body("code",equalTo(201)));
        restAssuredThat(response->response.body("message",equalTo("Success create career")));
    }

}