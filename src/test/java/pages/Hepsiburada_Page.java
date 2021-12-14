package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class Hepsiburada_Page {

    public Hepsiburada_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "//div[@id='myAccount']")
    public WebElement ilkGirisDropDown;

    @FindBy (xpath = "//a[@id='register']")
    public WebElement uyeOlYazisi;

    @FindBy (xpath = "//input[@name='firstName']")
    public WebElement adTextBox;

    @FindBy(id = "txtSurname")
    public WebElement soyadTextBox;

    @FindBy(xpath = "//input[@id='txtEmail']")
    public WebElement emailTextBox;

    @FindBy(id ="txtNewPassEmail")
    public  WebElement sifreTextBox;

    @FindBy(xpath = "(//div[@value='QAZ12345'])[2]")
    public WebElement gozSimgesi;

    @FindBy(name = "subscribeEmail")
    public WebElement rizaMetniKutusu;

    @FindBy(id = "btnSignUpSubmit")
    public WebElement uyeOlTextBox;

    @FindBy(xpath = "(//div[contains(text(),'Giriş yap')])[1]")
    public WebElement girisYapTextBox;

    @FindBy(xpath = "//input[@id='txtUserName']")
    public WebElement girisEmailTextBox;

    @FindBy(id = "btnLogin")
    public WebElement girisTextBox;

    @FindBy(xpath = "//input[@id='txtPassword']")
    public WebElement hosgeldinizSifre;

    @FindBy(id = "btnEmailSelect")
    public WebElement hosgeldinizGiris;

    @FindBy(xpath = "//span[contains(text(),'Aysel Gül')]")
    public WebElement kayitlisim;

    @FindBy(xpath = "//div[@class='desktopOldAutosuggestTheme-container']//input[1]")
    public WebElement aramaKutusu;

    @FindBy(xpath ="//div[text()='ARA']")
    public WebElement ARA;

    @FindBy(xpath = "//li[@id='i0']")
    public WebElement ilkUrun;

   // @FindBy(xpath = "//*[text()='Turbox Tx476 Pentium G2020 4GB Ram 500GB HDD 20\" Monitör Masaüstü Ofis Bilgisayarı']")
   @FindBy(xpath = "//*[text()='HP 250 Intel Core i3 1115G4 4GB 256GB SSD Windows 10 Home 15.6\" Taşınabilir Bilgisayar 34N69ES']")
   //@FindBy(xpath = "//*[text()='Dell XPS 9305 Intel Core i7 1165G7 16GB 512GB SSD Windows 10 Pro 13.3\" FHD Taşınabilir Bilgisayar FS1165WP165N']")
    public  WebElement secilenIlkUrun;

    @FindBy(className = "optionsLength")
    public WebElement TumSaticilar;

    @FindBy(xpath = "(//button[@class='add-to-basket button'])[1]")
    public WebElement sepeteEkle1;


    @FindBy(xpath = "(//button[@class='add-to-basket button'])[2]")
    public WebElement sepeteEkle2;

    @FindBy(xpath = "//a[@class='checkoutui-Modal-2iZXl']")
    public WebElement allertOnarimPaketi;

    @FindBy(className = "checkoutui-Modal-2iZXl")
    public WebElement sepeteEkleCarpikonu;

    @FindBy(xpath = "//*[text()='Sepete git']")
    public WebElement sepeteGit;

    @FindBy(xpath ="(//div[@class='product_name_3Lh3t'])[1]")
    public WebElement sepettekIlkUrun;

   @FindBy(className = "delete_all_2uTds")
    public WebElement secilenleriSil;

   @FindBy(className = "red_3m-Kl")
    public WebElement silButonu;

}
