package resources;
//enum is special class in java which has collection of constants or  methods
public enum APIResources {
	
	AddPlaceAPI("/maps/api/place/add/json"),
	getPlaceAPI("/maps/api/place/get/json"),
	deletePlaceAPI("/maps/api/place/delete/json");
	private String resource; //this will hold the value of resource which is passed in the constructor of enum
	
	APIResources(String resource)
	{
		this.resource=resource;
	} //assigning the value of resource which is passed in the constructor of enum to the variable resource which is declared above
	
	public String getResource()
	{
		return resource; //this will return the value of resource which is passed in the constructor of enum
	}
	

}
