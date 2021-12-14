package stepDefinitions;

import data.TestDataGrocery;
import io.cucumber.java.en.Given;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.junit.Assert;
import utilities.ConfigurationReader;

import static io.restassured.RestAssured.given;

public class US_03_API_StepDefinition {
    @Given("Kullanici {string} adresine  get tipinde baglanip status kodunun {int} ve Content Type’in Json oldugunu dogrular")
    public void kullaniciAdresineGetTipindeBaglanipStatusKodununVeContentTypeInJsonOldugunuDogrular(String arg0, int arg1) {


        Response response = given().
                accept("application/json").
                when().get(ConfigurationReader.getProperty("urlApi"));
        response.prettyPrint();

        response.then().
                assertThat().
                statusCode(200).
                contentType(ContentType.JSON);
    }

    @Given("Kullanici {string} adresine endPoint ile get tipinde baglanip Status Kodunun {int} ve Content Type’in Json oldugunu dogrular")
    public void kullaniciAdresineEndPointIleGetTipindeBaglanipStatusKodununVeContentTypeInJsonOldugunuDogrular(String arg0, int arg1) {
        Response response = given().
                accept("application/json").
                when().
                get(ConfigurationReader.getProperty("urlApi") + "/apple");
        response.prettyPrint();

        response.then().
                assertThat().
                statusCode(200).
                contentType(ContentType.JSON);
    }

    @Given("Kullanici {string} adresine endPoint ile get tipinde baglanip Status Kodunun {int} ve Response body'sinin  {string}: null  icerdigini dogrular")
    public void kullaniciAdresineEndPointIleGetTipindeBaglanipStatusKodununVeResponseBodySininNullIcerdiginiDogrular(String arg0, int arg1, String arg2) {

        Response response = given().
                accept("application/json").
                when().
                get(ConfigurationReader.getProperty("urlApi") + "/banana");
        response.prettyPrint();
        response.
                then().
                assertThat().
                statusCode(400);
        Assert.assertTrue(response.asString().contains("null"));

    }

    @Given("Kullanici {string} adresine  get tipinde baglanip status kodunun {int} ve Response body'sinin {string} icerdigini dogrular")
    public void kullaniciAdresineGetTipindeBaglanipStatusKodununVeResponseBodySininIcerdiginiDogrular(String arg0, int arg1, String arg2) {

        Response response = given().
                accept("application/json").
                when().
                get(ConfigurationReader.getProperty("wrongUrlApi"));
        response.prettyPrint();

        response.
                then().
                assertThat().
                statusCode(404);
        Assert.assertTrue(response.asString().contains("Not Found"));
    }

    @Given("Kullanici {string} adresine post tipinde baglanip status kodunun {int} ve donen response body'i dogrular")
    public void kullaniciAdresinePostTipindeBaglanipStatusKodununVeDonenResponseBodyIDogrular(String arg0, int arg1) {

        RequestSpecification requestSpecification;
        requestSpecification = new RequestSpecBuilder().
                setBaseUri(ConfigurationReader.getProperty("postApiUrl")).
                build();

        TestDataGrocery testData = new TestDataGrocery();
        JSONObject requestBody = testData.setUpTestData();
        System.out.println(requestBody);
        Response response = given().
                contentType(ContentType.JSON).
                spec(requestSpecification).
                body(requestBody.toString()).
                when().
                post();
        response.prettyPrint();
        System.out.println(response.getStatusCode());
        Assert.assertEquals(response.statusCode(), 201);
        Assert.assertEquals(requestBody.get("id"), 4);
        Assert.assertEquals(requestBody.get("name"), "string");
        Assert.assertEquals(requestBody.get("price"), 12);
        Assert.assertEquals(requestBody.get("stock"), 3);
    }

}
