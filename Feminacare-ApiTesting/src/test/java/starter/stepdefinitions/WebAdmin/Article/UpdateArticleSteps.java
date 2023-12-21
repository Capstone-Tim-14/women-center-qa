package starter.stepdefinitions.WebAdmin.Article;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.WebAdmin.Article.UpdateArticle;

public class UpdateArticleSteps {
        @Steps
        UpdateArticle updateArticle;
        @Given("saya menetapkan Api endpoint untuk mengupdate data artikel dengan ID valid")
        public void menetapkanApiEndpointUntukMengupdateDataArtikelDenganIdValid() {
            updateArticle.menetapkanApiEndpointUntukMengupdateDataArtikelDenganIdValid();
        }

        @When("saya mengirimkan request untuk mengupdate data artikel dengan mengirimkan data lengkap seluruh field menggunakan method Put")
        public void mengirimkanRequestUntukmengupdateDataArtikelDenganMengirimkanDataLengkapSeluruhFieldMenggunakanMethodPut() {
            updateArticle.mengirimkanRequestUntukmengupdateDataArtikelDenganMengirimkanDataLengkapSeluruhFieldMenggunakanMethodPut();
        }

        @When("saya mengirimkan request untuk mengupdate data artikel dengan mengirimkan data beberapa field menggunakan method Put")
        public void mengirimkanRequestUntukmengupdateDataArtikelDenganMengirimkanDataLengkapBeberapaField() {
            updateArticle.mengirimkanRequestUntukmengupdateDataArtikelDenganMengirimkanDataLengkapBeberapaField();
        }

        @When("saya mengirimkan request untuk mengupdate data artikel dengan mengosongkan data")
        public void mengirimkanRequestUntukmengupdateDataArtikelDenganMengsongkanData() {
            updateArticle.mengirimkanRequestUntukmengupdateDataArtikelDenganMengsongkanData();
        }

        @Given("saya menetapkan Api endpoint untuk mengupdate data artikel dengan ID invalid")
        public void menetapkanApiEndpointUntukMengupdateDataArtikelDenganIdInvalid() {
            updateArticle.menetapkanApiEndpointUntukMengupdateDataArtikelDenganIdInvalid();
        }

        @When("saya mengirimkan request untuk mengupdate data artikel dengan mengirimkan data lengkap seluruh field namun dengan ID invalid")
        public void mengirimkanRequestUntukmengupdateDataArtikelDenganMengirimkanDataLengkapSeluruhFieldNamunMenggunakanIdInvalid() {
            updateArticle.mengirimkanRequestUntukmengupdateDataArtikelDenganMengirimkanDataLengkapSeluruhFieldNamunMenggunakanIdInvalid();
        }

        @When("saya mengirimkan request untuk mengupdate data artikel dengan mengirimkan data lengkap seluruh field menggunakan menggunakan data yang sudah tersedia")
        public void mengirimkanRequestUntukmengupdateDataArtikelDenganMengirimkanDataLengkapSeluruhFieldMenggunakanDataYangSudahTersedia() {
            updateArticle.mengirimkanRequestUntukmengupdateDataArtikelDenganMengirimkanDataLengkapSeluruhFieldMenggunakanDataYangSudahTersedia();
        }

        @When("saya mengirimkan request untuk mengupdate data artikel dengan mengirimkan data lengkap seluruh field menggunakan method Get")
        public void mengirimkanRequestUntukmengupdateDataArtikelDenganMengirimkanDataLengkapSeluruhFieldMenggunakanMethodGet() {
            updateArticle.mengirimkanRequestUntukmengupdateDataArtikelDenganMengirimkanDataLengkapSeluruhFieldMenggunakanMethodGet();
        }

        @When("saya mengirimkan request untuk mengupdate data artikel dengan mengirimkan data lengkap seluruh field menggunakan method DELETE")
        public void mengirimkanRequestUntukmengupdateDataArtikelDenganMengirimkanDataLengkapSeluruhFieldMenggunakanMethodDelete() {
            updateArticle.mengirimkanRequestUntukmengupdateDataArtikelDenganMengirimkanDataLengkapSeluruhFieldMenggunakanMethodDelete();
        }

        @Given("saya menetapkan Api endpoint yang salah untuk mengupdate data artikel")
        public void menetapkanApiEndpointYangSalahUntukMengupdateDataArtikel() {
            updateArticle.menetapkanApiEndpointYangSalahUntukMengupdateDataArtikel();
        }

        @When("saya mengirimkan request untuk mengupdate data artikel dengan mengirimkan data lengkap seluruh field menggunakan endpoint yang salah")
        public void mengirimkanRequestUntukMengupdateDataArtikelDenganmenetapkanApiEndpointYangSalah() {
            updateArticle.mengirimkanRequestUntukMengupdateDataArtikelDenganmenetapkanApiEndpointYangSalah();
        }
        @And("saya menerima pesan data artikel berhasil diperbaharui")
        public void sayaMenerimaPesanDataArtikelBerhasilDiperbaharui () {
            updateArticle.sayaMenerimaPesanDataArtikelBerhasilDiperbaharui();
        }

        @When("saya mengirimkan request untuk mengupdate data artikel dengan mengirimkan data lengkap seluruh field menggunakan method Post")
        public void sayaMengirimkanRequestUntukMengupdateDataArtikelDenganMengirimkanDataLengkapSeluruhFieldMenggunakanMethodPost() {
            updateArticle.mengirimkanRequestUntukmengupdateDataArtikelDenganMengirimkanDataLengkapSeluruhFieldMenggunakanMethodPost();
        }

        @And("saya menerima pesan error artikel tidak ditemukan")
        public void sayaMenerimaPesanErrorArtikelTidakDitemukan() {
            updateArticle.sayaMenerimaPesanErrorArtikelTidakDitemukan();
        }
}
