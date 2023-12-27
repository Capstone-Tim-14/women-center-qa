package starter.stepdefinitions.WebAdmin.Article;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.WebAdmin.Article.AddCategoryArticle;

public class AddCategoryArticleSteps {
    @Steps
    AddCategoryArticle addCategoryArticle;
    @Given("saya menetapkan Api endpoint untuk membuat kategori artikel baru")
    public void menetapkanApiEndpointUntukMembuatKategoriArticleBaru() {
        // Implementasi logika untuk menetapkan API endpoint
        addCategoryArticle.menetapkanApiEndpointUntukMembuatKategoriArticleBaru();
    }

    @Given("saya menetapkan Api endpoint untuk membuat kategori artikel baru dengan ID yang invalid")
    public void menetapkanApiEndpointUntukMembuatKategoriArticleBaruDenganIdYangInvalid() {
        // Implementasi logika untuk menetapkan API endpoint
        addCategoryArticle.menetapkanApiEndpointUntukMembuatKategoriArticleBaruDenganIdYangInvalid();
    }
    @When("saya mengirimkan request untuk membuat kategori artikel dengan mengosongkan field data")
    public void mengirimkanRequestDataKosong() {
        addCategoryArticle.mengirimkanRequestDataKosong();
    }
    @When("saya mengirimkan request untuk membuat kategori artikel tanpa menggunakan token")
    public void mengirimkanRequestTanpaToken() {
        addCategoryArticle.mengirimkanRequestTanpaToken();
    }
    @When("saya mengirimkan request untuk membuat kategori artikel baru dengan mengisikan data yang sudah tersimpan")
    public void mengirimkanRequestMenambahkanKategoriArtikelDenganDataDuplikat() {
        addCategoryArticle.mengirimkanRequestMenambahkanKategoriArtikelDenganDataDuplikat();
    }

    @When("saya mengirimkan request untuk membuat kategori artikel dengan mengisi data valid")
    public void sayaMengirimkanRequestUntukMembuatKategoriArtikelDenganMengisiDataValid() {
        addCategoryArticle.mengirimkanRequestMembuatKategoriDenganDataValid();
    }

    @And("saya menerima pesan kategori artikel berhasil ditambahkan")
    public void sayaMenerimaPesanKategoriArtikelBerhasilDitambahkan() {
    }

    @When("saya mengirimkan request untuk membuat kategori artikel dengan ID yang invalid")
    public void sayaMengirimkanRequestUntukMembuatKategoriArtikelDenganIDYangInvalid() {
        addCategoryArticle.mengirimkanRequestMembuatKategoriDenganIdInvalid();
    }
}
