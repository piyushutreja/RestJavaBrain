package org.piyush.utreja.messenger;

import java.util.HashMap;
import java.util.Map;

public class DataBaseClass {

	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<String, Profile> profiles = new HashMap<>();

	public static Map<Long, Message> getMessages() {
		return messages;
	}

	public static void setMessages(Map<Long, Message> messages) {
		DataBaseClass.messages = messages;
	}

	public static Map<String, Profile> getProfiles() {
		return profiles;
	}

	public static void setProfiles(Map<String, Profile> profiles) {
		DataBaseClass.profiles = profiles;
	}

}
