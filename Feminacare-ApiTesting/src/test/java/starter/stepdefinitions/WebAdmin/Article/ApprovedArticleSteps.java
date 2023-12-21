package starter.stepdefinitions.WebAdmin.Article;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.WebAdmin.Article.ApprovedArticle;

public class ApprovedArticleSteps {
    @Steps
    ApprovedArticle approvedArticle;

    @Given("saya menetapkan Api endpoint untuk mengedit status artikel")
    public void menetapkanApiEndpointUntukMengeditStatusArtikel(){
        approvedArticle.menetapkanApiEndpointUntukMengeditStatusArtikel();
    }
    @When("saya mengirimkan request untuk mengedit status artikel dengan memasukan data valid")
    public void mengirimkanRequestUntukMengeditStatusArtikelDenganMemasukanDataValid(){
        approvedArticle.mengirimkanRequestUntukMengeditStatusArtikelDenganMemasukanDataValid();
    }

    @When("saya mengirimkan request untuk mengedit status artikel dengan memasukan data invalid")
    public void mengirmkanRequestUntukMengeditStatusArtikelDEnganMemasukanDataInvalid(){
        approvedArticle.mengirmkanRequestUntukMengeditStatusArtikelDEnganMemasukanDataInvalid();
    }

    @When("saya mengirimkan request untuk mengedit status artikel dengan mengosongkan data status")
    public void mengirimkanRequestUntukMengeditStatusArtikelDenganMengosongkanDataStatus(){
        approvedArticle.mengirimkanRequestUntukMengeditStatusArtikelDenganMengosongkanDataStatus();
    }
    @And("saya mendapatkan pesan status artikel berhasil diubah")
    public void mendapatkanPesanStatusArtikelBerhasilDiubah(){
        approvedArticle.mendapatkanPesanStatusArtikelBerhasilDiubah();
    }
}
