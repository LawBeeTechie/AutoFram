package com.api.itestcontext;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.api.pojo.CreateJobPojo;

import com.utils.Role;
import com.utils.TestUtility;

import io.restassured.http.Header;
import io.restassured.http.Headers;


public class CreateJobAPITest {
/*	
SMALL, INDEPENDENT, NO LOOPS, NO CONDITIONAL, AT LEAST ASSERTION	
*/
	private String createJobRequestBody;
	
	
	@BeforeMethod (description = "Setting up the baseURI and the create POJO")
	public void setup() {
		baseURI = "http://139.59.91.96:9000/v1"; 
		createJobRequestBody = TestUtility.toJson(TestUtility.getCreateJobRequestBody());
	
	}
	
	@Test(description = "verify if create api is creating jobs and returns unique job number", groups = {"e2e", "smoke",
			"sanity"}, priority = 1)
	/* the drawback for this is that you cannot run this test as TestNG because it is 
	 * parameterized. So the creation of testng.xml file comes into the picture  
	*/
	public void test_create_api(ITestContext ctx) {
		
		List<Header> myHeader = new ArrayList<Header>();
		myHeader.add(new Header ("Content-Type", "application/json"));
		Object d = ctx.getAttribute("FDToken");
		System.out.println(d);
		myHeader.add( new Header("Authorization", (String) d));
		
				String message =  given()
							  .headers(new Headers(myHeader))
			 				.body(createJobRequestBody)
			 			.when()	
			 			.log().all()
							.post("/job/create")
						.then()
						.log().all()
							.assertThat()
							.statusCode(200)
							.and()
							.extract()
							.body()
							.jsonPath().
							getString("message");
							Assert.assertEquals(message, "Job created successfully. ");
		
	}
}
