package starter.WebAdmin.Article;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class ApprovedArticle {
    private String url = "https://api-ferminacare.tech/api/v1/admin/articles/approved-request";

    @Step("saya menetapkan Api endpoint untuk mengedit status artikel")
    public String menetapkanApiEndpointUntukMengeditStatusArtikel(){
        return url + "/artikel-baru";
    }
    @Step("saya mengirimkan request untuk mengedit status artikel dengan memasukan data valid")
    public void mengirimkanRequestUntukMengeditStatusArtikelDenganMemasukanDataValid(){
        JSONObject requestBody = new JSONObject();
        String token = GenerateToken.generateTokenAdmin();
        requestBody.put("status", "APPROVED");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .put(menetapkanApiEndpointUntukMengeditStatusArtikel());
    }
    @Step("saya mendapatkan pesan status artikel berhasil diubah")
    public void mendapatkanPesanStatusArtikelBerhasilDiubah(){
            restAssuredThat(response->response.body("code",equalTo(201)));
            restAssuredThat(response->response.body("message",equalTo("Congratulations, the article is PUBLISH")));
    }

    @Step("saya mengirimkan request untuk mengedit status artikel dengan memasukan data invalid")
    public void mengirmkanRequestUntukMengeditStatusArtikelDEnganMemasukanDataInvalid(){
        JSONObject requestBody = new JSONObject();
        String token = GenerateToken.generateTokenAdmin();
        requestBody.put("status", "BINGUNG");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .put(menetapkanApiEndpointUntukMengeditStatusArtikel());
    }
    @Step("saya mengirimkan request untuk mengedit status artikel dengan mengosongkan data status")
    public void mengirimkanRequestUntukMengeditStatusArtikelDenganMengosongkanDataStatus(){
        JSONObject requestBody = new JSONObject();
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .put(menetapkanApiEndpointUntukMengeditStatusArtikel());
    }
}
