package starter.stepdefinitions.WebAdmin.Role;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.WebAdmin.Roles.GetAllRoles;

public class GetAllRolesSteps {
    @Steps
    GetAllRoles getAllRoles;
    @Given("saya menetapkan API endpoint untuk mendapatkan semua roles")
    public void menetapkanApiEndpointUntukmendapatkanSemuaRoles(){
        getAllRoles.menetapkanApiEndpointUntukmendapatkanSemuaRoles();
    }
    @Given("saya menetapkan API endpoint dengan sebuah ID")
    public void menetapkanApiEndpointDenganSebuahID(){
        getAllRoles.menetapkanApiEndpointDenganSebuahID();
    }
    @Given("saya menetapkan API endpoint yang salah untuk mendapatkan semua roles")
    public void menetapkanApiEndpointYangSalahUntukMendapatkanSemuaRoles(){
        getAllRoles.menetapkanApiEndpointYangSalahUntukMendapatkanSemuaRoles();
    }

    @When("saya mengirimkan request untuk mendapatkan semua roles dengan menggunakan token")
    public void mengirimkanRequestUntukMendapatkanSemuaRolesDenganMenggunakanToken(){
        getAllRoles.mengirimkanRequestUntukMendapatkanSemuaRolesDenganMenggunakanToken();
    }
    @And("saya menerima data roles")
    public void menerimaDataRoles(){
        getAllRoles.menerimaDataRoles();
    }
    @When("saya mengirimkan request untuk mendapatkan semua roles tanpa menggunakan token")
    public void mengirimkanRequestUntukMendapatkanSemuaRolesTanpaMenggunakanToken(){
        getAllRoles.mengirimkanRequestUntukMendapatkanSemuaRolesTanpaMenggunakanToken();
    }
    @When("saya mengirimkan request untuk mendapatkan semua roles dengan menggunakan sebuah ID")
    public void sayaMengirimkanRequestUntukMendapatkanSemuaRolesDenganMenggunakanSebuahID() {
        getAllRoles.mengirimkanRequestUntukMendapatkanSemuaRolesDenganMenggunakanIdValid();
    }

    @Then("saya mendapatkan status kode 404")
    public void mendapatkanStatusKode404(){
        getAllRoles.mendapatkanStatusKode404();
    }

    @And("saya menerima pesan error Not Found")
    public void menerimaPesanErrorNotFound(){
        getAllRoles.menerimaPesanErrorNotFound();
    }

    @When("saya mengirimkan request untuk mendapatkan semua roles dengan API endpoint yang salah")
    public void mengirimkanRequestUntukMendapatkanSemuaRolesDenganApEndpointYangSalah(){
        getAllRoles.mengirimkanRequestUntukMendapatkanSemuaRolesDenganApEndpointYangSalah();
    }

    @When("saya mengirimkan request untuk mendapatkan semua roles dengan menggunakan method POST")
    public void mengirimkanRequestUntukMendapatkanSemuaRolesDenganMenggunakanMethodPost(){
        getAllRoles.mengirimkanRequestUntukMendapatkanSemuaRolesDenganMenggunakanMethodPost();
    }
    @When("saya mengirimkan request untuk mendapatkan semua roles dengan menggunakan method PUT")
    public void mengirimkanRequestUntukMendapatkanSemuaRolesDenganMenggunakanMethodPut(){
        getAllRoles.mengirimkanRequestUntukMendapatkanSemuaRolesDenganMenggunakanMethodPut();
    }
    @When("saya mengirimkan request untuk mendapatkan semua roles dengan menggunakan method DELETE")
    public void mengirimkanRequestUntukMendapatkanSemuaRolesDenganMenggunakanMethodDelete(){
        getAllRoles.mengirimkanRequestUntukMendapatkanSemuaRolesDenganMenggunakanMethodDelete();
    }


}
