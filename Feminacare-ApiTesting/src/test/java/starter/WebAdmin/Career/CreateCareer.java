package starter.WebAdmin.Career;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import java.io.File;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateCareer {
    private String url = "https://api-ferminacare.tech/api/v1/admin/";

    @Step("saya menetapkan Api endpoint untuk membuat karir baru")
    public String menetapkanApiEndpointUntukMembuatKarirBaru() {
        // Implementasi logika untuk menetapkan API endpoint
        return url + "career";
    }

    @Step("saya mengirimkan request untuk membuat karir dengan mengisi data lengkap dan valid")
    public void mengirimkanRequestDataLengkapDanValid() {
        JSONObject requestBody = new JSONObject();
        String token = GenerateToken.generateTokenAdmin();
        requestBody.put("title_job", "Quality Engineer");
        requestBody.put("company_name", "Google");
        requestBody.put("location", "yogyakarta");
        requestBody.put("size_company_employee", "1000");
        requestBody.put("company_industry", "software development");
        requestBody.put("required_skill", "programming languages");
        requestBody.put("linkedin_url", "https://www.linkedin.com/company/google/job");
        requestBody.put("about_job", "Create test case");
        requestBody.put("about_company", "Lorem Ipsum");
        File logo = new File("Feminacare-ApiTesting/src/test/resources/Image/QA.jpeg");
        File cover = new File("Feminacare-ApiTesting/src/test/resources/Image/cover.jpeg");
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .multiPart("file",logo)
                .multiPart("file",cover)
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
        JSONObject requestBody = new JSONObject();
        String token = GenerateToken.generateTokenAdmin();
        requestBody.put("title_job", "Quality Engineer");;
        requestBody.put("linkedin_url", "https://www.linkedin.com/company/google/job");
        requestBody.put("about_job", "Create test case");
        requestBody.put("about_company", "Lorem Ipsum");
        File logo = new File("Feminacare-ApiTesting/src/test/resources/Image/QA.jpeg");
        File cover = new File("Feminacare-ApiTesting/src/test/resources/Image/cover.jpeg");
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .multiPart("file",logo)
                .multiPart("file",cover)
                .post(menetapkanApiEndpointUntukMembuatKarirBaru());
    }

    @Step("saya mengirimkan request untuk membuat karir dengan mengosongkan seluruh field data")
    public void mengirimkanRequestDataKosong() {
        JSONObject requestBody = new JSONObject();
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .post(menetapkanApiEndpointUntukMembuatKarirBaru());
    }

    @Step("saya mengirimkan request untuk membuat karir tanpa menggunakan token")
    public void mengirimkanRequestTanpaToken() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("title_job", "Quality Engineer");
        requestBody.put("company_name", "Google");
        requestBody.put("location", "yogyakarta");
        requestBody.put("size_company_employee", "1000");
        requestBody.put("company_industry", "software development");
        requestBody.put("required_skill", "programming languages");
        requestBody.put("linkedin_url", "https://www.linkedin.com/company/google/job");
        requestBody.put("about_job", "Create test case");
        requestBody.put("about_company", "Lorem Ipsum");
        File logo = new File("Feminacare-ApiTesting/src/test/resources/Image/QA.jpeg");
        File cover = new File("Feminacare-ApiTesting/src/test/resources/Image/cover.jpeg");
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .multiPart("file",logo)
                .multiPart("file",cover)
                .post(menetapkanApiEndpointUntukMembuatKarirBaru());
    }

    @Step("saya mengirimkan request untuk membuat karir baru dengan mengisikan data yang sudah tersimpan")
    public void mengirimkanRequestDataDuplikat() {
        JSONObject requestBody = new JSONObject();
        String token = GenerateToken.generateTokenAdmin();
        requestBody.put("title_job", "Quality Engineer");
        requestBody.put("company_name", "Google");
        requestBody.put("location", "yogyakarta");
        requestBody.put("size_company_employee", "1000");
        requestBody.put("company_industry", "software development");
        requestBody.put("required_skill", "programming languages");
        requestBody.put("linkedin_url", "https://www.linkedin.com/company/google/job");
        requestBody.put("about_job", "Create test case");
        requestBody.put("about_company", "Lorem Ipsum");
        File logo = new File("Feminacare-ApiTesting/src/test/resources/Image/QA.jpeg");
        File cover = new File("Feminacare-ApiTesting/src/test/resources/Image/cover.jpeg");
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .multiPart("file",logo)
                .multiPart("file",cover)
                .post(menetapkanApiEndpointUntukMembuatKarirBaru());
    }

    @Step("saya mengirimkan request untuk membuat karir dengan menggunakan method Get")
    public void mengirimkanRequestDenganMethodGet() {
        JSONObject requestBody = new JSONObject();
        String token = GenerateToken.generateTokenAdmin();
        requestBody.put("title_job", "Quality Engineer");
        requestBody.put("company_name", "Google");
        requestBody.put("location", "yogyakarta");
        requestBody.put("size_company_employee", "1000");
        requestBody.put("company_industry", "software development");
        requestBody.put("required_skill", "programming languages");
        requestBody.put("linkedin_url", "https://www.linkedin.com/company/google/job");
        requestBody.put("about_job", "Create test case");
        requestBody.put("about_company", "Lorem Ipsum");
        File logo = new File("Feminacare-ApiTesting/src/test/resources/Image/QA.jpeg");
        File cover = new File("Feminacare-ApiTesting/src/test/resources/Image/cover.jpeg");
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .multiPart("file",logo)
                .multiPart("file",cover)
                .get(menetapkanApiEndpointUntukMembuatKarirBaru());
    }

    @Step("saya mengirimkan request untuk membuat karir dengan menggunakan method Put")
    public void mengirimkanRequestDenganMethodPut() {
        JSONObject requestBody = new JSONObject();
        String token = GenerateToken.generateTokenAdmin();
        requestBody.put("title_job", "Quality Engineer");
        requestBody.put("company_name", "Google");
        requestBody.put("location", "yogyakarta");
        requestBody.put("size_company_employee", "1000");
        requestBody.put("company_industry", "software development");
        requestBody.put("required_skill", "programming languages");
        requestBody.put("linkedin_url", "https://www.linkedin.com/company/google/job");
        requestBody.put("about_job", "Create test case");
        requestBody.put("about_company", "Lorem Ipsum");
        File logo = new File("Feminacare-ApiTesting/src/test/resources/Image/QA.jpeg");
        File cover = new File("Feminacare-ApiTesting/src/test/resources/Image/cover.jpeg");
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .multiPart("file",logo)
                .multiPart("file",cover)
                .put(menetapkanApiEndpointUntukMembuatKarirBaru());
    }

    @Step("saya mengirimkan request untuk membuat karir dengan menggunakan method Delete")
    public void mengirimkanRequestDenganMethodDelete() {
        JSONObject requestBody = new JSONObject();
        String token = GenerateToken.generateTokenAdmin();
        requestBody.put("title_job", "Quality Engineer");
        requestBody.put("company_name", "Google");
        requestBody.put("location", "yogyakarta");
        requestBody.put("size_company_employee", "1000");
        requestBody.put("company_industry", "software development");
        requestBody.put("required_skill", "programming languages");
        requestBody.put("linkedin_url", "https://www.linkedin.com/company/google/job");
        requestBody.put("about_job", "Create test case");
        requestBody.put("about_company", "Lorem Ipsum");
        File logo = new File("Feminacare-ApiTesting/src/test/resources/Image/QA.jpeg");
        File cover = new File("Feminacare-ApiTesting/src/test/resources/Image/cover.jpeg");
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .multiPart("file",logo)
                .multiPart("file",cover)
                .delete(menetapkanApiEndpointUntukMembuatKarirBaru());
    }

}

