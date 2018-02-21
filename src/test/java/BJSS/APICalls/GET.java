package BJSS.APICalls;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.get;
import static org.junit.Assert.assertTrue;

public class GET {

Response r;
    @Test
    public void firstcall(){

        r = get("https://reqres.in/api/users?page=2");

        System.out.println(r.body().jsonPath().get().toString());
        System.out.println(r.body().jsonPath().getList("data.last_name").get(0).toString());

        String[] dt = r.body().jsonPath().get("data").toString().split(",");
        assertTrue(r.body().jsonPath().getString("total").equals("12"));
        assertTrue(r.statusCode()==200);
        assertTrue(r.body().jsonPath().getList("data.last_name").get(0).equals("Holt"));
    }

}
