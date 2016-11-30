package org.piyush.utreja.messenger;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("profiles")
public class ProfileResource {
	
	private ProfileService profiles = new ProfileService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Profile> getProfiles() {

		return profiles.getAllProfiles();

	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Profile addProfile(Profile profile) {

	return profiles.addProfile(profile);

	}
	
	@PUT
	@Path("/{name}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Profile updateProfile(@PathParam("name") String name,Profile profile)  {
    
	//profile.setName(name);
	return profiles.updateProfile(profile);

	}
	
	
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{name}")
	public Profile delete(@PathParam("name") String name) {

		//return messages.getAllMessages();
		return profiles.removeProfile(name);
		
		//return "hi"+messageId;

	}
	

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{name}")
	public Profile getProfile(@PathParam("name") String name) {

		//return messages.getAllMessages();
		return profiles.getProfile(name);
		
		//return "hi"+messageId;

	}
	

}
