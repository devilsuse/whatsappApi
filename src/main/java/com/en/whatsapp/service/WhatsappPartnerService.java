package com.en.whatsapp.service;

import org.springframework.web.bind.annotation.RequestBody;

import com.en.whatsapp.dto.RequestMessageDto;
import com.en.whatsapp.dto.ResponseApi;

public interface WhatsappPartnerService
{
	//callback endpoint handler
	ResponseApi handleCallback();
	
	
	ResponseApi sendMessage(@RequestBody RequestMessageDto requestMessageDto);
	
	ResponseApi registerRequest();
}
