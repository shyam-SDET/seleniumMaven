package demo;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;

public class DemoApi {

    @Test
    public void testApi() {
//        Response result = get("http://localhost:3000/posts");
//        Assert.assertEquals(result.getStatusCode(), 200, "assert on status code");
//        String response = result.getBody().asString();
//        System.out.println(response);

        RequestSpecification requestSpecification= RestAssured.given();
        requestSpecification.header("Content-Type","application/json");
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("id","5");
        jsonObject.put("title","book1");
        jsonObject.put("auther","shyam1");
        requestSpecification.body(jsonObject.toString());

        Response response=requestSpecification.post("http://localhost:3000/posts");
        String str=response.getBody().asString();
        System.out.println(str);
        int code=response.getStatusCode();
        System.out.println(code);
        Assert.assertEquals(code,201);
    }
}
