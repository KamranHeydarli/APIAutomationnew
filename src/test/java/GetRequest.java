import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetRequest {

    @Test
    public void get01(){


        //1- request body ve andpoint hazirlamaq
        String url = "https://restful-booker.herokuapp.com/booking/458";
        //2- expected data hazirlamaq
        //3- request gonderib qayidan responseni yadda saxlamaq

        Response response = given().when().get(url);
        response.prettyPrint();

        //4- assertion



    }

}
