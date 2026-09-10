package stepDefinition;

import java.io.IOException;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    //if addplace is failed then delete place will not execute
    //if place id is null then delete place will not execute
    //so we will write a code in before hook which will give us place id if it is null
    //this will run before the scenario tagged with @DeletePlace in feature file
	@Before("@DeletePlace")
	public void beforeScenario() throws IOException
	{		//execute this code only when place id is null
		//write a code that will give you place id

		StepDefinition m =new StepDefinition();
		if(StepDefinition.place_id==null)
		{

		m.add_Place_Payload_with("Shetty", "French", "Asia");
		m.user_calls_with_http_request("AddPlaceAPI", "POST");
		m.verify_place_Id_created_maps_to_using("Shetty", "getPlaceAPI");
		}



	}

}
