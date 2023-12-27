package starter.WebAdmin.Counselor.Schedule;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import starter.utils.GenerateToken;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateSchedule {
    private String url = "https://api-ferminacare.tech/api/v1/admin/counselor";
    @Step("saya menetapkan Api endpoint untuk membuat jadwal baru")
    public String sayaMenetapkanApiEndpointUntukMembuatJadwalBaru() {
        return url + "/4/schedule";
    }
    @Step("saya menerima jadwal karir berhasil dibuat")
    public void sayaMenerimaJadwalKarirBerhasilDibuat() {
        restAssuredThat(response->response.body("code", Matchers.equalTo(201)));
        restAssuredThat(response->response.body("message", Matchers.equalTo("Success create career")));
    }

    @Step("saya mengirimkan request untuk membuat jadwal dengan mengisi data yang tidak lengkap")
    public void sayaMengirimkanRequestUntukMembuatJadwalDenganMengisiDataYangTidakLengkap() {
        JSONObject requestBody = new JSONObject();
        String token = GenerateToken.generateTokenAdmin();
        requestBody.put("day_schedule", "Rabu");
        requestBody.put("time_start", "08:00:00");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .post((sayaMenetapkanApiEndpointUntukMembuatJadwalBaru()));
    }

    @Step("saya mengirimkan request untuk membuat jadwal dengan mengosongkan seluruh field data")
    public void sayaMengirimkanRequestUntukMembuatJadwalDenganMengosongkanSeluruhFieldData() {
        JSONObject requestBody = new JSONObject();
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .post((sayaMenetapkanApiEndpointUntukMembuatJadwalBaru()));
    }

    @Step("saya mengirimkan request untuk membuat jadwal tanpa menggunakan token")
    public void sayaMengirimkanRequestUntukMembuatJadwalTanpaMenggunakanToken() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("day_schedule", "Rabu");
        requestBody.put("time_start", "08:00:00");
        requestBody.put("time_finish", "12:00:00");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .post((sayaMenetapkanApiEndpointUntukMembuatJadwalBaru()));
    }

    @Step("saya mengirimkan request untuk membuat jadwal dengan mengisi data lengkap dan valid")
    public void sayaMengirimkanRequestUntukMembuatJadwalDenganMengisiDataLengkapDanValid() {
        JSONObject requestBody = new JSONObject();
        String token = GenerateToken.generateTokenAdmin();
        requestBody.put("'data'.'day_schedule'", "Rabu");
        requestBody.put("'data'.'time_start'", "08:00:00");
        requestBody.put("'data'.'time_finish'", "12:00:00");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .post((sayaMenetapkanApiEndpointUntukMembuatJadwalBaru()));
    }

    @Step("saya menetapkan Api endpoint untuk membuat jadwal baru dengan ID yang invalid")
    public String sayaMenetapkanApiEndpointUntukMembuatJadwalBaruDenganIDYangInvalid() {
        return url + "/400/schedule";
    }

    @Step("saya mengirimkan request untuk membuat jadwal dengan menggunakan ID yang invalid")
    public void sayaMengirimkanRequestUntukMembuatJadwalDenganMenggunakanIDYangInvalid() {
        JSONObject requestBody = new JSONObject();
        String token = GenerateToken.generateTokenAdmin();
        requestBody.put("day_schedule", "Rabu");
        requestBody.put("time_start", "08:00:00");
        requestBody.put("time_finish", "12:00:00");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .post((sayaMenetapkanApiEndpointUntukMembuatJadwalBaruDenganIDYangInvalid()));
    }

    @Step("saya mengirimkan request untuk membuat jadwal di hari yang sudah penuh")
    public void sayaMengirimkanRequestUntukMembuatJadwalDiHariYangSudahPenuh() {
        JSONObject requestBody = new JSONObject();
        String token = GenerateToken.generateTokenAdmin();
        requestBody.put("day_schedule", "Rabu");
        requestBody.put("time_start", "08:00:00");
        requestBody.put("time_finish", "10:00:00");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .post((sayaMenetapkanApiEndpointUntukMembuatJadwalBaru()));
    }
}
