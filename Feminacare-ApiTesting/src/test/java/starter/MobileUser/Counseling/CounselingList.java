package starter.MobileUser.Counseling;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CounselingList {
    private String url = "https://api-ferminacare.tech/api/v1";
    @Step("saya menetapkan API endpoint untuk mendapatkan semua sesi konseling")
    public String menetapkanApiEndpointUntukmendapatkanSemuaSesiKonseling(){
        return url +"/counselors/counseling-session";
    }
    @Step("saya menetapkan API endpoint untuk mendapatkan semua sesi konseling dengan sebuah ID")
    public String menetapkanApiEndpointUntukMendapatkanSemuaSesiKonselingDenganSebuahID(){
        return url + "/counselors/counseling-session/23";
    }
    @Step("saya menetapkan API endpoint yang salah untuk mendapatkan semua sesi konseling")
    public String menetapkanApiEndpointYangSalahUntukMendapatkanSemuaSesiKonseling(){
        return url + "/counselors/Counseling-session";
    }

    @Step("saya mengirimkan request untuk mendapatkan semua sesi konseling dengan menggunakan token")
    public void mengirimkanRequestUntukMendapatkanSemuaSesiKonselingDenganMenggunakanToken(){
        String token = GenerateToken.generateTokenKonselor();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .get(menetapkanApiEndpointUntukmendapatkanSemuaSesiKonseling());
    }
    @Step("saya menerima data sesi konseling")
    public void menerimaDataSesiKonseling(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_LIST_COUNSELING_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
    @Step("saya mengirimkan request untuk mendapatkan semua sesi konseling tanpa menggunakan token")
    public void mengirimkanRequestUntukMendapatkanSemuaSesiKonselingTanpaMenggunakanToken(){
        SerenityRest.given()
                .header("Content-Type","application/json")
                .get((menetapkanApiEndpointUntukmendapatkanSemuaSesiKonseling()));
    }
    @Step("saya mengirimkan request untuk mendapatkan semua sesi konseling dengan menggunakan ID")
    public void mengirimkanRequestUntukMendapatkanSemuaSesiKonselingDenganMenggunakanIdValid(){
        String token = GenerateToken.generateTokenKonselor();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .get(menetapkanApiEndpointUntukMendapatkanSemuaSesiKonselingDenganSebuahID());
    }

    @Step("saya mengirimkan request untuk mendapatkan semua sesi konseling dengan API endpoint yang salah")
    public void mengirimkanRequestUntukMendapatkanSemuaSesiKonselingDenganApEndpointYangSalah(){
        String token = GenerateToken.generateTokenKonselor();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .get(menetapkanApiEndpointYangSalahUntukMendapatkanSemuaSesiKonseling());
    }
}
