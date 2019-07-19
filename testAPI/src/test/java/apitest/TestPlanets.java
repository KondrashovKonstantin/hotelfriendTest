package apitest;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import org.junit.Test;
import org.junit.matchers.JUnitMatchers;


public class TestPlanets {


@Test
public void restAssuredTest() {
    RestAssured.given()
            .baseUri("https://swapi.co")
            .basePath("api/planets")
            .accept(ContentType.JSON)
            .when().get()
            .then()
            .body("results.findAll{it.climate ==\"murky\"}.terrain.",
                    JUnitMatchers.hasItems("swamp, jungles"),
                    "results.findAll{it.climate ==\"murky\"}.residents.",
                    JUnitMatchers.hasItems());
}

}
