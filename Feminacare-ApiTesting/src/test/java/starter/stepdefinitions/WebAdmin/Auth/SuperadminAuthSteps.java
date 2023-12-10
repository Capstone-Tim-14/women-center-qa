package starter.stepdefinitions.WebAdmin.Auth;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.WebAdmin.Superadmin_Auth;


public class SuperadminAuthSteps {
    @Steps
    Superadmin_Auth superadmin_auth;
    @Given("saya menetapkan API endpoint untuk login superadmin")
    public void menetapkanApiEndpointLoginSuperadmin(){
        superadmin_auth.menetapkanApiEndpointLoginSuperadmin();
    }
    @When("saya mengirimkan request dengan memasukan email dan password valid")
    public void mengirimkanRequestDenganMemasukanEmailDanPasswordValid(){
        superadmin_auth.mengirimkanRequestDenganMemasukanEmailDanPasswordValid();
    }
    @Then("saya mendapatkan status kode 200")
    public void mendapatkanStatusKode200(){
        superadmin_auth.mendapatkanStatusKode200();
    }
    @And("saya mendapatkan data dan token")
    public void mendapatkanDataDanToken(){
        superadmin_auth.mendapatkanDataDanToken();
    }
    @When("saya mengirimkan request dengan memasukan email dan password invalid")
    public void mengirimkanRequestDenganMemasukanEmailDanPasswordInvalid(){
        superadmin_auth.mengirimkanRequestDenganMemasukanEmailDanPasswordInvalid();
    }
    @And("saya mendapatkan pesan error data tidak valid")
    public void mendapatkanPesanErrorDataTidakValid(){
        superadmin_auth.mendapatkanPesanErrorDataTidakValid();
    }
    @When("saya mengirimkan request dengan memasukan email valid namun password invalid")
    public void mengirimkanRequestDenganMemasukanEmailValidNamunPasswordInvalid(){
        superadmin_auth.mengirimkanRequestDenganMemasukanEmailValidNamunPasswordInvalid();
    }
    @When("saya mengirimkan request dengan memasukan email namun mengosongkan password")
    public void mengirimkanRequestDenganMemasukanEmailNamunMengosongkanPassword(){
        superadmin_auth.mengirimkanRequestDenganMemasukanEmailNamunMengosongkanPassword();
    }
    @When("saya mengirimkan request dengan mengosongkan email dan password")
    public void mengirimkanRequestDenganMengosongkanEmailDanPassword(){
        superadmin_auth.mengirimkanRequestDenganMengosongkanEmailDanPassword();
    }
    @When("saya mengirimkan request dengan method GET dan memasukan data valid")
    public void SayaMengirimkanRequestDenganMethodGETDanMemasukanDataValid() {
        superadmin_auth.mengirimkanRequestDenganMethodGETDanMemasukanDataValid();
    }
    @When("saya mengirimkan request dengan method PUT dan memasukan data valid")
    public void SayaMengirimkanRequestDenganMethodPutDanMemasukanDataValid() {
        superadmin_auth.mengirimkanRequestDenganMethodPUTDanMemasukanDataValid();
    }
    @When("saya mengirimkan request dengan method DELETE dan memasukan data valid")
    public void SayaMengirimkanRequestDenganMethodDeleteDanMemasukanDataValid() {
        superadmin_auth.mengirimkanRequestDenganMethodDeleteDanMemasukanDataValid();
    }
    @Given("saya menetapkan API endpoint yang salah untuk login superadmin")
    public void menetapkanApiEndpointYangSalahUntukLoginSuperadmin(){
        superadmin_auth.menetapkanApiEndpointYangSalahUntukLoginSuperadmin();
    }
    @When("saya mengirimkan request ke endpoint yang salah dengan memasukan email dan password valid")
    public void mengirimkanRequestDenganEndpointSalahDanMemasukanEmailDanPasswordValid(){
        superadmin_auth.mengirimkanRequestDenganEndpointSalahDanMemasukanEmailDanPasswordValid();
    }
}
