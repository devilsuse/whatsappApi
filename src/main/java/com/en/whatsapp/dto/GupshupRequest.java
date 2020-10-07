package com.en.whatsapp.dto;

public class GupshupRequest
{
	private String apikey;
	private String source;
	private String destination;
	private String message;
	private String channel;
	
	private GupshupRequest()
	{
	}
	
	public String getApikey()
	{
		return apikey;
	}
	
	private void setApikey(String apikey)
	{
		this.apikey = apikey;
	}
	
	public String getSource()
	{
		return source;
	}
	private void setSource(String source)
	{
		this.source = source;
	}
	public String getDestination()
	{
		return destination;
	}
	private void setDestination(String destination)
	{
		this.destination = destination;
	}
	public String getMessage()
	{
		return message;
	}
	private void setMessage(String message)
	{
		this.message = message;
	}

	public String getChannel()
	{
		return channel;
	}

	private void setChannel(String channel)
	{
		this.channel = channel;
	}
	
	public static class GupshupRequestBuilder
	{
		private String apikey;
		private String source;
		private String destination;
		private String message;
		private String channel;
		
		public GupshupRequestBuilder()
		{
		}
		
		public GupshupRequest build()
		{
			GupshupRequest gupshupRequest = new GupshupRequest();
			gupshupRequest.setApikey(apikey);
			gupshupRequest.setSource(source);
			gupshupRequest.setDestination(destination);
			gupshupRequest.setMessage(message);
			gupshupRequest.setChannel(channel);
			return gupshupRequest;
		}
		
		public GupshupRequestBuilder apikey(String apikey)
		{
			this.apikey = apikey;
			return this;
		}
		
		public GupshupRequestBuilder source(String source)
		{
			this.source = source;
			return this;
		}
		public GupshupRequestBuilder destination(String destination)
		{
			this.destination = destination;
			return this;
		}
		public GupshupRequestBuilder message(String message)
		{
			this.message = message;
			return this;
		}
		public GupshupRequestBuilder channel(String channel)
		{
			this.channel = channel;
			return this;
		}
	}
}
