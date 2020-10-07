package com.en.whatsapp.service;

import static org.springframework.http.HttpStatus.OK;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.en.whatsapp.dto.CallbackDto;
import com.en.whatsapp.dto.ErrorApi;
import com.en.whatsapp.dto.GupshupRequest;
import com.en.whatsapp.dto.RequestMessageDto;
import com.en.whatsapp.dto.ResponseApi;
import com.en.whatsapp.exception.WhatsappException;
import com.en.whatsapp.exception.WhatsappExceptionFactory;

public class AppUtils
{
	private AppUtils()
	{
	}

	public static ResponseEntity<?> toResponseEntity(ResponseApi responseAPI)
	{
		return toResponseEntity(responseAPI, OK);
	}
	
	public static ResponseEntity<?> toResponseEntity(ResponseApi responseAPI, HttpStatus status)
	{
		return new ResponseEntity<ResponseApi>(responseAPI, status);
	}
	
	public static ResponseEntity<?> toResponseEntity(Throwable throwable)
	{
		ResponseApi responseAPI = toResponseApi(throwable);
		return new ResponseEntity<ResponseApi>(responseAPI, responseAPI.getErrorApi().getStatus());
	}
	
	public static ResponseApi toResponseApi(Throwable throwable)
	{
		WhatsappException cException = null;
		if (throwable instanceof WhatsappException)
			cException = (WhatsappException)throwable;
		else if(throwable != null && throwable.getCause() != null && throwable.getCause() instanceof WhatsappException)
			cException = (WhatsappException)throwable.getCause();
		else
			cException = WhatsappExceptionFactory.internalErrorOccured();
		
		return new ResponseApi(toErrorApi(cException));
	}

	private static ErrorApi toErrorApi(WhatsappException cException)
	{
		return new ErrorApi(cException);
	}
	
	public static GupshupRequest fromRequestMessage(RequestMessageDto requestMessageDto, String channel) {
		GupshupRequest.GupshupRequestBuilder builder = new GupshupRequest.GupshupRequestBuilder();
		builder.apikey(requestMessageDto.getApikey());
		return builder.build();
	}
	
	public static RequestMessageDto fromRequestMessage(CallbackDto callbackDto) {
		RequestMessageDto requestMessageDto = new RequestMessageDto();
		requestMessageDto.setApikey(apikey);
		requestMessageDto.setDestination(destination);
		requestMessageDto.setMessage(message);
		requestMessageDto.setSource(source);
		
		return builder.build();
	}
	
}
