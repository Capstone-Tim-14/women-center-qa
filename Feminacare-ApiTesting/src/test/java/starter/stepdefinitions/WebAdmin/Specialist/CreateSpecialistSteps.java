package starter.stepdefinitions.WebAdmin.Specialist;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.WebAdmin.Specialist.CreateSpecialist;
public class CreateSpecialistSteps {
    @Steps
    CreateSpecialist createSpecialist;
    @Given("saya menetapkan Api endpoint untuk membuat spesialis baru")
    public void menetapkanApiEndpointUntukMembuatSpesialisBaru() {
        createSpecialist.menetapkanApiEndpointUntukMembuatSpesialisBaru();
    }

    @When("saya mengirimkan request untuk membuat spesialis baru dengan menyisipkan data dan token")
    public void mengirimkanRequestUntukMembuatSpesialisBaruDenganMenyisipkanDataDanToken() {
        createSpecialist.mengirimkanRequestUntukMembuatSpesialisBaruDenganMenyisipkanDataDanToken();
    }
    @And("saya menerima pesan sukses membuat spesialis baru")
    public void menampilkanPesanSuksesMembuatSpesialis() {
        createSpecialist.menampilkanPesanSuksesMembuatSpesialis();
    }
    @When("saya mengirimkan request untuk membuat spesialis baru dengan mengisi sebagian data")
    public void mengirimkanRequestUntukMembuatSpesialisBaruDenganMengisiSebagianData() {
        createSpecialist.mengirimkanRequestUntukMembuatSpesialisBaruDenganMengisiSebagianData();
    }
    @When("saya mengirimkan request untuk membuat spesialis baru dengan mengosongkan data Spesialis")
    public void mengirimkanRequestUntukMembuatSpesialisBaruDenganMengosongkanDataRole(){
        createSpecialist.mengirimkanRequestUntukMembuatSpesialisBaruDenganMengosongkanDataRole();
    }
    @When("saya mengirimkan request untuk membuat spesialis baru tanpa menyisipkan token")
    public void mengirimkanRequestUntukmmebuatSpesialisBaruTanpaMenyisipkanToken(){
        createSpecialist.mengirimkanRequestUntukmmebuatSpesialisBaruTanpaMenyisipkanToken();
    }
    @Given("saya menetapkan Api endpoint yang salah untuk membuat spesialis baru")
    public void menetapkanApiEndpointYangSalahUntukMembuatSpesialisBaru(){
        createSpecialist.menetapkanApiEndpointYangSalahUntukMembuatSpesialisBaru();
    }
    @When("saya mengirimkan request untuk membuat spesialis baru dengan menggunakan Api endpoint yang salah")
    public void mengirimkanRequestUntukMembuatTagBaruDenganMenggunakanApiEndpointYangSalah(){
        createSpecialist.mengirimkanRequestUntukMembuatTagBaruDenganMenggunakanApiEndpointYangSalah();
    }
    @When("saya mengirimkan request untuk membuat spesialis baru dengan method PUT")
    public void mengirimkanRequestUntukMembuatSpesialisBaruDenganmethodPUT(){
        createSpecialist.mengirimkanRequestUntukMembuatSpesialisBaruDenganmethodPUT();
    }
    @When("saya mengirimkan request untuk membuat spesialis baru dengan method DELETE")
    public void mengirimkanRequestUntukMembuatSpesialisBaruDenganmethodDELETE(){
        createSpecialist.mengirimkanRequestUntukMembuatSpesialisBaruDenganmethodDELETE();
    }

    @When("saya mengirimkan request untuk menambahkan spesialis baru dengan method GET")
    public void sayaMengirimkanRequestUntukMenambahkanSpesialisBaruDenganMethodGET() {
        createSpecialist.sayaMengirimkanRequestUntukMenambahkanSpesialisBaruDenganMethodGET();
    }

    @When("saya mengirimkan request untuk membuat spesialis baru dengan menyisipkan data yang sudah tersimpan")
    public void sayaMengirimkanRequestUntukMembuatSpesialisBaruDenganMenyisipkanDataYangSudahTersimpan() {
        createSpecialist.mengirimkanRequestUntukMembuatSpesialisBaruNmaunmengisikanNamaDenganNamaYangSudahTersedia();
    }

    @When("saya mengirimkan request untuk membuat spesialis baru namun mengisikan nama dengan nama yang sudah tersedia")
    public void sayaMengirimkanRequestUntukMembuatSpesialisBaruNamunMengisikanNamaDenganNamaYangSudahTersedia() {
        createSpecialist.mengirimkanRequestUntukMembuatSpesialisBaruNmaunmengisikanNamaDenganNamaYangSudahTersedia();

    }
}
