package starter.stepdefinitions.MobileUser;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import org.json.JSONObject;
import starter.MobileUser.LoginUser;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class LoginUserSteps {
    @Steps
    LoginUser loginUser;
    @Given("saya menetapkan API endpoint untuk login user")
    public void menetapkanApiEndpointLoginSuperadmin(){
        loginUser.menetapkanApiEndpointLoginUser();
    }
    @When("saya mengirimkan request untuk melakukan login dengan memasukan email dan password valid")
    public void mengirimkanRequestDenganMemasukanEmailDanPasswordValid(){
        loginUser.mengirimkanRequestDenganMemasukanEmailDanPasswordValid();
    }
    @And("saya mendapatkan token login")
    public void mendapatkanDataDanToken(){
        loginUser.mendapatkanDataDanToken();
    }
    @When("saya mengirimkan request untuk melakukan login dengan memasukan email dan password invalid")
    public void mengirimkanRequestDenganMemasukanEmailDanPasswordInvalid(){
        loginUser.mengirimkanRequestDenganMemasukanEmailDanPasswordInvalid();
    }
    @When("saya mengirimkan request untuk melakukan login dengan memasukan email valid namun password invalid")
    public void mengirimkanRequestDenganMemasukanEmailValidNamunPasswordInvalid(){
        loginUser.mengirimkanRequestDenganMemasukanEmailValidNamunPasswordInvalid();
    }
    @When("saya mengirimkan request untuk melakukan login dengan memasukan email namun mengosongkan password")
    public void mengirimkanRequestDenganMemasukanEmailNamunMengosongkanPassword(){
        loginUser.mengirimkanRequestDenganMemasukanEmailNamunMengosongkanPassword();
    }
    @When("saya mengirimkan request untuk melakukan login dengan mengosongkan email dan password")
    public void mengirimkanRequestDenganMengosongkanEmailDanPassword(){
        loginUser.mengirimkanRequestDenganMengosongkanEmailDanPassword();
    }
    @When("saya mengirimkan request untuk melakukan login dengan method GET dan memasukan data valid")
    public void mengirimkanRequestDenganMethodGETDanMemasukanDataValid(){
        loginUser.mengirimkanRequestDenganMethodGETDanMemasukanDataValid();
    }
    @When("saya mengirimkan request untuk melakukan login dengan method PUT dan memasukan data valid")
    public void mengirimkanRequestDenganMethodPUTDanMemasukanDataValid(){
        loginUser.mengirimkanRequestDenganMethodPUTDanMemasukanDataValid();
    }
    @When("saya mengirimkan request untuk melakukan login dengan method DELETE dan memasukan data valid")
    public void mengirimkanRequestDenganMethodDeleteDanMemasukanDataValid(){
        loginUser.mengirimkanRequestDenganMethodDeleteDanMemasukanDataValid();
    }
    @Given("saya menetapkan API endpoint yang salah untuk login user")
    public void menetapkanApiEndpointYangSalahUntukLoginUser(){
        loginUser.menetapkanApiEndpointYangSalahUntukLoginUser();
    }
    @When("saya mengirimkan request untuk melakukan login ke endpoint yang salah dengan memasukan email dan password valid")
    public void mengirimkanRequestDenganEndpointSalahDanMemasukanEmailDanPasswordValid(){
        loginUser.mengirimkanRequestDenganEndpointSalahDanMemasukanEmailDanPasswordValid();
    }
}
