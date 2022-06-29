//import static io.restassured.RestAssured.*;
//
//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.util.JSONPObject;
//import demo.DTORestAPI;
//import io.restassured.RestAssured;
//import io.restassured.path.json.JsonPath;
//import io.restassured.response.Response;
//import io.restassured.response.ResponseBody;
//import io.restassured.specification.RequestSpecification;
//import org.json.JSONArray;
//import org.json.JSONObject;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import static org.hamcrest.Matchers.*;
//
//public class RestApi {
//    DTORestAPI dtoRestAPI=new DTORestAPI();
//
//    @Test
//    public void testResponse()
//    {
//        Response result=RestAssured.get("https://api.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=e222ff63ac0e5dafeba57cbf524f952c");
//        Response res=get("https://api.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=e222ff63ac0e5dafeba57cbf524f952c");
//        int code=res.getStatusCode();
//        System.out.println("status code is "+code);
//        JSONObject jsonObject=new JSONObject(res.getBody().asString());
//        System.out.println("jsonObject is "+jsonObject);
//        JSONObject coord= (JSONObject) jsonObject.get("coord");
//        System.out.println("coord is"+coord);
//        System.out.println(coord.get("lon"));
//
//        JSONArray weather= (JSONArray) jsonObject.get("weather");
//        System.out.println("weather is"+weather.get(0));
//        JSONObject wether1= (JSONObject) weather.get(0);
//        System.out.println("id is "+wether1.get("id"));
//        System.out.println(weather);
//        ObjectMapper mapper = new ObjectMapper();
//       // dtoRestAPI=mapper.readValue((JsonNode)jsonObject,DTORestAPI.class);
//        String data=res.asString();
//        System.out.println("data is "+data);
//        Assert.assertEquals(code,200);
//        System.out.println("code is "+code);
//       // ObjectMapper mapper = new ObjectMapper();
//        //JsonNode jsonNode=mapper.readValue(res,JsonNode.class);
//        //res.getBody().toString().
//        System.out.println(expect().body("coord.lon", equalTo(139)).when().get("https://api.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=e222ff63ac0e5dafeba57cbf524f952c"));
//        //expect().body("lotto.winners.winnerId", hasItems(23, 54)).when().get("/lotto");
//
//
//
//
//        //base URI with Rest Assured class
//        RestAssured.baseURI = "https://api.openweathermap.org";
//
//        //input details
//        RequestSpecification h = RestAssured.given();
//
//        //get response
//        Response res1 = h.get("/data/2.5/weather?lat=35&lon=139&appid=e222ff63ac0e5dafeba57cbf524f952c");
//
//
//        //Response body
//        ResponseBody b = res1.getBody();
//        System.out.println("b is "+b);
//        //convert response body to string
//        String responseBody = b.asString();
//        //JSONPObject jsonpObject=new JSONPObject(res1.getBody());
//        System.out.println("body is"+responseBody);
//        //JSON Representation from Response Body
//        JsonPath jsnPath = res1.jsonPath();
//        System.out.println("path is "+jsnPath);
//        //Get value of Location Key
//        String s = jsnPath.get("base");
//        System.out.println("base is "+s);
////        System.out.println("Course name: " + s);
//        JSONPObject std = jsnPath.getJsonObject("coord");
//        System.out.println("Standard: " + std);
////        String m = jsnPath.get("coord.lon");
////        System.out.println("Marks: " + m);
//    }
//}
