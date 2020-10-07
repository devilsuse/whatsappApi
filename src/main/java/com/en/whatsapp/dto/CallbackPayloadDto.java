package com.en.whatsapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CallbackPayloadDto
{
	private String id;
	private String source;
	private String type;
	@JsonProperty("payload")
	private InnerPayload innerPayload;
	@JsonProperty("sender")
	private CallbackSenderDto callbackSenderDto;
	
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	public String getSource()
	{
		return source;
	}
	public void setSource(String source)
	{
		this.source = source;
	}
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	public InnerPayload getInnerPayload()
	{
		return innerPayload;
	}
	public void setInnerPayload(InnerPayload innerPayload)
	{
		this.innerPayload = innerPayload;
	}
	public CallbackSenderDto getCallbackSenderDto()
	{
		return callbackSenderDto;
	}
	public void setCallbackSenderDto(CallbackSenderDto callbackSenderDto)
	{
		this.callbackSenderDto = callbackSenderDto;
	}
}

class InnerPayload
{
	private String text;

	public String getText()
	{
		return text;
	}

	public void setText(String text)
	{
		this.text = text;
	}
}
