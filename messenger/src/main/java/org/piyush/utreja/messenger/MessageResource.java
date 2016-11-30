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

@Path("messages")
public class MessageResource {

	MessageService messages = new MessageService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages() {

		return messages.getAllMessages();

	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message addMessage(Message message) {

	return messages.addMessage(message);

	}
	
	
	@PUT
	@Path("/{messageId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message updateMessage(@PathParam("messageId") Long messageId,Message message)  {
    
	message.setId(messageId);
	return messages.updateMessage(message);

	}
	
	
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{messageId}")
	public Message delete(@PathParam("messageId") Long messageId) {

		//return messages.getAllMessages();
		return messages.removeMessage(messageId);
		
		//return "hi"+messageId;

	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{messageId}")
	public Message getMessage(@PathParam("messageId") Long messageId) {

		//return messages.getAllMessages();
		return messages.getMessage(messageId);
		
		//return "hi"+messageId;

	}
}
