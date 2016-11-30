package org.piyush.utreja.messenger;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

public class MessageService {

	public MessageService() {

		messages.put(1l, new Message((long) 1, "hello am piyush1", "piyush"));
		messages.put(2l, new Message(2, "hello am piyush1", "piyush"));
	}

	private Map<Long, Message> messages = DataBaseClass.getMessages();

	public List<Message> getAllMessages() {

		List<Message> list = new ArrayList<>(messages.values());

		return list;
	}

	public Message addMessage(Message message)

	{

		messages.put((long) (messages.size() + 1), message);
		return message;

	}

	public Message getMessage(Long id)

	{
		return messages.get(id);

	}

	public List<Message> getAllMessagesForYear(int year) {

		List<Message> messagesForYear = new ArrayList<>();
		Calendar cal = Calendar.getInstance();
		for (Message message : messages.values()) {
			cal.setTime(message.getCreated());
			if (cal.get(Calendar.YEAR) == year) {
				messagesForYear.add(message);

			}

		}
		return messagesForYear;

	}
	
	

	public List<Message> getAllMessagesPaginated(int start,int size) {
		
		  List<Message> list = new ArrayList<>(messages.values());
		  if(start >list.size()) return new ArrayList<>();
		  else
		  return list.subList(start, start+size);


	}

	public Message updateMessage(Message message)

	{
		if (message.getId() <= 0) {
			return null;

		} else {
			messages.put((long) (message.getId() + 1), message);
			return message;
		}
	}

	public Message removeMessage(Long id)

	{
		return messages.remove(id);

	}

}
