package HTTPRequests;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;

public class PostRequest {
	
	@Test
	public void createUser() {
		
		HashMap data = new HashMap();
		data.put("name", "Priyaranjan");
		data.put("job", "QA Automation");
		
		given()
			.contentType("application/json")
			.body(data)
		
		.when()
			.post("https://reqres.in/api/users")
		
		.then()
			.statusCode(201)
			.log().all();

		
	}
	
	
}
