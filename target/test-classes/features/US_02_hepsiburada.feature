Feature: US_02_Kullanici girisi yapilmadan belirtilen ürünü sepete ekleme
  Scenario: TC_01_Kullanici girisi yapilmadan belirtilen urunu sepete ekleme
    Given Kullanici url adresine gider
    And Kullanici satin almak istedigi "urun" un bilgisini arama kutusuna yazar
    And Kullanici "ARA" butonuna tiklar
    And Kullanici  arama sonucunda ekrana gelen urun listesinden ilk urunu secer
    And Kullanici secilen urun icin Diger Saticilar kismindan "Tumu" nu secer
    And Kullanici secilen urun icin iki tane farkli saticidan urun secip sepete ekler
    And Secilen urunun dogru olarak eklendigi "Sepetim" sayfasinda dogrulanmalidir.
    Then Kullanici sayfayi kapatir