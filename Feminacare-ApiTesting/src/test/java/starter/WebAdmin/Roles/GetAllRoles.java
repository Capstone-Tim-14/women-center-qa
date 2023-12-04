package starter.WebAdmin.Roles;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetAllRoles {
    private String url = "https://api-ferminacare.tech/api/v1";
    @Step("saya menetapkan API endpoint untuk mendapatkan semua roles")
    public String menetapkanApiEndpointUntukmendapatkanSemuaRoles(){
        return url + "/roles";
    }
    @Step("saya menetapkan API endpoint dengan sebuah ID")
    public String menetapkanApiEndpointDenganSebuahID(){
        return url + "/roles/1";
    }
    @Step("saya menetapkan API endpoint yang salah untuk mendapatkan semua roles")
    public String menetapkanApiEndpointYangSalahUntukMendapatkanSemuaRoles(){
        return url + "/Roles";
    }

    @Step("saya mengirimkan request untuk mendapatkan semua roles dengan menggunakan token")
    public void mengirimkanRequestUntukMendapatkanSemuaRolesDenganMenggunakanToken(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application")
                .header("Authorization", "Bearer " + token)
                .get(menetapkanApiEndpointUntukmendapatkanSemuaRoles());
    }
    @Step("saya menerima data roles")
    public void menerimaDataRoles(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_ALL_ROLES_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
    @Step("saya mengirimkan request untuk mendapatkan semua roles tanpa menggunakan token")
    public void mengirimkanRequestUntukMendapatkanSemuaRolesTanpaMenggunakanToken(){
        SerenityRest.given()
                .header("Content-Type","application/json")
                .get(menetapkanApiEndpointUntukmendapatkanSemuaRoles());
    }
    @Step("saya mengirimkan request untuk mendapatkan semua roles dengan menggunakan ID")
    public void mengirimkanRequestUntukMendapatkanSemuaRolesDenganMenggunakanIdValid(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .get(menetapkanApiEndpointDenganSebuahID());
    }

    @Step("saya mendapatkan status kode 404")
    public void mendapatkanStatusKode404(){
        restAssuredThat(response->response.statusCode(400));
    }

    @Step("saya menerima pesan error Not Found")
    public void menerimaPesanErrorNotFound(){
        restAssuredThat(response->response.body("message",equalTo("Not Found")));
    }

    @Step("saya mengirimkan request untuk mendapatkan semua roles dengan API endpoint yang salah")
    public void mengirimkanRequestUntukMendapatkanSemuaRolesDenganApEndpointYangSalah(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .get(menetapkanApiEndpointYangSalahUntukMendapatkanSemuaRoles());
    }

    @Step("saya mengirimkan request untuk mendapatkan semua roles dengan menggunakan method POST")
    public void mengirimkanRequestUntukMendapatkanSemuaRolesDenganMenggunakanMethodPost(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .post(menetapkanApiEndpointUntukmendapatkanSemuaRoles());
    }
    @Step("saya mengirimkan request untuk mendapatkan semua roles dengan menggunakan method PUT")
    public void mengirimkanRequestUntukMendapatkanSemuaRolesDenganMenggunakanMethodPut(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .put(menetapkanApiEndpointUntukmendapatkanSemuaRoles());
    }
    @Step("saya mengirimkan request untuk mendapatkan semua roles dengan menggunakan method DELETE")
    public void mengirimkanRequestUntukMendapatkanSemuaRolesDenganMenggunakanMethodDelete(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .delete(menetapkanApiEndpointUntukmendapatkanSemuaRoles());
    }
}
