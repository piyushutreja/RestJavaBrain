package org.piyush.utreja.messenger;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profile {
	long id;
	String name;

	public Profile(long id, String name) {

		this.id = id;
		this.name = name;
	}
	
	public Profile() {

		
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
