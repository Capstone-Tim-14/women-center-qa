package starter.stepdefinitions.WebAdmin.Role;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.WebAdmin.Roles.CreateRole;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class CreateRoleSteps {


    @Steps
    CreateRole createRole;
    @Given("saya menetapkan Api endpoint untuk membuat role baru")
    public void menetapkanApiEndpointUntukMembuatRoleBaru(){
        createRole.menetapkanApiEndpointUntukMembuatRoleBaru();
    }

    @When("saya mengirimkan request untuk membuat role baru dengan menyisipkan data dan token")
    public void mengirimkanRequestUntukMembuatRoleBaruDenganMenyisipkanDataDanToken(){
        createRole.mengirimkanRequestUntukMembuatRoleBaruDenganMenyisipkanDataDanToken();
    }
    @Step("saya mengirimkan request untuk membuat role baru dengan menyisipkan data yang sudah tersimpan")
    public void mengirimkanRequestUntukMembuatRoleBaruDenganMenyisipkanDataYangSudahTersimpan() {
        createRole.mengirimkanRequestUntukMembuatRoleBaruDenganMenyisipkanDataYangSudahTersimpan();
    }

    @When("saya mengirimkan request untuk membuat role baru dengan mengosongkan data role")
    public void mengirimkanRequestUntukMmebuatRoleBaruDenganMengosongkanDataRole(){
        createRole.mengirimkanRequestUntukMembuatRoleBaruDenganMengosongkanDataRole();
    }
    @And("saya menerima data role yang berhasil ditambahkan")
    public void sayaMenerimaDataRoleYangBerhasilDitambahkan() {
        createRole.sayaMenerimaDataRoleYangBerhasilDitambahkan();
    }
    @Given("saya menetapkan Api endpoint yang salah untuk membuat role baru")
    public void menetapkanApiEndpointYangSalahUntukMembuatRoleBaru(){
        createRole.menetapkanApiEndpointYangSalahUntukMembuatRoleBaru();
    }
    @When("saya mengirimkan request untuk membuat role baru dengan menggunakan Api endpoint yang salah")
    public void mengirmkanRequestUntukMembuatRoleBaruDenganMenggunakanAPiEndpointYangSalah(){
        createRole.mengirmkanRequestUntukMembuatRoleBaruDenganMenggunakanAPiEndpointYangSalah();
    }

    @When("saya mengirimkan request untuk membuat role baru dengan method GET")
    public void mengirimkanRequestUntukMembuatRoleBaruDenganMethodGet(){
        createRole.mengirimkanRequestUntukMembuatRoleBaruDenganMethodGet();
    }
    @When("saya mengirimkan request untuk membuat role baru dengan method PUT")
    public void mengirimkanRequestUntukMembuatRoleBaruDenganMethodPut(){
        createRole.mengirimkanRequestUntukMembuatRoleBaruDenganMethodPut();
    }
    @When("saya mengirimkan request untuk membuat role baru dengan method DELETE")
    public void mengirimkanRequestUntukMembuatRoleBaruDenganMethodDelete(){
        createRole.mengirimkanRequestUntukMembuatRoleBaruDenganMethodDelete();
    }
    @When("saya mengirimkan request untuk membuat role baru tanpa menyisipkan dan token")
    public void sayaMengirimkanRequestUntukMembuatRoleBaruTanpaMenyisipkanDanToken() {
        createRole.sayaMengirimkanRequestUntukMembuatRoleBaruTanpaMenyisipkanDanToken();
    }
}
