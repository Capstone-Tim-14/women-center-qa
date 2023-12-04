package starter.stepdefinitions.WebAdmin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.json.JSONObject;
import starter.WebAdmin.Conselor_Auth;

public class ConselorAuthSteps {
    @Steps
    Conselor_Auth conselor_auth;

    @Given("saya menetapkan API endpoint untuk login konselor")
    public void menetapkanApiEndpointUntukLoginKonselor(){
        conselor_auth.menetapkanApiEndpointUntukloginKonselor();
    }
    @Given("saya menetapkan API endpoint yang salah untuk login konselor")
    public void menetapkanApiEndpointYangSalahUntukLoginKonselor(){
        conselor_auth.menetapkanApiEndpointYangSalahUntukLoginKonselor();
    }
    @When("saya mengirimkan request login konselor dengan memasukan email dan password valid")
    public void mengirimkanRequestLoginKonselorDenganMemasukanEmailDanPasswordValid() {
        conselor_auth.mengirimkanRequestLoginKonselorDenganMemasukanEmailDanPasswordValid("agung123@gmail.com","agung123");
    }
    @When("saya mengirimkan request login konselor dengan memasukan email dan password invalid")
    public void mengirimkanRequestLoginkonselorDenganMemasukanEmailDanPasswordInvalid(){
        conselor_auth.mengirimkanRequestLoginkonselorDenganMemasukanEmailDanPasswordInvalid();
    }
    @When("saya mengirimkan request login konselor dengan memasukan email valid namun password invalid")
    public void mengirimkanRequestLoginkonselorDenganMemasukanEmailValidNamunPasswordInvalid(){
        conselor_auth.mengirimkanRequestLoginkonselorDenganMemasukanEmailValidNamunPasswordInvalid();
    }
    @When("saya mengirimkan request login konselor dengan memasukan email namun mengosongkan password")
    public void mengirimkanRequestLoginKonselorDenganMemasukanEmailNamunMengosongkanPassword(){
        conselor_auth.mengirimkanRequestLoginKonselorDenganMemasukanEmailNamunMengosongkanPassword();
    }
    @When("saya mengirimkan request login konselor dengan method GET dan memasukan data valid")
    public void mengirimkanRequestLoginKonselorDenganMethodGetDanMemasukanDataValid(){
        conselor_auth.mengirimkanRequestLoginKonselorDenganMethodGetDanMemasukanDataValid();
    }
    @When("saya mengirimkan request login konselor dengan method PUT dan memasukan data valid")
    public void mengirimkanRequestLoginKonselorDenganMethodPutDanMemasukanDataValid(){
        conselor_auth.mengirimkanRequestLoginKonselorDenganMethodPutDanMemasukanDataValid();
    }
    @When("saya mengirimkan request login konselor dengan method DELETE dan memasukan data valid")
    public void mengirimkanRequestLoginKonselorDenganMethodDeletDanMemasukanDataValid(){
        conselor_auth.mengirimkanRequestLoginKonselorDenganMethodDeleteDanMemasukanDataValid();
    }
    @When("saya mengirimkan request login konselor ke endpoint yang salah dengan memasukan email dan password valid")
    public void mengirimkanRequestLoginKonselorKeEndpointYangSalahDenganMemasukanEmailDanPasswordValid(){
        conselor_auth.mengirimkanRequestLoginKonselorKeEndpointYangSalahDenganMemasukanEmailDanPasswordValid();
    }

    @When("saya mengirimkan request login konselordengan mengosongkan email dan password")
    public void sayaMengirimkanRequestLoginKonselordenganMengosongkanEmailDanPassword() {
        conselor_auth.mengirimaknRequestLoginKonselorDenganMengosongkanEmailDanPassword();
    }
}
