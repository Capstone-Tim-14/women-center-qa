package starter.stepdefinitions.MobileUser.Counseling;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.MobileUser.Counseling.GetCounselingDetail;

public class GetCounselingDetailSteps {
    @Steps
    GetCounselingDetail getCounselingDetail;
    @Given("saya menetapkan API endpoint untuk mendapatkan detail konseling dengan memasukan ID valid")
    public void menetapkanApiEndpointUntukmendapatkanDetailKonselingDenganMemasukanIdValid(){
        getCounselingDetail.menetapkanApiEndpointUntukmendapatkanDetailKonselingDenganMemasukanIdValid();
    }
    @When("saya mengirimkan request untuk mendapatkan detail konseling dengan menggunakan token")
    public void mengirimkanRequestUntukMendapatkanDetailKonselingDenganMenggunakanToken(){
        getCounselingDetail.mengirimkanRequestUntukMendapatkanDetailKonselingDenganMenggunakanToken();
    }

    @Given("saya menetapkan API endpoint untuk mendapatkan detail konseling dengan memasukan ID invalid")
    public void menetapkanApiEndpointUntukmendapatkanDetailKonselingDenganMemasukanIdInvalid(){
        getCounselingDetail.menetapkanApiEndpointUntukmendapatkanDetailKonselingDenganMemasukanIdInvalid();
    }
    @When("saya mengirimkan request untuk mendapatkan detail konseling tanpa menggunakan token")
    public void mengirimkanRequestUntukmendapatkanDetailKonselingTanpaMenggunakanToken(){
        getCounselingDetail.mengirimkanRequestUntukmendapatkanDetailKonselingTanpaMenggunakanToken();
    }

    @Given("saya menetapkan API endpoint untuk mendapatkan detail konseling tanpa memasukan ID")
    public void menetapkanApiEndpointUntukMendapatkanDetailKonselingTanpaMemasukanId(){
        getCounselingDetail.menetapkanApiEndpointUntukMendapatkanDetailKonselingTanpaMemasukanId();
    }
    @When("saya mengirimkan request untuk mendapatkan detail konseling tanpa memasukan ID")
    public void mengrimkanRequestUtukMendapatkanDetailKonselingTanpaMemasukanID(){
        getCounselingDetail.mengrimkanRequestUtukMendapatkanDetailKonselingTanpaMemasukanID();
    }

    @When("saya menetapkan API endpoint yang salah untuk mendapatkan detail konseling")
    public void menetapkanApiEndpointYangSalahUntukmendapatkanDetailKonseling(){
        getCounselingDetail.menetapkanApiEndpointYangSalahUntukmendapatkanDetailKonseling();
    }
    @When("saya mengirimkan request untuk mendapatkan detail konseling dengan API endpoint yang salah")
    public void mengirimkanRequestUntukmendapatkanDetailKonselingDenganApiEndpointSalah(){
        getCounselingDetail.mengirimkanRequestUntukmendapatkanDetailKonselingDenganApiEndpointSalah();
    }

    @And("saya menerima data detail konseling")
    public void sayaMenerimaDataDetailKonseling() {
    }

    @When("saya mengirimkan request dengan invalid ID untuk mendapatkan detail konseling")
    public void sayaMengirimkanRequestDenganInvalidIDUntukMendapatkanDetailKonseling() {
        getCounselingDetail.mengirimkanRequestUntukMendapatkanDetailKonselingDenganMemasukanInvalidID();
    }
}
