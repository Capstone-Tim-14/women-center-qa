package starter.WebAdmin.Event;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.GenerateToken;

import java.io.File;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class UpdateEvent {
    private String url = "https://api-ferminacare.tech/api/v1/admin";

    @Step("saya menetapkan Api endpoint untuk mengupdate data event dengan ID valid")
    public String menetapkanApiEndpointUntukMengupdateDataEventDenganIdValid() {
        return url + "/event/1";
    }

    @Step("saya mengirimkan request untuk mengupdate data event dengan mengirimkan data lengkap seluruh field menggunakan method Put")
    public void mengirimkanRequestUntukmengupdateDataEventDenganMengirimkanDataLengkapSeluruhFieldMenggunakanMethodPut() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .multiPart("poster", new File("src/test/resources/Image/events.jpg"))
                .multiPart("title", "konser tulus")
                .multiPart("locations", "bandung")
                .multiPart("date", "2023-12-05")
                .multiPart("price", "1000")
                .multiPart("event_url", "https://meet.google.com/usq-jww-bxu")
                .multiPart("time_start", "05:00:00")
                .multiPart("time_finish", "06:00:00")
                .multiPart("event_type", "ofline")
                .multiPart("status", "OPEN")
                .multiPart("description", "Lorem Ipsum")
                .put(menetapkanApiEndpointUntukMengupdateDataEventDenganIdValid());
    }

    @Step("saya mengirimkan request untuk mengupdate data event dengan mengirimkan data beberapa field menggunakan method Put")
    public void mengirimkanRequestUntukmengupdateDataEventDenganMengirimkanDataLengkapBeberapaField() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .multiPart("poster", new File("src/test/resources/Image/events.jpg"))
                .multiPart("title", "konser tulus")
                .multiPart("locations", "bandung")
                .multiPart("date", "2023-12-05")
                .multiPart("price", "1000")
                .put(menetapkanApiEndpointUntukMengupdateDataEventDenganIdValid());
    }

    @Step("saya mengirimkan request untuk mengupdate data event dengan mengosongkan data")
    public void mengirimkanRequestUntukmengupdateDataEventDenganMengsongkanData() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .put(menetapkanApiEndpointUntukMengupdateDataEventDenganIdValid());
    }

    @Step("saya menetapkan Api endpoint untuk mengupdate data event dengan ID invalid")
    public String menetapkanApiEndpointUntukMengupdateDataEventDenganIdInvalid() {
        return url + "/event/189";
    }

    @Step("saya mengirimkan request untuk mengupdate data event dengan mengirimkan data lengkap seluruh field namun dengan ID invalid")
    public void mengirimkanRequestUntukmengupdateDataEventDenganMengirimkanDataLengkapSeluruhFieldNamunMenggunakanIdInvalid() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .multiPart("poster", new File("src/test/resources/Image/events.jpg"))
                .multiPart("title", "konser tulus")
                .multiPart("locations", "bandung")
                .multiPart("date", "2023-12-05")
                .multiPart("price", "1000")
                .multiPart("event_url", "https://meet.google.com/usq-jww-bxu")
                .multiPart("time_start", "05:00:00")
                .multiPart("time_finish", "06:00:00")
                .multiPart("event_type", "ofline")
                .multiPart("status", "OPEN")
                .multiPart("description", "Lorem Ipsum")
                .put(menetapkanApiEndpointUntukMengupdateDataEventDenganIdInvalid());
    }

    @Step("saya mengirimkan request untuk mengupdate data event dengan mengirimkan data lengkap seluruh field menggunakan menggunakan data yang sudah tersedia")
    public void mengirimkanRequestUntukmengupdateDataEventDenganMengirimkanDataLengkapSeluruhFieldMenggunakanDataYangSudahTersedia() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .multiPart("poster", new File("src/test/resources/Image/events.jpg"))
                .multiPart("title", "pesta")
                .multiPart("locations", "jkt")
                .multiPart("date", "2023-12-05")
                .multiPart("price", "1000")
                .multiPart("event_url", "https://meet.google.com/usq-jrww-bxu")
                .multiPart("time_start", "05:00:00")
                .multiPart("time_finish", "06:00:00")
                .multiPart("event_type", "online")
                .multiPart("status", "OPEN")
                .multiPart("description", "Lorem Ipsum")
                .put(menetapkanApiEndpointUntukMengupdateDataEventDenganIdValid());
    }
    @Step("saya menerima pesan data event berhasil diperbaharui")
    public void sayaMenerimaPesanDataEventBerhasilDiperbaharui () {
        restAssuredThat(response -> response.body("code", equalTo(200)));
        restAssuredThat(response -> response.body("message", equalTo("Event updated!")));
    }
}
