package starter.stepdefinitions.WebAdmin.Career;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.WebAdmin.Career.CreateCareer;
public class CreateCareerSteps {
    @Steps
    CreateCareer createCareer;
    @Given("saya menetapkan Api endpoint untuk membuat karir baru")
    public void menetapkanApiEndpointUntukMembuatKarirBaru() {
        // Implementasi logika untuk menetapkan API endpoint
        createCareer.menetapkanApiEndpointUntukMembuatKarirBaru();
    }

    @When("saya mengirimkan request untuk membuat karir dengan mengisi data lengkap dan valid")
    public void mengirimkanRequestDataLengkapDanValid() {
        createCareer.mengirimkanRequestDataLengkapDanValid();
    }

    @And("saya menerima pesan data berhasil dibuat")
    public void menerimaPesanDataBerhasilDibuat() {
        createCareer.menerimaPesanDataBerhasilDibuat();
    }

    @When("saya mengirimkan request untuk membuat karir dengan mengisi data yang tidak lengkap")
    public void mengirimkanRequestDataTidakLengkap() {
        createCareer.mengirimkanRequestDataTidakLengkap();
    }

    @When("saya mengirimkan request untuk membuat karir dengan mengosongkan seluruh field data")
    public void mengirimkanRequestDataKosong() {
        createCareer.mengirimkanRequestDataKosong();
    }

    @When("saya mengirimkan request untuk membuat karir tanpa menggunakan token")
    public void mengirimkanRequestTanpaToken() {
        createCareer.mengirimkanRequestTanpaToken();
    }

    @When("saya mengirimkan request untuk membuat karir baru dengan mengisikan data yang sudah tersimpan")
    public void mengirimkanRequestDataDuplikat() {
        createCareer.mengirimkanRequestDataDuplikat();
    }


    @When("saya mengirimkan request untuk membuat karir dengan menggunakan method Get")
    public void mengirimkanRequestDenganMethodGet() {
        createCareer.mengirimkanRequestDenganMethodGet();
    }


    @When("saya mengirimkan request untuk membuat karir dengan menggunakan method Put")
    public void mengirimkanRequestDenganMethodPut() {
        createCareer.mengirimkanRequestDenganMethodPut();
    }


    @When("saya mengirimkan request untuk membuat karir dengan menggunakan method Delete")
    public void mengirimkanRequestDenganMethodDelete() {
        createCareer.mengirimkanRequestDenganMethodDelete();
    }

    @And("saya menerima pesan karir berhasil dibuat")
    public void sayaMenerimaPesanKarirBerhasilDibuat() {
        createCareer.sayaMenerimaPesanKarirBerhasilDibuat();
    }
}