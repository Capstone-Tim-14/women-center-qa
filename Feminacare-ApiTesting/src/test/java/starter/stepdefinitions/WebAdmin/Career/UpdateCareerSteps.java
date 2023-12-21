package starter.stepdefinitions.WebAdmin.Career;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.WebAdmin.Career.UpdateCareer;

public class UpdateCareerSteps {

    @Steps
    UpdateCareer updateCareer;
    @Given("saya menetapkan Api endpoint untuk mengupdate data karir dengan ID valid")
    public void menetapkanApiEndpointUntukMengupdateDataKarirDenganIdValid(){
        updateCareer.menetapkanApiEndpointUntukMengupdateDataKarirDenganIdValid();
    }
    @When("saya mengirimkan request untuk mengupdate data karir dengan mengirimkan data lengkap seluruh field menggunakan method Put")
    public void mengirimkanRequestUntukmengupdateDataKarirDenganMengirimkanDataLengkapSeluruhFieldMenggunakanMethodPut(){
        updateCareer.mengirimkanRequestUntukmengupdateDataKarirDenganMengirimkanDataLengkapSeluruhFieldMenggunakanMethodPut();
    }
    @When("saya mengirimkan request untuk mengupdate data karir dengan mengirimkan data beberapa field menggunakan method Put")
    public void mengirimkanRequestUntukmengupdateDataKarirDenganMengirimkanDataLengkapBeberapaField(){
        updateCareer.mengirimkanRequestUntukmengupdateDataKarirDenganMengirimkanDataLengkapBeberapaField();
    }
    @When("saya mengirimkan request untuk mengupdate data karir dengan mengosongkan data")
    public void mengirimkanRequestUntukmengupdateDataKarirDenganMengsongkanData(){
        updateCareer.mengirimkanRequestUntukmengupdateDataKarirDenganMengsongkanData();
    }
    @Given("saya menetapkan Api endpoint untuk mengupdate data karir dengan ID invalid")
    public void menetapkanApiEndpointUntukMengupdateDataKarirDenganIdInvalid(){
        updateCareer.menetapkanApiEndpointUntukMengupdateDataKarirDenganIdInvalid();
    }
    @When("saya mengirimkan request untuk mengupdate data karir dengan mengirimkan data lengkap seluruh field namun dengan ID invalid")
    public void mengirimkanRequestUntukmengupdateDataKarirDenganMengirimkanDataLengkapSeluruhFieldNamunMenggunakanIdInvalid(){
        updateCareer.mengirimkanRequestUntukmengupdateDataKarirDenganMengirimkanDataLengkapSeluruhFieldNamunMenggunakanIdInvalid();
    }
    @When("saya mengirimkan request untuk mengupdate data karir dengan mengirimkan data lengkap seluruh field menggunakan menggunakan data yang sudah tersedia")
    public void mengirimkanRequestUntukmengupdateDataKarirDenganMengirimkanDataLengkapSeluruhFieldMenggunakanDataYangSudahTersedia(){
        updateCareer.mengirimkanRequestUntukmengupdateDataKarirDenganMengirimkanDataLengkapSeluruhFieldMenggunakanDataYangSudahTersedia();
    }
    @When("saya mengirimkan request untuk mengupdate data karir dengan mengirimkan data lengkap seluruh field menggunakan method Get")
    public void mengirimkanRequestUntukmengupdateDataKarirDenganMengirimkanDataLengkapSeluruhFieldMenggunakanMethodGet(){
        updateCareer.mengirimkanRequestUntukmengupdateDataKarirDenganMengirimkanDataLengkapSeluruhFieldMenggunakanMethodGet();
    }
    @Given("saya menetapkan Api endpoint yang salah untuk mengupdate data karir")
    public void menetapkanApiEndpointYangSalahUntukMengupdateDataKarir(){
        updateCareer.menetapkanApiEndpointYangSalahUntukMengupdateDataKarir();
    }
    @When("saya mengirimkan request untuk mengupdate data karir dengan mengirimkan data lengkap seluruh field menggunakan endpoint yang salah")
    public void menetapkanApiEndpointYangSalahUntukMengupdateDataKarirDenganIdValid(){
        updateCareer.menetapkanApiEndpointUntukMengupdateDataKarirDenganIdValid();
    }
    @When("saya mengirimkan request untuk mengupdate data karir dengan mengirimkan data lengkap seluruh field menggunakan method Delete")
    public void sayaMengirimkanRequestUntukMengupdateDataKarirDenganMengirimkanDataLengkapSeluruhFieldMenggunakanMethodDelete() {
        updateCareer.sayaMenerimaPesanDataKarirBerhasilDiperbaharui();
    }

    @When("saya mengirimkan request untuk mengupdate data karir dengan mengirimkan data lengkap seluruh field menggunakan method Post")
    public void sayaMengirimkanRequestUntukMengupdateDataKarirDenganMengirimkanDataLengkapSeluruhFieldMenggunakanMethodPost() {
        updateCareer.mengirimkanRequestUntukmengupdateDataKarirDenganMengirimkanDataLengkapSeluruhFieldMenggunakanMethodPost();
    }

    @And("saya menerima pesan data karir berhasil diperbaharui")
    public void sayaMenerimaPesanDataKarirBerhasilDiperbaharui() {
        updateCareer.sayaMenerimaPesanDataKarirBerhasilDiperbaharui();
    }
}
