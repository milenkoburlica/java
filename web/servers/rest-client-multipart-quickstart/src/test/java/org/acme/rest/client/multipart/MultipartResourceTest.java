package org.acme.rest.client.multipart;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import io.restassured.config.LogConfig;
import io.restassured.filter.log.LogDetail;
/**
 * 
 * curl -X POST   http://localhost:8080/client/multipart
 * 
 * curl -X POST   http://localhost:8080/client/multipart -H "Content-Type: application/x-www-form-urlencoded; charset=ISO-8859-1"  -H "Accept: STERNNNN/*"  -H "Connection: Keep-Alive"
 */
@QuarkusTest
public class MultipartResourceTest {

    @BeforeEach
    public void setupRestAssuredLogging() {
        RestAssured.config = RestAssured.config().logConfig(LogConfig.logConfig().enableLoggingOfRequestAndResponseIfValidationFails(LogDetail.ALL));
    }

    @Test
    public void testMultipartDataIsSent() {
        given()
                .when().post("/client/multipart")
                .then()
                .statusCode(200)
                .body(containsString("Content-Disposition: form-data; name=\"file\""),
                        containsString("HELLO WORLD"),
                        containsString("Content-Disposition: form-data; name=\"fileName\""),
                        containsString("greeting.txt"));
    }

}
