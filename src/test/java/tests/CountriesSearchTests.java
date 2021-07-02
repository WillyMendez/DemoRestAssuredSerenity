package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.CountriesSearchSteps;

@RunWith(SerenityRunner.class)
public class CountriesSearchTests {
    @Steps
    CountriesSearchSteps countriesSearchSteps;

    @Test
    public void verifyThatWeCanFindUnitedStatesOfAmericaCountryUsingTheCodeUS() {
        countriesSearchSteps.searchCountryByCode("US");
        countriesSearchSteps.searchIsExecutedSuccesfully();
        countriesSearchSteps.iShouldFindCountry("United States of America");
    }

    @Test
    public void verifyThatWeCanFindIndiaCountryUsingTheCodeIN(){
        countriesSearchSteps.searchCountryByCode("IN");
        countriesSearchSteps.searchIsExecutedSuccesfully();
        countriesSearchSteps.iShouldFindCountry("India");
    }

    @Test
    public void verifyThatWeCanFindBrazilCountryUsingTheCodeBR(){
        countriesSearchSteps.searchCountryByCode("BR");
        countriesSearchSteps.searchIsExecutedSuccesfully();
        countriesSearchSteps.iShouldFindCountry("Brazil");
    }

    /*
    First version without steps (Serenity)
     */
    /*
    @Test
    public void verifyThatWeCanFindUnitedStatesOfAmericaUsingTheCodeUS(){
        RestAssured.
                when().get("http://groupkt.com/country/get/iso2code/US").
                then().assertThat().statusCode(200).
                and().body("RestResponse.result.name", is("United States of America"));
    }
    @Test
    public void verifyThatWeCanFindIndiaCountryUsingTheCodeIN(){
        RestAssured.
                when().get("http://groupkt.com/country/get/iso2code/IN").
                then().assertThat().statusCode(200).
                and().body("RestResponse.result.name", is("India"));
    }

    @Test
    public void verifyThatWeCanFindBrazilCountryUsingTheCodeBR(){
        RestAssured.
                when().get("http://groupkt.com/country/get/iso2code/BR").
                then().assertThat().statusCode(200).
                and().body("RestResponse.result.name", is("Brazil"));
    }*/
}
