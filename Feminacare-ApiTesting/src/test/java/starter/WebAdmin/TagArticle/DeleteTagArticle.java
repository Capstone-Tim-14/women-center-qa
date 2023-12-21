package starter.WebAdmin.TagArticle;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.GenerateToken;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class DeleteTagArticle {
    private String url = "https://api-ferminacare.tech/api/v1/admin/articles";
    @Step("saya menetapkan Api Endpoint untuk menghapus tag artikel berdasarkan ID valid")
    public String menetapkanApiEndpointUntukMenghapusTagArtikelBerdasarkanID(){
        return url + "/category/5";
    }
    @Step("saya mengirimkan request untuk menghapus tag artikel berdasarkan ID dengan menggunakan token")
    public void mengirimkanRequestUntukMenghapusTagArtikelBerdasarkanIdDenganMenggunakanToken(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .delete(menetapkanApiEndpointUntukMenghapusTagArtikelBerdasarkanID());
    }
    @Step("saya menerima pesan data berhasil dihapus")
    public void menerimaPesanDataBerhasilDihapus(){
        restAssuredThat(response->response.body("code",equalTo(200)));
        restAssuredThat(response->response.body("message",equalTo("Success Delete Tag By Id")));
    }
    @Step("saya menetapkan Api Endpoint untuk menghapus tag artikel tanpa menggunakan ID")
    public String menetapkanApiEndpointUntukMenghapusTagArtikelTanpaMenggunakanID(){
        return url + "/category";
    }
    @Step("saya mengirimkan request untuk menghapus tag artikel tanpa menggunakan ID")
    public void mengirimkanRequestUntukMenghapusTagArtikelTanpaMenggunakanID(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .delete(menetapkanApiEndpointUntukMenghapusTagArtikelTanpaMenggunakanID());
    }
    @Step("saya mengirimkan request untuk menghapus tag artikel berdasarkan ID yang valid namun tanpa menggunakan token")
    public void mengirimkanRequestUntukMenghapusTagArtikelBerdasarkanIdValidNamunTanpaMenggunakanToken(){
        SerenityRest.given()
                .header("Content-Type","application/json")
                .delete(menetapkanApiEndpointUntukMenghapusTagArtikelBerdasarkanID());
    }
    @Step("saya mengirimkan request untuk menghapus tag artikel menggunakan method GET")
    public void mengirmkanRequestUntukMenghapusTagArtikelMenggunakanMethodGET(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .get(menetapkanApiEndpointUntukMenghapusTagArtikelBerdasarkanID());
    }
    @Step("saya mengirimkan request untuk menghapus tag artikel menggunakan method POST")
    public void mengirimkanRequestUntukMenghapusTagArtikelMenggunakanMethodPOST(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .post(menetapkanApiEndpointUntukMenghapusTagArtikelBerdasarkanID());
    }
    @Step("saya mengirimkan request untuk menghapus tag artikel menggunakan method PUT")
    public void mengirimkanRequestUntukMenghapusTagArtikelMenggunakanMethodPUT(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .put(menetapkanApiEndpointUntukMenghapusTagArtikelBerdasarkanID());
    }
    @Step("saya menetapkan Api Endpoint yang salah untuk menghapus tag artikel berdasarkan ID invalid")
    public String menetapkanApiEndpointYangSalahUntukmenghapusTagArtikelBerdasarkanIDInvalid(){
        return url + "/category/1";
    }

    @Step("saya mengirimkan request untuk menghapus tag artikel berdasarkan ID invalid dengan menggunakan token")
    public void sayaMengirimkanRequestUntukMenghapusTagArtikelBerdasarkanIDInvalidDenganMenggunakanToken(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .delete(menetapkanApiEndpointYangSalahUntukmenghapusTagArtikelBerdasarkanIDInvalid());
    }
}
