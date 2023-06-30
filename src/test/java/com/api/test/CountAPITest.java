package com.api.test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.api.pojo.CreateJobPojo;

import com.utils.Role;
import com.utils.TestUtility;

import io.restassured.http.Header;
import io.restassured.http.Headers;


public class CountAPITest {
/*	
SMALL, INDEPENDENT, NO LOOPS, NO CONDITIONAL, AT LEAST ASSERTION	
*/
	private  Headers headers;
	
	@BeforeMethod (description = "Setting up the baseURI")
	public void setup() {
		baseURI = "http://139.59.91.96:9000/v1"; 
		
	
			Header header1 = new Header ("Content-Type", "application/json");
			Header header2 = new Header("Authorization", TestUtility.getAuthToken(Role.FD));
			 headers = new Headers(header1 , header2);
			
	}
	
	@Test(description = "verify if count job api can count job number", groups = {"e2e", "smoke",
			"sanity"}, priority = 1)
	public void test_create_api() {
				String message =  given().headers(headers).when()	
			 			.get("/dashboard/count/").then()
						.log().all().assertThat().statusCode(200).and()
							.extract()
							.body()
							.jsonPath().
							getString("message");
							Assert.assertEquals(message, "Success");
		
	}
}
