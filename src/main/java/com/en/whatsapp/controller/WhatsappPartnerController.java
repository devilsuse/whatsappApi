package com.en.whatsapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.en.whatsapp.dto.RequestMessageDto;
import com.en.whatsapp.dto.ResponseApi;
import com.en.whatsapp.service.WhatsappPartnerService;

@RestController
public class WhatsappPartnerController
{
	@Autowired
	private WhatsappPartnerService partnerService;
	// private ;
	
	@PostMapping("api/v1/message")
	public ResponseApi sendMessage(@RequestBody RequestMessageDto requestMessageDto)
	{
		System.out.println("aaaaaaaaaaaaaaaaa");
		partnerService.sendMessage(requestMessageDto);
		return null;
	}
	
}
