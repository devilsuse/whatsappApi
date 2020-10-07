package com.en.whatsapp.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseApi implements Serializable
{
	private static final long serialVersionUID = 1L;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("error")
	private ErrorApi errorApi;
	private String message;

	public ResponseApi()
	{
	}
	
	public ResponseApi(ErrorApi errorApi)
	{
		this.errorApi = errorApi;
	}
	
	public ErrorApi getErrorApi()
	{
		return errorApi;
	}

	public void setErrorApi(ErrorApi errorApi)
	{
		this.errorApi = errorApi;
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
