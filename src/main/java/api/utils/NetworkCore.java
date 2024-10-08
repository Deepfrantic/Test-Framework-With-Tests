package api.utils;

import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.builder.RequestSpecBuilder;
import org.json.JSONObject;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class NetworkCore {
    protected Response response;
    protected RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
    protected JSONObject responseBody;

    public void sendRequestAndGetResponse(Method method, int code) {
        response = given().spec(requestSpecBuilder.build()).log().uri().log().parameters()
                .when().request(method);
        response.then().log().body().assertThat().statusCode(code);
        try{
            responseBody = new JSONObject(response.getBody().asString());
        } catch (Exception e) {
            Assert.fail("Can't get response body");
        }
    }
}
