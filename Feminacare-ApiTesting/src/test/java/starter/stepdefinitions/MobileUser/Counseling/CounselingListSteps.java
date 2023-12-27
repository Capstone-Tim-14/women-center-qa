package starter.stepdefinitions.MobileUser.Counseling;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.MobileUser.Counseling.CounselingList;

public class CounselingListSteps {
    @Steps
    CounselingList counselingList;
    @Given("saya menetapkan API endpoint untuk mendapatkan semua sesi konseling")
    public void menetapkanApiEndpointUntukmendapatkanSemuaSesiKonseling(){
        counselingList.menetapkanApiEndpointUntukmendapatkanSemuaSesiKonseling();
    }
    @Given("saya menetapkan API endpoint untuk mendapatkan semua sesi konseling dengan sebuah ID")
    public void menetapkanApiEndpointUntukMendapatkanSemuaSesiKonselingDenganSebuahID(){
        counselingList.menetapkanApiEndpointUntukMendapatkanSemuaSesiKonselingDenganSebuahID();

    }
    @Given("saya menetapkan API endpoint yang salah untuk mendapatkan semua sesi konseling")
    public void menetapkanApiEndpointYangSalahUntukMendapatkanSemuaSesiKonseling(){
        counselingList.menetapkanApiEndpointYangSalahUntukMendapatkanSemuaSesiKonseling();
    }

    @When("saya mengirimkan request untuk mendapatkan semua sesi konseling dengan menggunakan token")
    public void mengirimkanRequestUntukMendapatkanSemuaSesiKonselingDenganMenggunakanToken(){
        counselingList.mengirimkanRequestUntukMendapatkanSemuaSesiKonselingDenganMenggunakanToken();
    }
    @And("saya menerima data sesi konseling")
    public void menerimaDataSesiKonseling(){
        counselingList.menerimaDataSesiKonseling();
    }
    @When("saya mengirimkan request untuk mendapatkan semua sesi konseling tanpa menggunakan token")
    public void mengirimkanRequestUntukMendapatkanSemuaSesiKonselingTanpaMenggunakanToken(){
        counselingList.mengirimkanRequestUntukMendapatkanSemuaSesiKonselingTanpaMenggunakanToken();
    }

    @When("saya mengirimkan request untuk mendapatkan semua sesi konseling dengan API endpoint yang salah")
    public void mengirimkanRequestUntukMendapatkanSemuaSesiKonselingDenganApEndpointYangSalah(){
        counselingList.mengirimkanRequestUntukMendapatkanSemuaSesiKonselingDenganApEndpointYangSalah();
    }

    @When("saya mengirimkan request untuk mendapatkan semua sesi konseling dengan menggunakan sebuah ID")
    public void sayaMengirimkanRequestUntukMendapatkanSemuaSesiKonselingDenganMenggunakanSebuahID() {
        counselingList.mengirimkanRequestUntukMendapatkanSemuaSesiKonselingDenganMenggunakanIdValid();
    }
}
