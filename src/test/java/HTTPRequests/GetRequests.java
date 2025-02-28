package HTTPRequests;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class GetRequests {
	
/*
 * given()
 * 		content-type, set-cookies, add auth, add param, set headers info etc.....
 * 
 * when()
 * 		get, post, put, patch, delete
 * 
 * then()
 * 		validate status code, extract response, extract headers cookies & response body etc....
 */
	
	@Test
	public void getUsers() {
		
		given()
		
		.when()
			.get("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(200)
			.body("page", equalTo(2))
			.log().all();
	}
	

}
