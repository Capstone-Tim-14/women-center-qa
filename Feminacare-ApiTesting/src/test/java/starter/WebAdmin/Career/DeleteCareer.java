package starter.WebAdmin.Career;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.GenerateToken;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class DeleteCareer {
    private String url = "https://api-ferminacare.tech/api/v1/admin";
    @Step("saya menetapkan Api Endpoint untuk menghapus karir berdasarkan ID valid")
    public String menetapkanApiEndpointUntukMenghapusKarirBerdasarkanID(){
        return url + "/career/5";
    }
    @Step("saya mengirimkan request untuk menghapus karir berdasarkan ID dengan menggunakan token")
    public void mengirimkanRequestUntukMenghapusKarirBerdasarkanIdDenganMenggunakanToken(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .delete(menetapkanApiEndpointUntukMenghapusKarirBerdasarkanID());
    }
    @Step("saya menerima pesan data karir berhasil dihapus")
    public void menerimaPesanDataKarirBerhasilDihapus(){
        restAssuredThat(response->response.body("code",equalTo(200)));
        restAssuredThat(response->response.body("message",equalTo("Success Delete career")));
    }
    @Step("saya menetapkan Api Endpoint untuk menghapus karir tanpa menggunakan ID")
    public String menetapkanApiEndpointUntukMenghapusKarirTanpaMenggunakanID(){
        return url + "/career";
    }
    @Step("saya mengirimkan request untuk menghapus karir tanpa menggunakan ID")
    public void mengirimkanRequestUntukMenghapusKarirTanpaMenggunakanID(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .delete(menetapkanApiEndpointUntukMenghapusKarirTanpaMenggunakanID());
    }
    @Step("saya mengirimkan request untuk menghapus karir berdasarkan ID yang valid namun tanpa menggunakan token")
    public void mengirimkanRequestUntukMenghapusKarirBerdasarkanIdValidNamunTanpaMenggunakanToken(){
        SerenityRest.given()
                .header("Content-Type","application/json")
                .delete(menetapkanApiEndpointUntukMenghapusKarirBerdasarkanID());
    }
    @Step("saya mengirimkan request untuk menghapus karir menggunakan method GET")
    public void mengirmkanRequestUntukMenghapusKarirMenggunakanMethodGET(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .get(menetapkanApiEndpointUntukMenghapusKarirBerdasarkanID());
    }
    @Step("saya mengirimkan request untuk menghapus karir menggunakan method POST")
    public void mengirimkanRequestUntukMenghapusKarirMenggunakanMethodPOST(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .post(menetapkanApiEndpointUntukMenghapusKarirBerdasarkanID());
    }
    @Step("saya mengirimkan request untuk menghapus karir menggunakan method PUT")
    public void mengirimkanRequestUntukMenghapusKarirMenggunakanMethodPUT(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .put(menetapkanApiEndpointUntukMenghapusKarirBerdasarkanID());
    }
    @Step("saya menetapkan Api Endpoint yang salah untuk menghapus karir berdasarkan ID valid")
    public String menetapkanApiEndpointYangSalahUntukmenghapusKarirBerdasarkanIDValid(){
        return url + "/Career/5";
    }

    @Step("saya mengirimkan request untuk menghapus karir dengan endpoint yang salah")
    public void sayaMengirimkanRequestUntukMenghapusKarirDenganEndpointSalah(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .delete(menetapkanApiEndpointYangSalahUntukmenghapusKarirBerdasarkanIDValid());
    }
    @Step("saya menetapkan Api Endpoint untuk menghapus karir berdasarkan ID invalid")
    public String sayaMenetapkanApiEndpointUntukMenghapusKarirBerdasarkanIDInvalid() {
        return url + "/career/5";
    }
    @Step("saya mengirimkan request untuk menghapus karir berdasarkan ID invalid dengan menggunakan token")
    public void sayaMengirimkanRequestUntukMenghapusKarirBerdasarkanIDInvalidDenganMenggunakanToken() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .delete((sayaMenetapkanApiEndpointUntukMenghapusKarirBerdasarkanIDInvalid()));
    }
}
