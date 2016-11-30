package org.piyush.utreja.messenger;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProfileService {

	private Map<String, Profile> profiles = DataBaseClass.getProfiles();

	public ProfileService() {
		profiles.put("piyush", new Profile(1l, "Piyush"));
		
	}
	
	
	public List<Profile> getAllProfiles() {

		List<Profile> list = new ArrayList<>(profiles.values());

		return list;
	}

	
	public Profile addProfile(Profile profile)

	{
		profile.setId(profiles.size()+1);
		profiles.put(profile.getName(),profile);
		return profile;

	}

	public Profile getProfile(String name)

	{ 
		
		return profiles.get(name);

	}
	
	public Profile updateProfile(Profile profile)

	{
		if (profile.getId() <= 0) {
			return null;

		} else {
			profiles.put(profile.getName(), profile);
			return profile;
		}
	}
	
	public Profile removeProfile(String name)

	{
		return profiles.remove(name);

	}

}
