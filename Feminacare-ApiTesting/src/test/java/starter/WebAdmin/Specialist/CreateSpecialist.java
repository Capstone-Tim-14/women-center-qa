package starter.WebAdmin.Specialist;

import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateSpecialist {
    private String url = "https://api-ferminacare.tech/api/v1/admin";

    @Step("saya menetapkan Api endpoint untuk membuat spesialis baru")
    public String menetapkanApiEndpointUntukMembuatSpesialisBaru() {
        return url + "/specialist";
    }

    @Step("saya mengirimkan request untuk membuat spesialis baru dengan menyisipkan data dan token")
    public void mengirimkanRequestUntukMembuatSpesialisBaruDenganMenyisipkanDataDanToken() {
        JSONObject requestBody = new JSONObject();
        String token = GenerateToken.generateTokenAdmin();
        requestBody.put("name", "Testing");
        requestBody.put("description", "Testing");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .post(menetapkanApiEndpointUntukMembuatSpesialisBaru());
    }
    @Step("saya menerima pesan sukses membuat spesialis baru")
    public void menampilkanPesanSuksesMembuatSpesialis() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.CREATE_SPECIALIST);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
    @Step("saya mengirimkan request untuk membuat spesialis baru dengan mengisi sebagian data")
    public void mengirimkanRequestUntukMembuatSpesialisBaruDenganMengisiSebagianData() {
        JSONObject requestBody = new JSONObject();
        String token = GenerateToken.generateTokenAdmin();
        requestBody.put("name", "Depresi");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .post(menetapkanApiEndpointUntukMembuatSpesialisBaru());
    }
    @Step("saya mengirimkan request untuk membuat spesialis baru dengan mengosongkan data Spesialis")
    public void mengirimkanRequestUntukMembuatSpesialisBaruDenganMengosongkanDataRole(){
        JSONObject requestBody = new JSONObject();
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .post(menetapkanApiEndpointUntukMembuatSpesialisBaru());
    }
    @Step("saya mengirimkan request untuk membuat spesialis baru tanpa menyisipkan token")
    public void mengirimkanRequestUntukmmebuatSpesialisBaruTanpaMenyisipkanToken(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Techo");
        requestBody.put("description", " ini tentang tech");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .post(menetapkanApiEndpointUntukMembuatSpesialisBaru());
    }
    @Step("saya mengirimkan request untuk membuat spesialis baru namun mengisikan nama dengan nama yang sudah tersedia")
    public void mengirimkanRequestUntukMembuatSpesialisBaruNmaunmengisikanNamaDenganNamaYangSudahTersedia(){
        JSONObject requestBody = new JSONObject();
        String token = GenerateToken.generateTokenAdmin();
        requestBody.put("name", "Techo");
        requestBody.put("description", "Article ini tentang tech");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .post(menetapkanApiEndpointUntukMembuatSpesialisBaru());
    }
    @Step("saya menetapkan Api endpoint yang salah untuk membuat spesialis baru")
    public String menetapkanApiEndpointYangSalahUntukMembuatSpesialisBaru(){
        return url + "/Specialist";
    }
    @Step("saya mengirimkan request untuk membuat spesialis baru dengan menggunakan Api endpoint yang salah")
    public void mengirimkanRequestUntukMembuatTagBaruDenganMenggunakanApiEndpointYangSalah(){
        JSONObject requestBody = new JSONObject();
        String token = GenerateToken.generateTokenAdmin();
        requestBody.put("name", "kesehatan");
        requestBody.put("description", "sehat");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .post(menetapkanApiEndpointYangSalahUntukMembuatSpesialisBaru());
    }

    @Step("saya mengirimkan request untuk membuat spesialis baru dengan method PUT")
    public void mengirimkanRequestUntukMembuatSpesialisBaruDenganmethodPUT(){
        JSONObject requestBody = new JSONObject();
        String token = GenerateToken.generateTokenAdmin();
        requestBody.put("name", "Testing");
        requestBody.put("description", "Testing");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .put(menetapkanApiEndpointUntukMembuatSpesialisBaru());
    }
    @Step("saya mengirimkan request untuk membuat spesialis baru dengan method DELETE")
    public void mengirimkanRequestUntukMembuatSpesialisBaruDenganmethodDELETE(){
        JSONObject requestBody = new JSONObject();
        String token = GenerateToken.generateTokenAdmin();
        requestBody.put("name", "Testing");
        requestBody.put("description", "Testing");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .delete(menetapkanApiEndpointUntukMembuatSpesialisBaru());
    }
    @Step("saya mengirimkan request untuk membuat spesialis baru dengan menyisipkan data yang sudah tersimpan")
    public void sayaMengirimkanRequestUntukMembuatSpesialisBaruDenganMenyisipkanDataYangSudahTersimpan() {
    }

    @Step("saya mengirimkan request untuk membuat spesialis baru tanpa menyisipkan dan token")
    public void sayaMengirimkanRequestUntukMembuatSpesialisBaruTanpaMenyisipkanDanToken() {
    }

    @Step("saya mengirimkan request untuk menambahkan spesialis baru dengan method GET")
    public void sayaMengirimkanRequestUntukMenambahkanSpesialisBaruDenganMethodGET() {
        JSONObject requestBody = new JSONObject();
        String token = GenerateToken.generateTokenAdmin();
        requestBody.put("name", "Testing");
        requestBody.put("description", "Testing");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .get(menetapkanApiEndpointUntukMembuatSpesialisBaru());
    }
}
