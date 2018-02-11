package com.RestAPI.testREST;



import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/RESTAPI")
public class RestAPIResource 
{
	@GET
	
	@Produces(MediaType.APPLICATION_XML)
	
	public RESTAPI getRESTAPI()
	{
		System.out.println("The output..");
		RESTAPI ap = new RESTAPI();
		ap.setCity("Desmoines");
		ap.setStreetCode(4);
		
		return ap;
		
	}
	

}
