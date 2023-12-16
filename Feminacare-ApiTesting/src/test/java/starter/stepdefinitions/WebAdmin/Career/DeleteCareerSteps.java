package starter.stepdefinitions.WebAdmin.Career;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.WebAdmin.Career.DeleteCareer;

public class DeleteCareerSteps {
    @Steps
    DeleteCareer deleteCareer;
    @Given("saya menetapkan Api Endpoint untuk menghapus karir berdasarkan ID valid")
    public void menetapkanApiEndpointUntukMenghapusKarirBerdasarkanID(){
        deleteCareer.menetapkanApiEndpointUntukMenghapusKarirBerdasarkanID();
    }
    @When("saya mengirimkan request untuk menghapus karir berdasarkan ID dengan menggunakan token")
    public void mengirimkanRequestUntukMenghapusKarirBerdasarkanIdDenganMenggunakanToken(){
        deleteCareer.mengirimkanRequestUntukMenghapusKarirBerdasarkanIdDenganMenggunakanToken();
    }

    @Given("saya menetapkan Api Endpoint untuk menghapus karir tanpa menggunakan ID")
    public void menetapkanApiEndpointUntukMenghapusKarirTanpaMenggunakanID(){
        deleteCareer.menetapkanApiEndpointUntukMenghapusKarirTanpaMenggunakanID();
    }
    @When("saya mengirimkan request untuk menghapus karir tanpa menggunakan ID")
    public void mengirimkanRequestUntukMenghapusKarirTanpaMenggunakanID(){
        deleteCareer.mengirimkanRequestUntukMenghapusKarirTanpaMenggunakanID();
    }
    @When("saya mengirimkan request untuk menghapus karir berdasarkan ID yang valid namun tanpa menggunakan token")
    public void mengirimkanRequestUntukMenghapusKarirBerdasarkanIdValidNamunTanpaMenggunakanToken(){
        deleteCareer.mengirimkanRequestUntukMenghapusKarirBerdasarkanIdValidNamunTanpaMenggunakanToken();
    }
    @When("saya mengirimkan request untuk menghapus karir menggunakan method GET")
    public void mengirmkanRequestUntukMenghapusKarirMenggunakanMethodGET(){
        deleteCareer.mengirmkanRequestUntukMenghapusKarirMenggunakanMethodGET();
    }
    @When("saya mengirimkan request untuk menghapus karir menggunakan method POST")
    public void mengirimkanRequestUntukMenghapusKarirMenggunakanMethodPOST(){
        deleteCareer.mengirimkanRequestUntukMenghapusKarirMenggunakanMethodPOST();
    }
    @When("saya mengirimkan request untuk menghapus karir menggunakan method PUT")
    public void mengirimkanRequestUntukMenghapusKarirMenggunakanMethodPUT(){
        deleteCareer.mengirimkanRequestUntukMenghapusKarirMenggunakanMethodPUT();
    }
    @When("saya menetapkan Api Endpoint yang salah untuk menghapus karir berdasarkan ID valid")
    public void menetapkanApiEndpointYangSalahUntukmenghapusKarirBerdasarkanIDInvalid(){
        deleteCareer.sayaMengirimkanRequestUntukMenghapusKarirDenganEndpointSalah();
    }

    @And("saya menerima pesan data karir berhasil dihapus")
    public void menerimaPesanDataKarirBerhasilDihapus(){
        deleteCareer.menerimaPesanDataKarirBerhasilDihapus();
    }

    @When("saya mengirimkan request untuk menghapus karir berdasarkan ID invalid dengan menggunakan token")
    public void sayaMengirimkanRequestUntukMenghapusKarirBerdasarkanIDInvalidDenganMenggunakanToken() {
        deleteCareer.sayaMengirimkanRequestUntukMenghapusKarirBerdasarkanIDInvalidDenganMenggunakanToken();
    }

    @When("saya mengirimkan request untuk menghapus karir dengan endpoint yang salah")
    public void sayaMengirimkanRequestUntukMenghapusKarirDenganEndpointYangSalah() {
        deleteCareer.sayaMengirimkanRequestUntukMenghapusKarirDenganEndpointSalah();
    }

    @Given("saya menetapkan Api Endpoint untuk menghapus karir berdasarkan ID invalid")
    public void sayaMenetapkanApiEndpointUntukMenghapusKarirBerdasarkanIDInvalid() {
        deleteCareer.sayaMenetapkanApiEndpointUntukMenghapusKarirBerdasarkanIDInvalid();
    }
}
