package starter.stepdefinitions.WebAdmin.Counselor.Schedule;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.WebAdmin.Counselor.Schedule.CreateSchedule;

public class CreateScheduleSteps {
    @Steps
    CreateSchedule createSchedule;
    @Given("saya menetapkan Api endpoint untuk membuat jadwal baru")
    public void sayaMenetapkanApiEndpointUntukMembuatJadwalBaru() {
        createSchedule.sayaMenetapkanApiEndpointUntukMembuatJadwalBaru();
    }
    @And("saya menerima jadwal berhasil dibuat")
    public void sayaMenerimaJadwalKarirBerhasilDibuat() {
        createSchedule.sayaMenerimaJadwalKarirBerhasilDibuat();
    }

    @When("saya mengirimkan request untuk membuat jadwal dengan mengisi data yang tidak lengkap")
    public void sayaMengirimkanRequestUntukMembuatJadwalDenganMengisiDataYangTidakLengkap() {
        createSchedule.sayaMengirimkanRequestUntukMembuatJadwalDenganMengisiDataYangTidakLengkap();
    }

    @When("saya mengirimkan request untuk membuat jadwal dengan mengosongkan seluruh field data")
    public void sayaMengirimkanRequestUntukMembuatJadwalDenganMengosongkanSeluruhFieldData() {
        createSchedule.sayaMengirimkanRequestUntukMembuatJadwalDenganMengosongkanSeluruhFieldData();
    }

    @When("saya mengirimkan request untuk membuat jadwal tanpa menggunakan token")
    public void sayaMengirimkanRequestUntukMembuatJadwalTanpaMenggunakanToken() {
        createSchedule.sayaMengirimkanRequestUntukMembuatJadwalTanpaMenggunakanToken();
    }

    @When("saya mengirimkan request untuk membuat jadwal dengan mengisi data lengkap dan valid")
    public void sayaMengirimkanRequestUntukMembuatJadwalDenganMengisiDataLengkapDanValid() {
        createSchedule.sayaMengirimkanRequestUntukMembuatJadwalDenganMengisiDataLengkapDanValid();
    }

    @Given("saya menetapkan Api endpoint untuk membuat jadwal baru dengan ID yang invalid")
    public void sayaMenetapkanApiEndpointUntukMembuatJadwalBaruDenganIDYangInvalid() {
        createSchedule.sayaMenetapkanApiEndpointUntukMembuatJadwalBaruDenganIDYangInvalid();
    }

    @When("saya mengirimkan request untuk membuat jadwal dengan menggunakan ID yang invalid")
    public void sayaMengirimkanRequestUntukMembuatJadwalDenganMenggunakanIDYangInvalid() {
        createSchedule.sayaMengirimkanRequestUntukMembuatJadwalDenganMenggunakanIDYangInvalid();
    }

    @When("saya mengirimkan request untuk membuat jadwal di hari yang sudah penuh")
    public void sayaMengirimkanRequestUntukMembuatJadwalDiHariYangSudahPenuh() {
        createSchedule.sayaMengirimkanRequestUntukMembuatJadwalDiHariYangSudahPenuh();
    }
}
