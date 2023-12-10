package starter.stepdefinitions.WebAdmin.Counselor;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.WebAdmin.Counselor.GetAllCounselor;

public class GetAllCounselorsSteps {
    @Steps
    GetAllCounselor getAllCounselor;
    @Given("saya menetapkan API endpoint untuk mendapatkan semua konselor")
    public void menetapkanApiEndpointUntukmendapatkanSemuaKonselor(){
        getAllCounselor.menetapkanApiEndpointUntukmendapatkanSemuaKonselor();
    }
    @Given("saya menetapkan API endpoint untuk mendapatkan semua konselor dengan sebuah ID")
    public void menetapkanApiEndpointUntukMendapatkanSemuaKonselorDenganSebuahID(){
        getAllCounselor.menetapkanApiEndpointUntukMendapatkanSemuaKonselorDenganSebuahID();
    }
    @Given("saya menetapkan API endpoint yang salah untuk mendapatkan semua konselor")
    public void menetapkanApiEndpointYangSalahUntukMendapatkanSemuaKonselor(){
        getAllCounselor.menetapkanApiEndpointYangSalahUntukMendapatkanSemuaKonselor();
    }

    @When("saya mengirimkan request untuk mendapatkan semua konselor dengan menggunakan token")
    public void mengirimkanRequestUntukMendapatkanSemuaKonselorDenganMenggunakanToken(){
        getAllCounselor.mengirimkanRequestUntukMendapatkanSemuaKonselorDenganMenggunakanToken();
    }
    @And("saya menerima data konselor")
    public void menerimaDataKonselor(){
        getAllCounselor.menerimaDataKonselor();
    }
    @When("saya mengirimkan request untuk mendapatkan semua konselor dengan menggunakan sebuah ID")
    public void mengirimkanRequestUntukMendapatkanSemuaKonselorDenganMenggunakanIdValid(){
        getAllCounselor.mengirimkanRequestUntukMendapatkanSemuaKonselorDenganMenggunakanIdValid();
    }

    @When("saya mengirimkan request untuk mendapatkan semua konselor dengan API endpoint yang salah")
    public void mengirimkanRequestUntukMendapatkanSemuaKonselorDenganApEndpointYangSalah(){
        getAllCounselor.mengirimkanRequestUntukMendapatkanSemuaKonselorDenganApEndpointYangSalah();
    }

    @When("saya mengirimkan request untuk mendapatkan semua konselor dengan menggunakan method POST")
    public void mengirimkanRequestUntukMendapatkanSemuaKonselorDenganMenggunakanMethodPost(){
        getAllCounselor.mengirimkanRequestUntukMendapatkanSemuaKonselorDenganMenggunakanMethodPost();
    }
    @When("saya mengirimkan request untuk mendapatkan semua konselor dengan menggunakan method PUT")
    public void mengirimkanRequestUntukMendapatkanSemuaKonselorDenganMenggunakanMethodPut(){
        getAllCounselor.mengirimkanRequestUntukMendapatkanSemuaKonselorDenganMenggunakanMethodPut();
    }
    @When("saya mengirimkan request untuk mendapatkan semua konselor dengan menggunakan method DELETE")
    public void mengirimkanRequestUntukMendapatkanSemuaKonselorDenganMenggunakanMethodDelete(){
        getAllCounselor.mengirimkanRequestUntukMendapatkanSemuaKonselorDenganMenggunakanMethodDelete();
    }

    @When("saya mengirimkan request untuk mendapatkan semua konselor tanpa menggunakan token")
    public void sayaMengirimkanRequestUntukMendapatkanSemuaKonselorTanpaMenggunakanToken() {
        getAllCounselor.mengirimkanRequestUntukMendapatkanSemuaKonselorTanpaMenggunakanToken();
    }


}
