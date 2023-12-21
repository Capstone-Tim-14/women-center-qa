package starter.WebAdmin.TagArticle;

import io.cucumber.java.en.And;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class CreateTagArticle {
    private String url = "https://api-ferminacare.tech/api/v1/admin";

    @Step("saya menetapkan Api endpoint untuk membuat tag baru")
    public String menetapkanApiEndpointUntukMembuatTagBaru() {
        return url + "/articles/category";
    }

    @Step("saya mengirimkan request untuk membuat tag baru dengan menyisipkan data dan token")
    public void mengirimkanRequestUntukMembuatTagBaruDenganMenyisipkanDataDanToken() {
        JSONObject requestBody = new JSONObject();
        String token = GenerateToken.generateTokenAdmin();
        requestBody.put("name", "Testing");
        requestBody.put("description", "Testing");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .post(menetapkanApiEndpointUntukMembuatTagBaru());
    }
    @Step("menampilkan pesan sukses membuat kategori")
    public void menampilkanPesanSuksesMembuatKategori() {
        restAssuredThat(response->response.body("status",equalTo(201)));
        restAssuredThat(response->response.body("message",equalTo("Success created category")));
    }
    @Step("saya mengirimkan request untuk membuat tag baru dengan mengisi sebagian data")
    public void mengirimkanRequestUntukMembuatTagBaruDenganMengisiSebagianData() {
        JSONObject requestBody = new JSONObject();
        String token = GenerateToken.generateTokenAdmin();
        requestBody.put("name", "Testing");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .post(menetapkanApiEndpointUntukMembuatTagBaru());
    }
    @Step("saya mengirimkan request untuk membuat tag baru dengan mengosongkan data role")
    public void mengirimkanRequestUntukMembuatTagBaruDenganMengosongkanDataRole(){
        JSONObject requestBody = new JSONObject();
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .post(menetapkanApiEndpointUntukMembuatTagBaru());
    }
    @Step("saya mengirimkan request untuk membuat tag baru tanpa menyisipkan token")
    public void mengirimkanRequestUntukmmebuatTagBaruTanpaMenyisipkanToken(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Techo");
        requestBody.put("description", "Article ini tentang tech");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .post(menetapkanApiEndpointUntukMembuatTagBaru());
    }
    @Step("saya mengirimkan request untuk membuat tag baru namun mengisikan nama dengan nama yang sudah tersedia")
    public void mengirimkanRequestUntukMembuatTagBaruNmaunmengisikanNamaDenganNamaYangSudahTersedia(){
        JSONObject requestBody = new JSONObject();
        String token = GenerateToken.generateTokenAdmin();
        requestBody.put("name", "Techo");
        requestBody.put("description", "Article ini tentang tech");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .post(menetapkanApiEndpointUntukMembuatTagBaru());
    }
    @Step("saya menetapkan Api endpoint yang salah untuk membuat tag baru")
    public String menetapkanApiEndpointYangSalahUntukMembuatTagBaru(){
        return url + "/articles/Category";
    }
    @Step("saya mengirimkan request untuk membuat tag baru dengan menggunakan Api endpoint yang salah")
    public void mengirimkanRequestUntukMembuatTagBaruDenganMenggunakanApiEndpointYangSalah(){
        JSONObject requestBody = new JSONObject();
        String token = GenerateToken.generateTokenAdmin();
        requestBody.put("name", "Testing");
        requestBody.put("description", "Testing");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .post(menetapkanApiEndpointYangSalahUntukMembuatTagBaru());
    }
    @Step("saya mengirimkan request untuk membuat tag baru dengan method GET")
    public void mengirimkanRequestUntukMembuatTagBaruDenganmethodGET(){
        JSONObject requestBody = new JSONObject();
        String token = GenerateToken.generateTokenAdmin();
        requestBody.put("name", "Testing");
        requestBody.put("description", "Testing");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .get(menetapkanApiEndpointUntukMembuatTagBaru());
    }
    @Step("saya mengirimkan request untuk membuat tag baru dengan method PUT")
    public void mengirimkanRequestUntukMembuatTagBaruDenganmethodPUT(){
        JSONObject requestBody = new JSONObject();
        String token = GenerateToken.generateTokenAdmin();
        requestBody.put("name", "Testing");
        requestBody.put("description", "Testing");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .put(menetapkanApiEndpointUntukMembuatTagBaru());
    }
    @Step("saya mengirimkan request untuk membuat tag baru dengan method DELETE")
    public void mengirimkanRequestUntukMembuatTagBaruDenganmethodDELETE(){
        JSONObject requestBody = new JSONObject();
        String token = GenerateToken.generateTokenAdmin();
        requestBody.put("name", "Testing");
        requestBody.put("description", "Testing");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .delete(menetapkanApiEndpointUntukMembuatTagBaru());
    }


}