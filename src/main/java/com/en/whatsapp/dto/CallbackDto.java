package com.en.whatsapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CallbackDto
{
	private String app;
	private long timestamp;
	private Integer version;
	private String type;
	@JsonProperty("payload")
	private CallbackPayloadDto callbackPayloadDto;
	
	public String getTextMessage()
	{
		if(callbackPayloadDto==null)
			return null;
		
		InnerPayload innerPayload = callbackPayloadDto.getInnerPayload();
		if(innerPayload==null)
			return null;
		
		return innerPayload.getText();
	}
	
	public String getPhoneNumber()
	{
		if(callbackPayloadDto==null)
			return null;
		
		CallbackSenderDto senderDto = callbackPayloadDto.getCallbackSenderDto();
		if(senderDto==null)
			return null;
		
		return senderDto.getPhone();
	}
	
	public String getApp()
	{
		return app;
	}
	public void setApp(String app)
	{
		this.app = app;
	}
	public long getTimestamp()
	{
		return timestamp;
	}
	public void setTimestamp(long timestamp)
	{
		this.timestamp = timestamp;
	}
	public Integer getVersion()
	{
		return version;
	}
	public void setVersion(Integer version)
	{
		this.version = version;
	}
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	public CallbackPayloadDto getCallbackPayloadDto()
	{
		return callbackPayloadDto;
	}
	public void setCallbackPayloadDto(CallbackPayloadDto callbackPayloadDto)
	{
		this.callbackPayloadDto = callbackPayloadDto;
	}
}
