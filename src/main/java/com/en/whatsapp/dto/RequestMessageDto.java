package com.en.whatsapp.dto;

import java.util.Objects;

public class RequestMessageDto
{
	private String apikey;
	private String source;
	private String destination;
	private String message;
	
	public String getApikey()
	{
		return apikey;
	}
	
	public void setApikey(String apikey)
	{
		this.apikey = apikey;
	}
	
	public String getSource()
	{
		return source;
	}
	public void setSource(String source)
	{
		this.source = source;
	}
	public String getDestination()
	{
		return destination;
	}
	public void setDestination(String destination)
	{
		this.destination = destination;
	}
	public String getMessage()
	{
		return message;
	}
	public void setMessage(String message)
	{
		this.message = message;
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(apikey, destination, message, source);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RequestMessageDto other = (RequestMessageDto) obj;
		return Objects.equals(apikey, other.apikey) && Objects.equals(destination, other.destination)
				&& Objects.equals(message, other.message) && Objects.equals(source, other.source);
	}
	
}
