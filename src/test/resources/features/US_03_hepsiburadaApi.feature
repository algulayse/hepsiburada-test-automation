Feature:US_03_Meyve ve sebze satan bir işletmenin api servis testleri


  Scenario: TC_01 Kullanici get tipinde baglanip api verilerine ulasir
    Given Kullanici "apiUrl" adresine  get tipinde baglanip status kodunun 200 ve Content Type’in Json oldugunu dogrular

  Scenario: TC_02 Kullanici get tipinde baglanip apple verilerine ulasir
    Given Kullanici "apiUrl" adresine endPoint ile get tipinde baglanip Status Kodunun 200 ve Content Type’in Json oldugunu dogrular

  Scenario: TC_03 Kullanici get tipinde baglanip bad request cevabi alir
    Given Kullanici "apiUrl" adresine endPoint ile get tipinde baglanip Status Kodunun 400 ve Response body'sinin  "data": null  icerdigini dogrular

  Scenario: TC_04 Kullanici get tipinde baglanip Not Found cevabi alir
    Given Kullanici "wrongUrlApi" adresine  get tipinde baglanip status kodunun 404 ve Response body'sinin "Not Found" icerdigini dogrular

    #Post tipinde testler
  Scenario: TC_05 Kullanici post tipinde baglanip yeni bir data create eder
    Given Kullanici "postApiUrl" adresine post tipinde baglanip status kodunun 201 ve donen response body'i dogrular