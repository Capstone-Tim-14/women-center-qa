package starter.WebAdmin.Event;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import java.io.File;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class CreateEvent {
    private String url = "https://api-ferminacare.tech/api/v1/admin/";

    @Step("saya menetapkan Api endpoint untuk membuat event baru")
    public String menetapkanApiEndpointUntukMembuatEventBaru() {
        // Implementasi logika untuk menetapkan API endpoint
        return url + "event";
    }

    @Step("saya mengirimkan request untuk membuat event dengan mengisi data lengkap dan valid")
    public void mengirimkanRequestDataLengkapDanValid() {
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
                .post(menetapkanApiEndpointUntukMembuatEventBaru());
    }

    @Step("saya menerima pesan data event berhasil dibuat")
    public void menerimaPesanDataEventBerhasilDibuat() {
        restAssuredThat(response->response.body("code",equalTo(201)));
        restAssuredThat(response->response.body("message",equalTo("Success Create Event")));
    }

    @Step("saya mengirimkan request untuk membuat event dengan mengisi data yang tidak lengkap")
    public void mengirimkanRequestDataTidakLengkap() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .multiPart("time_start", "05:00:00")
                .multiPart("time_finish", "06:00:00")
                .multiPart("event_type", "online")
                .multiPart("status", "OPEN")
                .multiPart("description", "Lorem Ipsum")
                .post(menetapkanApiEndpointUntukMembuatEventBaru());
    }

    @Step("saya mengirimkan request untuk membuat event dengan mengosongkan seluruh field data")
    public void mengirimkanRequestDataKosong() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .post(menetapkanApiEndpointUntukMembuatEventBaru());
    }

    @Step("saya mengirimkan request untuk membuat event tanpa menggunakan token")
    public void mengirimkanRequestTanpaToken() {

        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
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
                .post(menetapkanApiEndpointUntukMembuatEventBaru());
    }

    @Step("saya mengirimkan request untuk membuat event baru dengan mengisikan data yang sudah tersimpan")
    public void mengirimkanRequestDataDuplikat() {
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
                .post(menetapkanApiEndpointUntukMembuatEventBaru());
    }

    @Step("saya mengirimkan request untuk membuat event dengan menggunakan method Get")
    public void mengirimkanRequestDenganMethodGet() {
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
                .get(menetapkanApiEndpointUntukMembuatEventBaru());
    }

    @Step("saya mengirimkan request untuk membuat event dengan menggunakan method Put")
    public void mengirimkanRequestDenganMethodPut() {
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
                .put(menetapkanApiEndpointUntukMembuatEventBaru());
    }

    @Step("saya mengirimkan request untuk membuat event dengan menggunakan method Delete")
    public void mengirimkanRequestDenganMethodDelete() {
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
                .delete(menetapkanApiEndpointUntukMembuatEventBaru());
    }

}
