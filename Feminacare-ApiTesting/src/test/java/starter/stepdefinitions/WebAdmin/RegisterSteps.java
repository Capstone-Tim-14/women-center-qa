package starter.stepdefinitions.WebAdmin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.WebAdmin.Register;

public class RegisterSteps{
    @Steps
    Register register;
        @Given("saya menetapkan API endpoint")
        public void menetapkanEndpointValid(){
            register.menetapkanEndpointValid();
        }
        @When("saya mengirimkan request dengan memasukan data yang lengkap dan valid")
        public void mengirimkanRequestDenganMemasukanDataLengkapDanValid(){
            register.mengirimkanRequestDenganMemasukanDataLengkapDanValid();
        }
        @Then("saya menerima status kode 201")
        public void menerimaStatusCode201(){
            register.menerimaStatusCode201();
        }
        @And("saya menerima data valid yang berhasil ditambahkan")
        public void menerimaDataRegistrasi(){
            register.menerimaDataRegistrasi();
        }
        @When("saya mengirimkan request dengan mengosongkan data")
        public void mengirimkanRequestDEnganBodyYangKosong(){
            register.mengirimkanRequestDEnganBodyYangKosong();
        }
        @Then("saya menerima status kode 422")
        public void menerimaStatusCode422(){
            register.menerimaStatusCode422();
        }

        @When("saya mengirimkan request dengan memasukan data yang tidak lengkap")
        public void mengirimkanRequestDataTidakLengkap(){
            register.mengirimkanRequestDataTidakLengkap();
        }
        @When("saya mengirimkan request dengan memasukan data yang sudah terdaftar")
        public void mengirimkanDataYangSudahTerdaftar(){
            register.mengirimkanDataYangSudahTerdaftar();
        }
        @Then("saya menerima status kode 409")
        public void menerimaStatusCode409(){
            register.menerimaStatusCode409();
        }
        @And("saya menerima pesan error email sudah terdaftar")
        public void menerimaPesanEmailSudahTerdaftar() {
            register.menerimaPesanEmailSudahTerdaftar();
        }
        @When("saya mengirimkan request dengan memasukan data yang lengkap dan valid namun memakai method get")
        public void mengirimkanRequestDenganMethodGet(){
            register.mengirimkanRequestDenganMethodGet();
        }
        @Then("saya menerima status kode 401")
        public void menerimaStatusCode401(){
            register.menerimaStatusCode401();
        }
        @Then("saya menerima status kode 404")
        public void menerimaStatusCode404(){
            register.menerimaStatusCode404();
        }
        @And("saya menerima pesan error")
        public void menerimapesanError(){
            register.menerimapesanError();
        }
        @When("saya mengirimkan request dengan memasukan data yang lengkap dan valid namun memakai method put")
        public void mengirimkanRequestDenganMethodPut(){
            register.mengirimkanRequestDenganMethodPut();
        }
        @Given("saya menetapkan API endpoint yang salah")
        public void endpointSalah(){
            register.endpointSalah();
        }

        @And("saya menerima pesan error data yang wajib diisi")
        public void sayaMenerimaPesanErrorDataYangWajibDiisi() {
            register.menerimaPesanErrorDataYangWajibDiisi();
        }

        @And("saya menerima pesan error unauthorized")
        public void sayaMenerimaPesanErrorUnauthorized() {
            register.menerimaPesanUnauthorized();
        }
}

