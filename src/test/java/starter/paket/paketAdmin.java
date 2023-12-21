package starter.paket;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import static java.awt.SystemColor.text;

public class paketAdmin extends PageObject {
    private By emailField(){return By.xpath("/html/body/div/div/div/div/div/form/div[1]/div/input");}
    private By passwordField(){return By.xpath("/html/body/div/div/div/div/div/form/div[2]/div/input");}
    private By button(){return By.xpath("/html/body/div/div/div/div/div/form/div[3]/button");}
    private By Paket(){return By.xpath(" /html/body/div[1]/div/div[1]/div[2]/div[3]/a");}
    private By Buatpaket(){return By.xpath("/html/body/div[1]/div/div[2]/div[3]/div/div[2]/div[1]/div[1]/div/button");}
    private By Namapaket(){return By.xpath("/html/body/div[4]/div/div/main/form/div[1]/div[1]/input");}
    private By Hargapaket(){return By.xpath("/html/body/div[4]/div/div/main/form/div[1]/div[2]/input[1]");}
    private By Hargadisplay(){return By.xpath("/html/body/div[4]/div/div/main/form/div[1]/div[2]/input[2]");}
    private By Tipepaket(){return By.xpath("/html/body/div[4]/div/div/main/form/div[1]/div[3]/div/div[1]/div[1]/input");}
    private By JumlahSesi(){return By.xpath("/html/body/div[4]/div/div/main/form/div[1]/div[4]/input[1]");}
    private By Durasi(){return By.xpath("/html/body/div[4]/div/div/main/form/div[1]/div[4]/input[2]");}
    private By Benefit1(){return By.xpath("/html/body/div[4]/div/div/main/form/div[2]/div/div[1]/div[1]/input");}
    private By Benefit2(){return By.xpath("/html/body/div[4]/div/div/main/form/div[2]/div/div[1]/div[2]/input");}
    private By Tambah(){return By.xpath("/html/body/div[4]/div/div/footer/div/button[2]");}
    private By Berhasil(){return By.xpath("/html/body/div[4]/div/div/footer/div/button[2]");}
    private By Ok(){return By.xpath("/html/body/div[4]/div/div/footer/div/div/div/button");}


    @Step
    public void openVite(){
        open();
    }
    @Step
    public void inputemail(String email){
        $(emailField()).type(email);
    }
    @Step
    public void inputpassword(String pass){
        $(passwordField()).type(pass);
    }
    @Step
    public void clickbuttonlogin(){
        $(button()).click();
    }
    @Step
    public void clickbuttonpaket(){
        $(Paket()).click();
    }
    @Step
    public void clickbuttonbuatpaket(){
        $(Buatpaket()).click();
    }
    @Step
    public void isinamapaket(String text){
        $(Namapaket()).type(text);
    }
    @Step
    public void isiharga(String text){
        $(Hargapaket()).type(text);
    }
    @Step
    public void isidisplay(String text){
        $(Hargadisplay()).type(text);
    }
    @Step
    public void tipepaket(){
        $(Tipepaket()).click();
    }
    @Step
    public void jumlahsesi(String text){
        $(JumlahSesi()).type(text);
    }
    @Step
    public void durasi(String text){
        $(Durasi()).type(text);
    }
    @Step
    public void benefit1(){
        $(Benefit1()).click();
    }
    @Step
    public void benefit2(){
        $(Benefit2()).click();
    }
    @Step
    public void tambah(){
        $(Tambah()).click();
    }
    @Step
    public void berhasil(){
        $(Berhasil());
    }
    @Step
    public void ok(){
        $(Ok()).click();
    }
    @Step
    public void kembali(){
        $(Paket());
    }
}
