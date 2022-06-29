package demo;

import static io.restassured.RestAssured.*;

import com.fasterxml.jackson.databind.JsonNode;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dunzo {

    @Test
    public void testApi()
    {
        Response result=get("https://api.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=e222ff63ac0e5dafeba57cbf524f952c");
        Assert.assertEquals(result.getStatusCode(),200,"assert on status code");
        String response=result.getBody().asString();
        System.out.println(response);
        JSONObject jsonObject=new JSONObject(response);
        System.out.println(jsonObject);
        Assert.assertEquals(jsonObject.get("base"),"stations");
        JSONObject jsonObject1= jsonObject.getJSONObject("coord");
        System.out.println(jsonObject1);
        Assert.assertEquals(jsonObject1.get("lon"),139);
        JSONArray jsonArray=  jsonObject.getJSONArray("weather");
        System.out.println(jsonArray);
        JSONObject jsonObject2=jsonArray.getJSONObject(0);
        System.out.println(jsonObject2);
        Assert.assertEquals(jsonObject2.get("id"),500);
    }
}
