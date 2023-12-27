package starter.MobileUser.Counseling;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.GenerateToken;

public class GetCounselingDetail {
    private String url ="https://api-ferminacare.tech/api/v1/admin";
    @Step("saya menetapkan API endpoint sebagai user untuk mendapatkan detail konseling dengan memasukan ID valid")
    public String menetapkanApiEndpointUntukmendapatkanDetailKonselingDenganMemasukanIdValid(){
        return url + "/counselors/counseling-session/5a5e1c9a-72f3-4c1a-ad13-108e74af3964";
    }
    @Step("saya mengirimkan request sebagai user untuk mendapatkan detail konseling dengan menggunakan token")
    public void mengirimkanRequestUntukMendapatkanDetailKonselingDenganMenggunakanToken(){
        String token = GenerateToken.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application")
                .header("Authorization", "Bearer " + token)
                .get((menetapkanApiEndpointUntukmendapatkanDetailKonselingDenganMemasukanIdValid()));
    }

    @Step("saya menetapkan API endpoint sebagai user untuk mendapatkan detail konseling dengan memasukan ID invalid")
    public String menetapkanApiEndpointUntukmendapatkanDetailKonselingDenganMemasukanIdInvalid(){
        return url + "/counselors/counseling-session/5a5e1c9a-72f3";
    }
    @Step("saya mengirimkan request sebagai user untuk mendapatkan detail konseling dengan memasukan ID invalid")
    public void mengirimkanRequestUntukMendapatkanDetailKonselingDenganMemasukanInvalidID(){
        String token = GenerateToken.generateTokenKonselor();
        SerenityRest.given()
                .header("Content-Type","application")
                .header("Authorization", "Bearer " + token)
                .get((menetapkanApiEndpointUntukmendapatkanDetailKonselingDenganMemasukanIdInvalid()));
    }

    @Step("saya mengirimkan request sebagai user untuk mendapatkan detail konseling tanpa menggunakan token")
    public void mengirimkanRequestUntukmendapatkanDetailKonselingTanpaMenggunakanToken(){
        SerenityRest.given()
                .header("Content-Type","application")
                .get((menetapkanApiEndpointUntukmendapatkanDetailKonselingDenganMemasukanIdValid()));
    }

    @Step("saya menetapkan API endpoint sebagai user untuk mendapatkan detail konseling tanpa memasukan ID")
    public String menetapkanApiEndpointUntukMendapatkanDetailKonselingTanpaMemasukanId(){
        return url+"/counselors/counseling-session";
    }
    @Step("saya mengirimkan request sebagai user untuk mendapatkan detail karir tanpa memasukan ID")
    public void mengrimkanRequestUtukMendapatkanDetailKonselingTanpaMemasukanID(){
        String token = GenerateToken.generateTokenKonselor();
        SerenityRest.given()
                .header("Content-Type","application")
                .header("Authorization", "Bearer " + token)
                .get((menetapkanApiEndpointUntukMendapatkanDetailKonselingTanpaMemasukanId()));
    }

    @Step("saya menetapkan API endpoint sebagai user yang salah untuk mendapatkan detail konseling")
    public String menetapkanApiEndpointYangSalahUntukmendapatkanDetailKonseling(){
        return url + "/Counselors/Counseling-session/5a5e1c9a-72f3-4c1a-ad13-108e74af3964";
    }
    @Step("saya mengirimkan request sebagai user untuk mendapatkan detail karir dengan API endpoint yang salah")
    public void mengirimkanRequestUntukmendapatkanDetailKonselingDenganApiEndpointSalah(){
        String token = GenerateToken.generateTokenKonselor();
        SerenityRest.given()
                .header("Content-Type","application")
                .header("Authorization", "Bearer " + token)
                .get((menetapkanApiEndpointYangSalahUntukmendapatkanDetailKonseling()));
    }
}
