package demo;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {

    @BeforeMethod
    public void teat1()
    {
        int code=23;
        System.out.println("before method");
    }

    @Test()
    public void testPostRequest()
    {
        RequestSpecification requestSpecification= RestAssured.given();
        requestSpecification.header("Content-Type","application/json");
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("name","shyam1");
        jsonObject.put("job","SDET1");
        requestSpecification.body(jsonObject.toString());
        Response response=requestSpecification.post("https://reqres.in/api/users");
        Assert.assertEquals(response.getStatusCode(),201);
        String str=response.getBody().asString();
        System.out.println(str);
        JSONObject json = new JSONObject(str);
        Assert.assertEquals(json.get("name"),"shyam1");
        Assert.assertEquals(json.get("job"),"SDET1");
        System.out.println("TEST RUN SUCCESSFULLY);
        //JSONObject jsonObject1=JSONObject.
    }
}
