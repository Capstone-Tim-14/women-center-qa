package starter.WebAdmin.Counselor;

import io.cucumber.java.en.And;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.GenerateToken;
import java.io.File;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class UpdateCounselor {
    private String url = "https://api-ferminacare.tech/api/v1/admin";

    @Step("saya menetapkan Api endpoint untuk mengupdate data konselor dengan ID valid")
    public String menetapkanApiEndpointUntukMengupdateDataKonselorDenganIdValid() {
        return url + "/counselors/4";
    }

    @Step("saya mengirimkan request untuk mengupdate data konselor dengan mengirimkan data lengkap seluruh field menggunakan method Put")
    public void mengirimkanRequestUntukmengupdateDataKonselorDenganMengirimkanDataLengkapSeluruhFieldMenggunakanMethodPut() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .multiPart("first_name", "rizal")
                .multiPart("last_name", "sahala")
                .multiPart("email", "rizal@gmail.com")
                .multiPart("picture", new File("src/test/resources/Image/QA.jpeg"))
                .multiPart("phone_number", "0857")
                .multiPart("description", "konselor baru berpengalaman")
                .multiPart("username", "iniRizal")
                .multiPart("password", "admin123")
                .multiPart("education", "psikolog")
                .multiPart("birthday", "2002-11-10")
                .put(menetapkanApiEndpointUntukMengupdateDataKonselorDenganIdValid());
    }

    @Step("saya mengirimkan request untuk mengupdate data konselor dengan mengirimkan data beberapa field menggunakan method Put")
    public void mengirimkanRequestUntukmengupdateDataKonselorDenganMengirimkanDataLengkapBeberapaField() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .multiPart("first_name", "sabilal")
                .multiPart("last_name", "abu")
                .multiPart("email", "rbil@gmail.com")
                .multiPart("picture", new File("src/test/resources/Image/QA.jpeg"))
                .put(menetapkanApiEndpointUntukMengupdateDataKonselorDenganIdValid());
    }

    @Step("saya mengirimkan request untuk mengupdate data konselor dengan mengosongkan data")
    public void mengirimkanRequestUntukmengupdateDataKonselorDenganMengsongkanData() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .put(menetapkanApiEndpointUntukMengupdateDataKonselorDenganIdValid());
    }

    @Step("saya menetapkan Api endpoint untuk mengupdate data konselor dengan ID invalid")
    public String menetapkanApiEndpointUntukMengupdateDataKonselorDenganIdInvalid() {
        return url + "/counselors/1";
    }

    @Step("saya mengirimkan request untuk mengupdate data konselor dengan mengirimkan data lengkap seluruh field namun dengan ID invalid")
    public void mengirimkanRequestUntukmengupdateDataKonselorDenganMengirimkanDataLengkapSeluruhFieldNamunMenggunakanIdInvalid() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .multiPart("first_name", "rizal")
                .multiPart("last_name", "sahala")
                .multiPart("email", "rizal@gmail.com")
                .multiPart("picture", new File("src/test/resources/Image/QA.jpeg"))
                .multiPart("phone_number", "0857")
                .multiPart("description", "konselor baru berpengalaman")
                .multiPart("username", "iniRizal")
                .multiPart("password", "admin123")
                .multiPart("education", "psikolog")
                .multiPart("birthday", "2002-11-10")
                .put(menetapkanApiEndpointUntukMengupdateDataKonselorDenganIdInvalid());
    }

    @Step("saya mengirimkan request untuk mengupdate data konselor dengan mengirimkan data lengkap seluruh field menggunakan menggunakan data yang sudah tersedia")
    public void mengirimkanRequestUntukmengupdateDataKonselorDenganMengirimkanDataLengkapSeluruhFieldMenggunakanDataYangSudahTersedia() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .multiPart("first_name", "rizal")
                .multiPart("last_name", "sahala")
                .multiPart("email", "rizal@gmail.com")
                .multiPart("picture", new File("src/test/resources/Image/QA.jpeg"))
                .multiPart("phone_number", "0857")
                .multiPart("description", "konselor baru berpengalaman")
                .multiPart("username", "iniRizal")
                .multiPart("password", "admin123")
                .multiPart("education", "psikolog")
                .multiPart("birthday", "2002-11-10")
                .put(menetapkanApiEndpointUntukMengupdateDataKonselorDenganIdValid());
    }

    @Step("saya mengirimkan request untuk mengupdate data konselor dengan mengirimkan data lengkap seluruh field menggunakan method Get")
    public void mengirimkanRequestUntukmengupdateDataKonselorDenganMengirimkanDataLengkapSeluruhFieldMenggunakanMethodGet() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .multiPart("first_name", "rizal")
                .multiPart("last_name", "sahala")
                .multiPart("email", "rizal@gmail.com")
                .multiPart("picture", new File("src/test/resources/Image/QA.jpeg"))
                .multiPart("phone_number", "0857")
                .multiPart("description", "konselor baru berpengalaman")
                .multiPart("username", "iniRizal")
                .multiPart("password", "admin123")
                .multiPart("education", "psikolog")
                .multiPart("birthday", "2002-11-10")
                .get(menetapkanApiEndpointUntukMengupdateDataKonselorDenganIdValid());
    }

    @Step("saya mengirimkan request untuk mengupdate data konselor dengan mengirimkan data lengkap seluruh field menggunakan method POST")
    public void mengirimkanRequestUntukmengupdateDataKonselorDenganMengirimkanDataLengkapSeluruhFieldMenggunakanMethodPost() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .multiPart("first_name", "rizal")
                .multiPart("last_name", "sahala")
                .multiPart("email", "rizal@gmail.com")
                .multiPart("picture", new File("src/test/resources/Image/QA.jpeg"))
                .multiPart("phone_number", "0857")
                .multiPart("description", "konselor baru berpengalaman")
                .multiPart("username", "iniRizal")
                .multiPart("password", "admin123")
                .multiPart("education", "psikolog")
                .multiPart("birthday", "2002-11-10")
                .post(menetapkanApiEndpointUntukMengupdateDataKonselorDenganIdValid());
    }

    @Step("saya mengirimkan request untuk mengupdate data konselor dengan mengirimkan data lengkap seluruh field menggunakan method DELETE")
    public void mengirimkanRequestUntukmengupdateDataKonselorDenganMengirimkanDataLengkapSeluruhFieldMenggunakanMethodDelete() {
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .contentType(ContentType.MULTIPART) // set to multipart/form-data
                .header("Authorization", "Bearer " + token)
                .multiPart("first_name", "rizal")
                .multiPart("last_name", "sahala")
                .multiPart("email", "rizal@gmail.com")
                .multiPart("picture", new File("src/test/resources/Image/QA.jpeg"))
                .multiPart("phone_number", "0857")
                .multiPart("description", "konselor baru berpengalaman")
                .multiPart("username", "iniRizal")
                .multiPart("password", "admin123")
                .multiPart("education", "psikolog")
                .multiPart("birthday", "2002-11-10")
                .delete(menetapkanApiEndpointUntukMengupdateDataKonselorDenganIdValid());
    }

    @Step("saya menerima pesan data konselor berhasil diperbaharui")
    public void sayaMenerimaPesanDataKonselorBerhasilDiperbaharui () {
        restAssuredThat(response -> response.body("code", equalTo(200)));
        restAssuredThat(response -> response.body("message", equalTo("Counselor updated successfully")));
    }
}

