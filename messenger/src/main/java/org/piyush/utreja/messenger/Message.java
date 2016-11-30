package org.piyush.utreja.messenger;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Message {

	public Message(long i, String messages, String author) {
		super();
		this.id = i;
		this.messages = messages;
		this.created = new Date();
		this.author = author;
	}

	public Message() {
		
	}

	
	private Long id;
	private String messages;
	private Date created;
	private String author;

	public Long getId() {
		return id;
	}

	public void setId(Long messageId) {
		this.id = messageId;
	}

	public String getMessages() {
		return messages;
	}

	public void setMessages(String messages) {
		this.messages = messages;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		long result = 1;
		result = prime * result + id;
		return (int) result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Message other = (Message) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
}
