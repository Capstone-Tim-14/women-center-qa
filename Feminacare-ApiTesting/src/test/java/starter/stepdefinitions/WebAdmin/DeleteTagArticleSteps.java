package starter.stepdefinitions.WebAdmin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.WebAdmin.TagArticle.DeleteTagArticle;

public class DeleteTagArticleSteps {

    @Steps
    DeleteTagArticle deleteTagArticle;
    @Given("saya menetapkan Api Endpoint untuk menghapus tag artikel berdasarkan ID valid")
    public void menetapkanApiEndpointUntukMenghapusTagArtikelBerdasarkanID(){
        deleteTagArticle.menetapkanApiEndpointUntukMenghapusTagArtikelBerdasarkanID();
    }
    @When("saya mengirimkan request untuk menghapus tag artikel berdasarkan ID dengan menggunakan token")
    public void mengirimkanRequestUntukMenghapusTagArtikelBerdasarkanIdDenganMenggunakanToken(){
        deleteTagArticle.mengirimkanRequestUntukMenghapusTagArtikelBerdasarkanIdDenganMenggunakanToken();
    }
    @And("saya menerima pesan data berhasil dihapus")
    public void menerimaPesanDataBerhasilDihapus(){
        deleteTagArticle.menerimaPesanDataBerhasilDihapus();
    }
    @Given("saya menetapkan Api Endpoint untuk menghapus tag artikel tanpa menggunakan ID")
    public void menetapkanApiEndpointUntukMenghapusTagArtikelTanpaMenggunakanID(){
        deleteTagArticle.menetapkanApiEndpointUntukMenghapusTagArtikelTanpaMenggunakanID();
    }
    @When("saya mengirimkan request untuk menghapus tag artikel tanpa menggunakan ID")
    public void mengirimkanRequestUntukMenghapusTagArtikelTanpaMenggunakanID(){
        deleteTagArticle.mengirimkanRequestUntukMenghapusTagArtikelTanpaMenggunakanID();
    }
    @When("saya mengirimkan request untuk menghapus tag artikel berdasarkan ID yang valid namun tanpa menggunakan token")
    public void mengirimkanRequestUntukMenghapusTagArtikelBerdasarkanIdValidNamunTanpaMenggunakanToken(){
        deleteTagArticle.mengirimkanRequestUntukMenghapusTagArtikelBerdasarkanIdValidNamunTanpaMenggunakanToken();
    }
    @When("saya mengirimkan request untuk menghapus tag artikel menggunakan method GET")
    public void mengirmkanRequestUntukMenghapusTagArtikelMenggunakanMethodGET(){
        deleteTagArticle.mengirmkanRequestUntukMenghapusTagArtikelMenggunakanMethodGET();
    }
    @When("saya mengirimkan request untuk menghapus tag artikel menggunakan method POST")
    public void mengirimkanRequestUntukMenghapusTagArtikelMenggunakanMethodPOST(){
        deleteTagArticle.mengirimkanRequestUntukMenghapusTagArtikelMenggunakanMethodPOST();
    }
    @When("saya mengirimkan request untuk menghapus tag artikel menggunakan method PUT")
    public void mengirimkanRequestUntukMenghapusTagArtikelMenggunakanMethodPUT(){
        deleteTagArticle.mengirimkanRequestUntukMenghapusTagArtikelMenggunakanMethodPUT();
    }

    @When("saya mengirimkan request untuk menghapus tag artikel berdasarkan ID invalid dengan menggunakan token")
    public void sayaMengirimkanRequestUntukMenghapusTagArtikelBerdasarkanIDInvalidDenganMenggunakanToken() {
        deleteTagArticle.sayaMengirimkanRequestUntukMenghapusTagArtikelBerdasarkanIDInvalidDenganMenggunakanToken();
    }


    @Given("saya menetapkan Api Endpoint yang salah untuk menghapus tag artikel berdasarkan ID invalid")
    public void sayaMenetapkanApiEndpointYangSalahUntukMenghapusTagArtikelBerdasarkanIDInvalid() {
        deleteTagArticle.menetapkanApiEndpointYangSalahUntukmenghapusTagArtikelBerdasarkanIDInvalid();
    }
}
