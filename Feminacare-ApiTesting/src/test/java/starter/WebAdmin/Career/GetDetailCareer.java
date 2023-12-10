package starter.WebAdmin.Career;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.GenerateToken;

public class GetDetailCareer {
    private String url ="https://api-ferminacare.tech/api/v1/admin/career";
    @Step("saya menetapkan API endpoint untuk mendapatkan detail karir dengan memasukan ID valid")
    public String menetapkanApiEndpointUntukmendapatkanDetailKarirDenganMemasukanIdValid(){
        return url + "/2";
    }
    @Step("saya mengirimkan request untuk mendapatkan detail karir dengan menggunakan token")
    public void mengirimkanRequestUntukMendapatkanDetailKarirDenganMenggunakanToken(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application")
                .header("Authorization", "Bearer " + token)
                .get((menetapkanApiEndpointUntukmendapatkanDetailKarirDenganMemasukanIdValid()));
    }

    @Step("saya menetapkan API endpoint untuk mendapatkan detail karir dengan memasukan ID invalid")
    public String menetapkanApiEndpointUntukmendapatkanDetailKarirDenganMemasukanIdInvalid(){
        return url + "/1";
    }
    @Step("saya mengirimkan request untuk mendapatkan detail dengan memasukan ID invalid")
    public void mengirimkanRequestUntukMendapatkanDetailKarirDenganMemasukanInvalidID(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application")
                .header("Authorization", "Bearer " + token)
                .get((menetapkanApiEndpointUntukmendapatkanDetailKarirDenganMemasukanIdInvalid()));
    }

    @Step("saya mengirimkan request untuk mendapatkan detail karir tanpa menggunakan token")
    public void mengirimkanRequestUntukmendapatkanDetailKarirTanpaMenggunakanToken(){
        SerenityRest.given()
                .header("Content-Type","application")
                .get((menetapkanApiEndpointUntukmendapatkanDetailKarirDenganMemasukanIdValid()));
    }

    @Step("saya menetapkan API endpoint untuk mendapatkan detail karir tanpa memasukan ID")
    public String menetapkanApiEndpointUntukMendapatkanDetailKarirTanpaMemasukanId(){
        return url;
    }
    @Step("saya mengirimkan request untuk mendapatkan detail karir tanpa memasukan ID")
    public void mengrimkanRequestUtukMendapatkanDetailKarirTanpaMemasukanID(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application")
                .header("Authorization", "Bearer " + token)
                .get((menetapkanApiEndpointUntukMendapatkanDetailKarirTanpaMemasukanId()));
    }

    @Step("saya menetapkan API endpoint yang salah untuk mendapatkan detail karir")
    public String menetapkanApiEndpointYangSalahUntukmendapatkanDetailKarir(){
        return url + "s/2";
    }
    @Step("saya mengirimkan request untuk mendapatkan detail karir dengan API endpoint yang salah")
    public void mengirimkanRequestUntukmendapatkanDetailKarirDenganApiEndpointSalah(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application")
                .header("Authorization", "Bearer " + token)
                .get((menetapkanApiEndpointYangSalahUntukmendapatkanDetailKarir()));
    }


    @Step("saya mengirimkan request untuk mendapatkan detail karir dengan menggunakan method POST")
    public void mengirimkanRequestUntukMendapatkanDetailKarirDenganMethodPost(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application")
                .header("Authorization", "Bearer " + token)
                .post((menetapkanApiEndpointUntukmendapatkanDetailKarirDenganMemasukanIdValid()));
    }

    @Step("saya mengirimkan request untuk mendapatkan detail karir dengan menggunakan method PUT")
    public void mengirimkanRequestUntukmendapatkanDetailKarirDenganMenggunakanMethodPut(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application")
                .header("Authorization", "Bearer " + token)
                .put((menetapkanApiEndpointUntukmendapatkanDetailKarirDenganMemasukanIdValid()));
    }

    @Step("saya mengirimkan request untuk mendapatkan detail karir dengan menggunakan method DELETE")
    public void mengirimkanRequestUntukMendapatkanKarirDenganMenggunakanMethodDelete(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application")
                .header("Authorization", "Bearer " + token)
                .delete((menetapkanApiEndpointUntukmendapatkanDetailKarirDenganMemasukanIdValid()));
    }
}
