package starter.WebAdmin.Career;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class UpdateRecomendationCareer {
    private String url = "https://api-ferminacare.tech/api/v1/admin/career/recomended";
    @Step("saya menetapkan Api endpoint untuk mengedit status rekomendasi karir")
    public String menetapkanApiEndpointUntukMengeditStatusRekomendasiKarir(){
        return url + "?career_id=74&status=false";
    }
    @Step("saya mengirimkan request untuk mengedit status rekomendasi karir dengan memasukan data valid")
    public void mengirimkanRequestUntukMengeditStatusRekomendasiKarirDenganMemasukanDataValid(){
        JSONObject requestBody = new JSONObject();
        String token = GenerateToken.generateTokenAdmin();
        requestBody.put("recomendation", "true");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .put(menetapkanApiEndpointUntukMengeditStatusRekomendasiKarir());
    }
    @Step("saya mendapatkan pesan status rekomendasi karir berhasil diubah")
    public void mendapatkanPesanStatusRekomendasiKarirBerhasilDiubah(){
        restAssuredThat(response->response.body("code",equalTo(200)));
        restAssuredThat(response->response.body("message",equalTo("Recomendation update")));
    }

    @Step("saya mengirimkan request untuk mengedit status rekomendasi karir dengan memasukan data invalid")
    public void mengirmkanRequestUntukMengeditStatusRekomendasiKarirDEnganMemasukanDataInvalid(){
        JSONObject requestBody = new JSONObject();
        String token = GenerateToken.generateTokenAdmin();
        requestBody.put("recomendation", "BINGUNG");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .put(menetapkanApiEndpointUntukMengeditStatusRekomendasiKarir());
    }
    @Step("saya mengirimkan request untuk mengedit status rekomendasi karir dengan mengosongkan data status")
    public void mengirimkanRequestUntukMengeditStatusRekomendasiKarirDenganMengosongkanDataStatus(){
        JSONObject requestBody = new JSONObject();
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .put(menetapkanApiEndpointUntukMengeditStatusRekomendasiKarir());
    }
}
