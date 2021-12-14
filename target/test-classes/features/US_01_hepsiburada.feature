Feature:US_01_Kullanici girisi yapılarak sepete urun eklenmesi

    Scenario: TC_01_Kullanici hepsiburada sitesine kayit olarak giris yapar ve sepete urun ekler
      Given Kullanici url adresine gider
      Given Kullanici giris yap butonuna tiklar
      And   Kullanici  sayfadaki uye ol yazisina tiklar
      And   Kullanici Ad textboxina "isim" girer
      And   Kullanici Soyad textboxina "soyisim" girer
      And   Kullanici E-posta adresi textboxina gecerli bir "e-mail" girer
      And   Kullanici Sifre textBoxina belirtilen kriterlere uygun gecerli bir "sifre" girer
      And   Kullanici sifre bilgisini gormek icin goz simgesinin uzerine tiklar
      And   Kullanici Riza Metni checkboxina tiklar
      And   Kullanici Uye ol butonuna tiklar

      #Kullanici daha onceden uye oldugu icin giris yaparak alisverise devam eder
      And   Kullanici acilan sayfada giris yap textBoxina tiklar
      And   Kullanici e-posta adresi veya telefon numarasi kutusuna kayitli e-posta adresini girer
      And   Kullanici giris textBoxina tiklar
      And   Kullanici hosgeldiniz sayfasina kayitli sifre bilgisini girer
      And   Kullanici hosgeldiniz sayfasinda giris kutusana tiklar
      And   Anasayfada kullanici giris isleminin yapildigi dogrulanir
      And   Kullanici satin almak istedigi "urun" un bilgisini arama kutusuna yazar
      And   Kullanici "ARA" butonuna tiklar
      And   Kullanici  arama sonucunda ekrana gelen urun listesinden ilk urunu secer
      And   Kullanici secilen urun icin Diger Saticilar kismindan "Tumu" nu secer
      And   Kullanici secilen urun icin iki tane farkli saticidan urun secip sepete ekler
      And   Secilen urunun dogru olarak eklendigi "Sepetim" sayfasinda dogrulanmalidir.
      Then  Kullanici sayfayi kapatir





