package starter.WebAdmin;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
public class Register{
    private static String url = "https://api-ferminacare.tech/api/v1/admin";

    @Step("saya menetapkan API endpoint")
    public String menetapkanEndpointValid(){

        return url + "/register";
    }

    @Step("saya mengirimkan request dengan memasukan data yang lengkap dan valid")
    public void mengirimkanRequestDenganMemasukanDataLengkapDanValid(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("first_name", "admin");
        requestBody.put("last_name", "ini");
        requestBody.put("username", "admin");
        requestBody.put("email", "adhitya@gmail.com");
        requestBody.put("password", "123123");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .post(menetapkanEndpointValid());
    }
    @Step("saya mengirimkan request dengan memasukan email valid namun password yang sangat pendek")
    public void sayaMengirimkanRequestDenganMemasukanEmailValidNamunPasswordYangSangatPendek() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("first_name", "admin");
        requestBody.put("last_name", "ini");
        requestBody.put("username", "admin");
        requestBody.put("email", "aya@gmail.com");
        requestBody.put("password", "1");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .post(menetapkanEndpointValid());
    }

    @Step("saya menerima status kode 201")
    public void menerimaStatusCode201(){
        restAssuredThat(response->response.statusCode(201));
    }
    @Step("saya menerima data valid yang berhasil ditambahkan")
    public void menerimaDataRegistrasi(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.REGISTER_ADMIN_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
    @Step("saya mengirimkan request dengan mengosongkan data")
    public void mengirimkanRequestDEnganBodyYangKosong(){
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .post(menetapkanEndpointValid());
    }
    @Step("saya menerima status kode 422")
    public void menerimaStatusCode422(){
        restAssuredThat(response->response.statusCode(422));
    }
    @Step("saya menerima pesan error")
    public void menerimaPesanError(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.REGISTER_DATA_KOSONG);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
    @Step("saya mengirimkan request dengan memasukan data yang tidak lengkap")
    public void mengirimkanRequestDataTidakLengkap(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("first_name", "admin");
        requestBody.put("last_name", "ini");
        requestBody.put("username", "ini");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .post(menetapkanEndpointValid());
    }
    @Step("saya menerima pesan error data yang wajib diisi")
    public void menerimaPesanErrorDataYangWajibDiisi(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.DATA_TIDAK_LENGKAP_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
    @Step("saya mengirimkan request dengan memasukan data yang sudah terdaftar")
    public void mengirimkanDataYangSudahTerdaftar(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("first_name", "admin");
        requestBody.put("last_name", "adminA");
        requestBody.put("username", "adminA");
        requestBody.put("email", "adminA@ferminacare.com");
        requestBody.put("password", "admin123");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .post(menetapkanEndpointValid());
    }
    @Step("saya menerima status kode 409")
    public void menerimaStatusCode409(){
        restAssuredThat(response->response.statusCode(409));
    }
    @Step("saya menerima pesan error email sudah terdaftar")
    public void menerimaPesanEmailSudahTerdaftar() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.EMAIL_SUDAH_TERDAFTAR);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
    @Step("saya mengirimkan request dengan memasukan data yang lengkap dan valid namun memakai method get")
    public void mengirimkanRequestDenganMethodGet(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("first_name", "admin");
        requestBody.put("last_name", "adminA");
        requestBody.put("username", "adminA");
        requestBody.put("email", "delete@ferminacare.com");
        requestBody.put("password", "admin123");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .delete(menetapkanEndpointValid());
    }
    @Step("saya menerima status kode 401")
    public void menerimaStatusCode401(){
        restAssuredThat(response->response.statusCode(401));
    }
    @Step("saya menerima status kode 404")
    public void menerimaStatusCode404(){
        restAssuredThat(response->response.statusCode(404));
    }
    @Step("saya menerima pesan error")
    public void menerimapesanError(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.REGISTER_DATA_KOSONG);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
    @Step("saya mengirimkan request dengan memasukan data yang lengkap dan valid namun memakai method put")
    public void mengirimkanRequestDenganMethodPut(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("first_name", "admin");
        requestBody.put("last_name", "adminA");
        requestBody.put("username", "adminA");
        requestBody.put("email", "delete@ferminacare.com");
        requestBody.put("password", "admin123");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .put(menetapkanEndpointValid());
    }
    @Step("saya menetapkan API endpoint yang salah")
    public String endpointSalah(){
        return url + "/registerrr";
    }
    @Step("saya menerima pesan error unauthorized")
    public void menerimaPesanUnauthorized(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.UNAUTHORIZED_MESSAGE);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}