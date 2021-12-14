package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.Hepsiburada_Page;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.Objects;
import java.util.Set;

public class US_01_UI_StepDefinition {

    Hepsiburada_Page page = new Hepsiburada_Page();

    @Given("Kullanici url adresine gider")
    public void kullaniciUrlAdresineGider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("urlHepsiburada"));
    }


    @Given("Kullanici giris yap butonuna tiklar")
    public void kullanici_giris_yap_butonuna_tiklar() {
        page.ilkGirisDropDown.click();
    }

    @And("Kullanici  sayfadaki uye ol yazisina tiklar")
    public void kullaniciSayfadakiUyeOlYazisinaTiklar() {
        page.uyeOlYazisi.click();
    }


    @Given("Kullanici Ad textboxina {string} girer")
    public void kullanici_ad_textboxina_girer(String Ad) {
        page.adTextBox.sendKeys(ConfigurationReader.getProperty("us_01_ad"));

    }

    @Given("Kullanici Soyad textboxina {string} girer")
    public void kullanici_soyad_textboxina_girer(String Soyad) {
        page.soyadTextBox.sendKeys(ConfigurationReader.getProperty("us_01_soyad"));

    }

    @Given("Kullanici E-posta adresi textboxina gecerli bir {string} girer")
    public void kullanici_e_posta_adresi_textboxina_gecerli_bir_girer(String eposta) {
        page.emailTextBox.sendKeys(ConfigurationReader.getProperty("us_01_e-posta"));
    }

    @Given("Kullanici Sifre textBoxina belirtilen kriterlere uygun gecerli bir {string} girer")
    public void kullanici_sifre_text_boxina_belirtilen_kriterlere_uygun_gecerli_bir_girer(String sifre) {
        page.sifreTextBox.sendKeys(ConfigurationReader.getProperty("us_01_sifre"));

    }

    @Given("Kullanici sifre bilgisini gormek icin goz simgesinin uzerine tiklar")
    public void kullanici_sifre_bilgisini_gormek_icin_goz_simgesinin_uzerine_tiklar() {

        page.gozSimgesi.click();
    }

    @Given("Kullanici Riza Metni checkboxina tiklar")
    public void kullanici_riza_metni_checkboxina_tiklar() {
        page.rizaMetniKutusu.click();
    }

    @Given("Kullanici Uye ol butonuna tiklar")
    public void kullanici_uye_ol_butonuna_tiklar() {
        page.uyeOlTextBox.click();
    }

    @And("Kullanici acilan sayfada giris yap textBoxina tiklar")
    public void kullaniciAcilanSayfadaGirisYapTextBoxinaTiklar() {
        page.girisYapTextBox.click();
    }

    @And("Kullanici e-posta adresi veya telefon numarasi kutusuna kayitli e-posta adresini girer")
    public void kullaniciEPostaAdresiVeyaTelefonNumarasiKutusunaKayitliEPostaAdresiniGirer() {
        page.girisEmailTextBox.sendKeys(ConfigurationReader.getProperty("us_01_e-posta"));
    }

    @And("Kullanici giris textBoxina tiklar")
    public void kullaniciGirisTextBoxinaTiklar() {
        page.girisTextBox.click();
    }

    @And("Kullanici hosgeldiniz sayfasina kayitli sifre bilgisini girer")
    public void kullaniciHosgeldinizSayfasinaKayitliSifreBilgisiniGirer() {
        page.hosgeldinizSifre.sendKeys(ConfigurationReader.getProperty("us_01_sifre"));
    }

    @And("Kullanici hosgeldiniz sayfasinda giris kutusana tiklar")
    public void kullaniciHosgeldinizSayfasindaGirisKutusanaTiklar() {
        page.hosgeldinizGiris.click();
    }

    @Given("Anasayfada kullanici giris isleminin yapildigi dogrulanir")
    public void anasayfada_kullanici_giris_isleminin_yapildigi_dogrulanir() {
        Assert.assertEquals(ConfigurationReader.getProperty("kullanici_adi"), page.kayitlisim.getText());
    }

    @Given("Kullanici satin almak istedigi {string} un bilgisini arama kutusuna yazar")
    public void kullanici_satin_almak_istedigi_un_bilgisini_arama_kutusuna_yazar(String urun) {
        page.aramaKutusu.sendKeys(ConfigurationReader.getProperty("us_01_urun"));
    }

    @Given("Kullanici {string} butonuna tiklar")
    public void kullanici_butonuna_tiklar(String ARA) {
        page.ARA.click();
    }

    @Given("Kullanici  arama sonucunda ekrana gelen urun listesinden ilk urunu secer")
    public void kullanici_arama_sonucunda_ekrana_gelen_urun_listesinden_ilk_urunu_secer() {
        BrowserUtils.waitFor(3);
        page.ilkUrun.click();
        String ilkSayfaWindowHandle = Driver.getDriver().getWindowHandle();
        System.out.println(ilkSayfaWindowHandle);
        Set<String> tumHandleKumesi = Driver.getDriver().getWindowHandles();
        System.out.println(tumHandleKumesi);
        String ikincisayfaWindowHandle = "";

        for (String w : tumHandleKumesi
        ) {
            if (!w.equals(ilkSayfaWindowHandle)) {
                ikincisayfaWindowHandle = w;
            }
        }
        Driver.getDriver().switchTo().window(ikincisayfaWindowHandle);
    }

    @Given("Kullanici secilen urun icin Diger Saticilar kismindan {string} nu secer")
    public void kullanici_secilen_urun_icin_diger_saticilar_kismindan_nu_secer(String string) throws InterruptedException {


        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        // executor.executeScript("window.scrollBy(0,1000)");
        //executor.executeScript("document.querySelector('.optionsLength').scrollIntoView({behavior: 'smooth'});");
        executor.executeScript("arguments[0].click();", page.TumSaticilar);


    }

    @Given("Kullanici secilen urun icin iki tane farkli saticidan urun secip sepete ekler")
    public void kullanici_secilen_urun_icin_iki_tane_farkli_saticidan_urun_secip_sepete_ekler() {

        BrowserUtils.waitFor(6);
        page.sepeteEkle1.click();

        if (Objects.nonNull(page.allertOnarimPaketi)) {
            page.allertOnarimPaketi.click();
        }
        BrowserUtils.waitFor(6);

        page.sepeteEkleCarpikonu.click();
        if (Objects.nonNull(page.TumSaticilar)) {
            page.allertOnarimPaketi.click();
            page.sepeteEkle2.click();
        }
        BrowserUtils.waitFor(6);

        if (Objects.nonNull(page.allertOnarimPaketi)) {
            page.allertOnarimPaketi.click();
        }
        BrowserUtils.waitFor(6);
        page.sepeteGit.click();

    }

    @Given("Secilen urunun dogru olarak eklendigi {string} sayfasinda dogrulanmalidir.")
    public void secilen_urunun_dogru_olarak_eklendigi_sayfasinda_dogrulanmalidir(String sepetim) {

        String secilenIlkUrun = page.secilenIlkUrun.getText();
        System.out.println("1.URUN:   " + secilenIlkUrun);

        String sepettekIlkUrun = page.sepettekIlkUrun.getText();
        System.out.println("2.URUN:   " + sepettekIlkUrun);

        Assert.assertEquals(secilenIlkUrun, sepettekIlkUrun);

        page.secilenleriSil.click();
        page.silButonu.click();


    }


    @And("Kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }


}
