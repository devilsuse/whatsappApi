package com.en.whatsapp.exception;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

import org.springframework.http.HttpStatus;

import com.en.whatsapp.constant.AppConstant;

public class WhatsappExceptionFactory
{
	public static WhatsappException from(HttpStatus status, String code, String property, String message)
	{
		if (status == null)
			return new WhatsappException(INTERNAL_SERVER_ERROR, code, property, message);
		return new WhatsappException(status, code, property, message);
	}
	
	public static WhatsappException internalErrorOccured()
	{
		return from(INTERNAL_SERVER_ERROR, "000", null, "An internal server error has occured. "
				+ "Please try again later or contact support if issue persists.");
	}
	
	public static WhatsappException invalidPropertyValue(String property, String message)
	{
		return from(BAD_REQUEST, "001", property, message);
	}
	
	public static WhatsappException sellerOperationFailed(String code, String property, String message)
	{
		return from(INTERNAL_SERVER_ERROR, code, property, message);
	}
}
