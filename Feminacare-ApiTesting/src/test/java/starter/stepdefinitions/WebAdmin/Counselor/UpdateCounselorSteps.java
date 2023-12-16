package starter.stepdefinitions.WebAdmin.Counselor;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.WebAdmin.Counselor.UpdateCounselor;

public class UpdateCounselorSteps {
    @Steps
    UpdateCounselor updateCounselor;
    @Given("saya menetapkan Api endpoint untuk mengupdate data konselor dengan ID valid")
    public void menetapkanApiEndpointUntukMengupdateDataKonselorDenganIdValid(){
        updateCounselor.menetapkanApiEndpointUntukMengupdateDataKonselorDenganIdValid();
    }
    @When("saya mengirimkan request untuk mengupdate data konselor dengan mengirimkan data lengkap seluruh field menggunakan method Put")
    public void mengirimkanRequestUntukmengupdateDataKonselorDenganMengirimkanDataLengkapSeluruhFieldMenggunakanMethodPut(){
        updateCounselor.mengirimkanRequestUntukmengupdateDataKonselorDenganMengirimkanDataLengkapSeluruhFieldMenggunakanMethodPut();
    }
    @When("saya mengirimkan request untuk mengupdate data konselor dengan mengirimkan data beberapa field menggunakan method Put")
    public void mengirimkanRequestUntukmengupdateDataKonselorDenganMengirimkanDataLengkapBeberapaField(){
        updateCounselor.mengirimkanRequestUntukmengupdateDataKonselorDenganMengirimkanDataLengkapBeberapaField();
    }
    @When("saya mengirimkan request untuk mengupdate data konselor dengan mengosongkan data")
    public void mengirimkanRequestUntukmengupdateDataKonselorDenganMengsongkanData(){
        updateCounselor.mengirimkanRequestUntukmengupdateDataKonselorDenganMengsongkanData();
    }
    @Given("saya menetapkan Api endpoint untuk mengupdate data konselor dengan ID invalid")
    public void menetapkanApiEndpointUntukMengupdateDataKonselorDenganIdInvalid(){
        updateCounselor.menetapkanApiEndpointUntukMengupdateDataKonselorDenganIdInvalid();
    }
    @When("saya mengirimkan request untuk mengupdate data konselor dengan mengirimkan data lengkap seluruh field namun dengan ID invalid")
    public void mengirimkanRequestUntukmengupdateDataKonselorDenganMengirimkanDataLengkapSeluruhFieldNamunMenggunakanIdInvalid(){
        updateCounselor.mengirimkanRequestUntukmengupdateDataKonselorDenganMengirimkanDataLengkapSeluruhFieldNamunMenggunakanIdInvalid();
    }
    @When("saya mengirimkan request untuk mengupdate data konselor dengan mengirimkan data lengkap seluruh field menggunakan menggunakan data yang sudah tersedia")
    public void mengirimkanRequestUntukmengupdateDataKonselorDenganMengirimkanDataLengkapSeluruhFieldMenggunakanDataYangSudahTersedia(){
        updateCounselor.mengirimkanRequestUntukmengupdateDataKonselorDenganMengirimkanDataLengkapSeluruhFieldMenggunakanDataYangSudahTersedia();
    }
    @When("saya mengirimkan request untuk mengupdate data konselor dengan mengirimkan data lengkap seluruh field menggunakan method Get")
    public void mengirimkanRequestUntukmengupdateDataKonselorDenganMengirimkanDataLengkapSeluruhFieldMenggunakanMethodGet(){
        updateCounselor.mengirimkanRequestUntukmengupdateDataKonselorDenganMengirimkanDataLengkapSeluruhFieldMenggunakanMethodGet();
    }
    @Given("saya menetapkan Api endpoint yang salah untuk mengupdate data konselor")
    public void menetapkanApiEndpointYangSalahUntukMengupdateDataKonselor(){
        updateCounselor.menetapkanApiEndpointYangSalahUntukMengupdateDataKonselor();
    }
    @When("saya mengirimkan request untuk mengupdate data konselor dengan mengirimkan data lengkap seluruh field menggunakan endpoint yang salah")
    public void menetapkanApiEndpointYangSalahUntukMengupdateDataKonselorDenganIdValid(){
        updateCounselor.mengirimkanRequestUntukMengupdateDataKonselorDenganmenetapkanApiEndpointYangSalah();
    }
    @When("saya mengirimkan request untuk mengupdate data konselor dengan mengirimkan data lengkap seluruh field menggunakan method Delete")
    public void sayaMengirimkanRequestUntukMengupdateDataKonselorDenganMengirimkanDataLengkapSeluruhFieldMenggunakanMethodDelete() {
        updateCounselor.mengirimkanRequestUntukmengupdateDataKonselorDenganMengirimkanDataLengkapSeluruhFieldMenggunakanMethodDelete();
    }

    @When("saya mengirimkan request untuk mengupdate data konselor dengan mengirimkan data lengkap seluruh field menggunakan method Post")
    public void sayaMengirimkanRequestUntukMengupdateDataKonselorDenganMengirimkanDataLengkapSeluruhFieldMenggunakanMethodPost() {
        updateCounselor.mengirimkanRequestUntukmengupdateDataKonselorDenganMengirimkanDataLengkapSeluruhFieldMenggunakanMethodPost();
    }

    @And("saya menerima pesan data konselor berhasil diperbaharui")
    public void sayaMenerimaPesanDataKonselorBerhasilDiperbaharui() {
        updateCounselor.sayaMenerimaPesanDataKonselorBerhasilDiperbaharui();
    }
}
