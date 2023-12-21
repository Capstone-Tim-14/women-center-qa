package starter.artikel;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
public class artikelAdmin extends PageObject {
    private By emailField(){return By.xpath("/html/body/div/div/div/div/div/form/div[1]/div/input");}
    private By passwordField(){return By.xpath("/html/body/div/div/div/div/div/form/div[2]/div/input");}
    private By button(){return By.xpath("/html/body/div/div/div/div/div/form/div[3]/button");}
    private By artikel(){return By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[5]/a");}
    private By buatartikel(){return By.xpath("/html/body/div[1]/div/div[2]/div[3]/a/button");}
    private By judul(){return By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[1]/div/div/div[1]/div/div[2]/input");}
    private By isiartikel(){return By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[1]/div/div/div[2]/div/div/div/div/div[2]/div[1]");}
    private By kategori1(){return By.xpath("/html/body/div[1]/div/div[2]/div[4]/div/div/button[1]");}
    private By uploadimage(){return By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div");}
    private By simpan(){return By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/button");}

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
    public void clickbuttonartikel(){
        $(artikel()).click();
    }
    @Step
    public void clickbuttonbuatartikel(){
        $(buatartikel()).click();
    }
    @Step
    public void inputjudul(String text){
        $(judul()).type(text);
    }
    @Step
    public void isiartikel(String text){
        $(isiartikel()).type(text);
    }
    @Step
    public void kategori(){
        $(kategori1()).click();
    }

    private void performDragAndDrop(By source, By target) {
        WebElement sourceElement = getDriver().findElement(source);
        WebElement targetElement = getDriver().findElement(target);

        Actions actions = new Actions(getDriver());
        actions.dragAndDrop(sourceElement, targetElement).build().perform();
    }

    private static void setClipboardData(String pathfile){
        StringSelection stringSelection = new StringSelection(pathfile);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    }
    @Step
    public void uploadimage(String imagePath1) {
        // Drag and drop Gambar 1
        waitABit(3000);
        By fileInputField1 = By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div");

        WebElement fileInput1 = find(fileInputField1);
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].style.display='block';", fileInput1);
        fileInput1.sendKeys(imagePath1);


        try {

            Robot robot = new Robot();
            robot.delay(1000);


            // Set clipboard data for Gambar 1
            performDragAndDrop(fileInputField1, uploadimage());
            setClipboardData(imagePath1);
            pasteAndEnter(robot);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to paste clipboard content and press Enter
    private void pasteAndEnter(Robot robot) {
        robot.delay(1000);

        // Paste clipboard content into the dialog
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.delay(1000);

        // Press Enter to confirm the file upload
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        waitABit(3000);
    }
    @Step
    public void publikasi(){
        $(simpan()).click();

    waitABit(2000);
    }
}
