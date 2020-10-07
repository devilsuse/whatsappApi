package com.en.whatsapp.dto;

import org.springframework.http.HttpStatus;

import com.en.whatsapp.exception.WhatsappException;

public class ErrorApi
{
	private HttpStatus status;
	private String code;
	private String property;
	private String message;
	
	public ErrorApi(WhatsappException cException)
	{
		this.status = cException.getStatus();
		this.code = cException.getCode();
		this.property = cException.getProperty();
		this.message = cException.getMessage();
	}
	
	public HttpStatus getStatus()
	{
		return status;
	}

	public void setStatus(HttpStatus status)
	{
		this.status = status;
	}

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public String getProperty()
	{
		return property;
	}

	public void setProperty(String property)
	{
		this.property = property;
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}
}
