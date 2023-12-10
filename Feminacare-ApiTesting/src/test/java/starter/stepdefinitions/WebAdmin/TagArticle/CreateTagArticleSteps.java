package starter.stepdefinitions.WebAdmin.TagArticle;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.WebAdmin.TagArticle.CreateTagArticle;

public class CreateTagArticleSteps {
    @Steps
    CreateTagArticle createTagArticle;
    @Given("saya menetapkan Api endpoint untuk membuat tag baru")
    public void menetapkanApiEndpointUntukMembuatTagBaru() {
        createTagArticle.menetapkanApiEndpointUntukMembuatTagBaru();
    }

    @When("saya mengirimkan request untuk membuat tag baru dengan menyisipkan data dan token")
    public void mengirimkanRequestUntukMembuatTagBaruDenganMenyisipkanDataDanToken() {
        createTagArticle.mengirimkanRequestUntukMembuatTagBaruDenganMenyisipkanDataDanToken();
    }

    @When("saya mengirimkan request untuk membuat tag baru dengan mengisi sebagian data")
    public void mengirimkanRequestUntukMembuatTagBaruDenganMengisiSebagianData() {
        createTagArticle.mengirimkanRequestUntukMembuatTagBaruDenganMengisiSebagianData();
    }
    @When("saya mengirimkan request untuk membuat tag baru dengan mengosongkan data role")
    public void mengirimkanRequestUntukMembuatTagBaruDenganMengosongkanDataRole(){
        createTagArticle.mengirimkanRequestUntukMembuatTagBaruDenganMengosongkanDataRole();
    }
    @When("saya mengirimkan request untuk membuat tag baru tanpa menyisipkan dan token")
    public void sayaMengirimkanRequestUntukMembuatTagBaruTanpaMenyisipkanDanToken() {
        createTagArticle.mengirimkanRequestUntukmmebuatTagBaruTanpaMenyisipkanToken();
    }
    @When("saya mengirimkan request untuk membuat tag baru namun mengisikan nama dengan nama yang sudah tersedia")
    public void mengirimkanRequestUntukMembuatTagBaruNmaunmengisikanNamaDenganNamaYangSudahTersedia(){
        createTagArticle.mengirimkanRequestUntukMembuatTagBaruNmaunmengisikanNamaDenganNamaYangSudahTersedia();
    }
    @Given("saya menetapkan Api endpoint yang salah untuk membuat tag baru")
    public void menetapkanApiEndpointYangSalahUntukMembuatTagBaru(){
        createTagArticle.menetapkanApiEndpointYangSalahUntukMembuatTagBaru();
    }
    @When("saya mengirimkan request untuk membuat tag baru dengan menggunakan Api endpoint yang salah")
    public void mengirimkanRequestUntukMembuatTagBaruDenganMenggunakanApiEndpointYangSalah(){
        createTagArticle.mengirimkanRequestUntukMembuatTagBaruDenganMenggunakanApiEndpointYangSalah();
    }
    @When("saya mengirimkan request untuk menambahkan tag baru dengan method GET")
    public void sayaMengirimkanRequestUntukMenambahkanTagBaruDenganMethodGET() {
        createTagArticle.mengirimkanRequestUntukMembuatTagBaruDenganmethodGET();
    }
    @When("saya mengirimkan request untuk membuat tag baru dengan method PUT")
    public void mengirimkanRequestUntukMembuatTagBaruDenganmethodPUT(){
        createTagArticle.mengirimkanRequestUntukMembuatTagBaruDenganmethodPUT();
    }
    @When("saya mengirimkan request untuk membuat tag baru dengan method DELETE")
    public void mengirimkanRequestUntukMembuatTagBaruDenganmethodDELETE(){
        createTagArticle.mengirimkanRequestUntukMembuatTagBaruDenganmethodDELETE();
    }

    @And("menampilkan pesan sukses membuat kategori")
    public void menampilkanPesanSuksesMembuatKategori() {
        createTagArticle.menampilkanPesanSuksesMembuatKategori();
    }
}
