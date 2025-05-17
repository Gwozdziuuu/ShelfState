package com.mrngwozdz.shelfstate.integrations.actuator;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import com.mrngwozdz.shelfstate.utils.AbstractIntegrationTest;

import static io.restassured.RestAssured.when;

class HealthCheckTest extends AbstractIntegrationTest {

    @Test
    void testStartup() {
        when().
                get("/actuator/health").
                then().
                assertThat().
                statusCode(HttpStatus.OK.value());
    }

}