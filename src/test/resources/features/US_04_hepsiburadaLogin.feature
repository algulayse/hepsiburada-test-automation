Feature:US_04_hepsiburada.com sitesinin login caseleri

  Background:
    Given Kullanici "hepsiburada.com" adresine gider
    Given Kullanici Giris Yap DropDowna tiklar

  Scenario:  TC_01 Kullanici hepsiburada.com sitesinin login sayfasina uye olarak ana sayfaya gider

    #Kullanici Ad bilgisini configuration.properties dosyasindan alir
    #Kullanici Soyad bilgisini configuration.properties dosyasindan alir
    #Kullanici E-posta bilgisini configuration.properties dosyasindan alir
    #Kullanici Şifre bilgisini configuration.properties dosyasindan alir

    And   Kullanici uye ol yazisina tiklar
    And   Kullanici Ad textboxina isim girer
    And   Kullanici Soyad textboxina soyisim girer
    And   Kullanici E-posta adresi textboxina gecerli bir e-mail girer
    And   Kullanici girdigi sifreyi gormek icin goz resminin üzerine tiklar
    And   Kullanici Şifre textBoxina belirtilen kriterlere uygun gecerli bir sifre girer
    And   Kullanici Rıza Metni checkboxina tiklar
    Then  Kullanici Uye ol butonuna tiklar
    Then  Kullanici anasyfada oldugunu dogrular

  Scenario: TC_02 Kullanici uye oldugu login sayfasina giris yaparak anasayfaya gider

    And   Kullanici Giris Yap yazisinin üzerine tiklar
    And   Kullanici hepsiburada sayfasinda kayıtlı oldugu e-posta adresini girer
    Then  Kullanici Giris yap butonuna tiklar
    And   Kullanici Hos geldiniz sayfasında Sifre textboxina e-postaya ait gecerli sifre bilgisi girer
   # And   Kullanici sifre bilgisini goz simgesinin uzerine tiklayarak dogrular
    Then  Kullanici Giris yap butonuna tiklar
    Then  Kullanici anasayfada oldugunu dogrular


  Scenario: TC_03 Kullanici uye oldugu login sayfasina  aynı bilgilerle tekrar üye olmaya çalışır
    And   Kullanici uye ol yazisina tiklar
    And   Kullanici Ad textboxina isim girer
    And   Kullanici Soyad textboxina soyisim girer
    And   Kullanici E-posta adresi textboxina gecerli bir e-mail girer
    And   Kullanici girdigi sifreyi gormek icin goz resminin üzerine tiklar
    And   Kullanici Şifre textBoxina belirtilen kriterlere uygun gecerli bir sifre girer
    And   Kullanici Rıza Metni checkboxina tiklar
    Then  Kullanici Uye ol butonuna tiklar
    #Hepsi burada sayfası acılır
    #Bu e-posta adresine ait bir hesabınız olduğunu fark ettik.Mesajı alınır.
    # Bu yüzden tekrar giris yap butonuna tıklar
    And Giris yap kutusuna tıkalnır
    And Kullanici hepsiburada sayfasinda kayıtlı oldugu e-posta adresini girer
    And Kullanici Giris yap kutusuna tiklar
    And Kullanıcı Hos geldiniz sayfasına kayıtlı sifre bilgini girer
    And Kullanici giris yap butonuna tiklar
    Then Kullanici anasayfada oldugunu dogrular

  Scenario: TC_04_Kullanici telefon bilgisi ile giris yapar
    And   Kullanici Giris Yap yazisinin üzerine tiklar
    And   Kullanici hepsiburada sayfasinda kayitli oldugu telefon bilgisini girer
    Then  Kullanici Giris yap butonuna tiklar
    Then  Kullanici telefonuna gelen dogrulama mesajini girer
    Then  Kullanici hosgeldiniz sayfasina kayitli sifre bilgisini girer
    And   Kullanici giris yap butonuna tiklar
    Then  Kullanici anasayfada oldugunu dogrular

    #Negative Senaryolar
    Scenario: TC_05_Kullanici gecersiz e-posta ile giris yapmaya calisir
      And   Kullanici Giris Yap yazisinin üzerine tiklar
      And   Kullanici hepsiburada sayfasinda kayıtlı oldugu e-posta adresini girer
      And   Kullanici "E-posta adresi eksik veya hatalı."mesajini alir

   Scenario:TC_06_Kullanici gecersiz sifre ile giris yapmaya calisir
     And   Kullanici Giris Yap yazisinin üzerine tiklar
     And   Kullanici hepsiburada sayfasinda kayıtlı oldugu e-posta adresini girer
     And   Kullanici Giris yap butonuna tiklar
     And   Kullanici Hos geldiniz sayfasında Sifre textboxina gecersiz sifre bilgisi girer
     Then  Kullanici "Girdiğiniz şifre eksik veya hatalı." mesajini alir



