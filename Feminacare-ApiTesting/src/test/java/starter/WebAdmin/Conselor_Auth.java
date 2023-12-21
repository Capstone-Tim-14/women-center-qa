package starter.WebAdmin;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

public class Conselor_Auth {
    private String url = "https://api-ferminacare.tech/api/v1";
    @Step("saya menetapkan API endpoint untuk login konselor")
    public String menetapkanApiEndpointUntukloginKonselor(){
        return url +"/auth";
    }
    @Step("saya menetapkan API endpoint yang salah untuk login konselor")
    public String menetapkanApiEndpointYangSalahUntukLoginKonselor(){
        return url + "/Auth";
    }
    @Step("saya mengirimkan request login konselor dengan memasukan email dan password valid")
    public void mengirimkanRequestLoginKonselorDenganMemasukanEmailDanPasswordValid(String email, String password){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email",email);
        requestBody.put("password",password);
        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .post(menetapkanApiEndpointUntukloginKonselor());
    }
    @Step("saya mengirimkan request login konselor dengan memasukan email dan password invalid")
    public void mengirimkanRequestLoginkonselorDenganMemasukanEmailDanPasswordInvalid(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email","bukancounselorB@gmail.com");
        requestBody.put("password","bukancounselorB123");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .post(menetapkanApiEndpointUntukloginKonselor());
    }
    @Step("saya mengirimkan request login konselor dengan memasukan email valid namun password invalid")
    public void mengirimkanRequestLoginkonselorDenganMemasukanEmailValidNamunPasswordInvalid(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email","counselorB@gmail.com");
        requestBody.put("password","bukancounselorB123");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .post(menetapkanApiEndpointUntukloginKonselor());
    }
    @Step("saya mengirimkan request login konselor dengan memasukan email namun mengosongkan password")
    public void mengirimkanRequestLoginKonselorDenganMemasukanEmailNamunMengosongkanPassword(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email","counselorB@gmail.com");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .post(menetapkanApiEndpointUntukloginKonselor());
    }
    @Step("saya mengirimkan request login konselor dengan mengosongkan email dan password")
    public void mengirimaknRequestLoginKonselorDenganMengosongkanEmailDanPassword(){
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .post(menetapkanApiEndpointUntukloginKonselor());
    }
    @Step("saya mengirimkan request login konselor dengan method GET dan memasukan data valid")
    public void mengirimkanRequestLoginKonselorDenganMethodGetDanMemasukanDataValid(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email","counselorB@gmail.com");
        requestBody.put("password","counselorB123");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .get(menetapkanApiEndpointUntukloginKonselor());
    }
    @Step("saya mengirimkan request login konselor dengan method PUT dan memasukan data valid")
    public void mengirimkanRequestLoginKonselorDenganMethodPutDanMemasukanDataValid(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email","counselorB@gmail.com");
        requestBody.put("password","counselorB123");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .put(menetapkanApiEndpointUntukloginKonselor());
    }
    @Step("saya mengirimkan request login konselor dengan method DELETE dan memasukan data valid")
    public void mengirimkanRequestLoginKonselorDenganMethodDeleteDanMemasukanDataValid(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email","counselorB@gmail.com");
        requestBody.put("password","counselorB123");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .delete(menetapkanApiEndpointUntukloginKonselor());
    }
    @Step("saya mengirimkan request login konselor ke endpoint yang salah dengan memasukan email dan password valid")
    public void mengirimkanRequestLoginKonselorKeEndpointYangSalahDenganMemasukanEmailDanPasswordValid(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email","counselorB@gmail.com");
        requestBody.put("password","counselorB123");
        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .post(menetapkanApiEndpointYangSalahUntukLoginKonselor());
    }
}
