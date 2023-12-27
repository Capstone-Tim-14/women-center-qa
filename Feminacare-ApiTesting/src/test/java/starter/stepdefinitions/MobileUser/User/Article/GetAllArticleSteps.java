package starter.stepdefinitions.MobileUser.User.Article;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.MobileUser.User.Article.GetAllArticle;
public class GetAllArticleSteps {
    @Steps
    GetAllArticle getAllArticle;
    @Given("saya menetapkan API endpoint sebagai user untuk mendapatkan semua artikel")
    public void menetapkanApiEndpointUntukmendapatkanSemuaArtikel(){
        getAllArticle.menetapkanApiEndpointUntukmendapatkanSemuaArtikel();
    }
    @Given("saya menetapkan API endpoint sebagai user dengan sebuah ID untuk mendapatkan semua artikel")
    public void menetapkanApiEndpointDenganSebuahID(){

        getAllArticle.menetapkanApiEndpointDenganSebuahID();
    }
    @Given("saya menetapkan API endpoint sebagai user untuk mendapatkan semua artikel berdasarkan halaman")
    public void menetapkanApiEndpointUntukmendapatkanSemuaArtikelBerdasarkanHalaman(){
        getAllArticle.menetapkanApiEndpointUntukmendapatkanSemuaArtikelBerdasarkanHalaman();
    }
    @When("saya mengirimkan request sebagai useruntuk mendapatkan semua artikel dengan menggunakan token")
    public void mengirimkanRequestUntukMendapatkanSemuaArtikelDenganMenggunakanToken(){
        getAllArticle.mengirimkanRequestUntukMendapatkanSemuaArtikelDenganMenggunakanToken();
    }
    @When("saya mengirimkan request sebagai user untuk mendapatkan semua artikel berdasarkan halaman")
    public void mengirimkanRequestUntukMendapatkanSemuaArtikelBerdasarkanHalaman(){
        getAllArticle.mengirimkanRequestUntukMendapatkanSemuaArtikelBerdasarkanHalaman();
    }

    @When("saya mengirimkan request sebagai user untuk mendapatkan semua artikel tanpa menggunakan token")
    public void mengirimkanRequestUntukMendapatkanSemuaArtikelTanpaMenggunakanToken(){
        getAllArticle.mengirimkanRequestUntukMendapatkanSemuaArtikelTanpaMenggunakanToken();
    }
    @When("saya mengirimkan request sebagai user untuk mendapatkan semua artikel dengan menggunakan ID")
    public void mengirimkanRequestUntukMendapatkanSemuaArtikelDenganMenggunakanIdValid(){
        getAllArticle.mengirimkanRequestUntukMendapatkanSemuaArtikelDenganMenggunakanIdValid();
    }
}
