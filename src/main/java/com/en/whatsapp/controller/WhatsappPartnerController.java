package com.en.whatsapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.en.whatsapp.dto.CallbackDto;
import com.en.whatsapp.dto.RequestMessageDto;
import com.en.whatsapp.dto.ResponseApi;
import com.en.whatsapp.service.WhatsappPartnerService;

@RestController
public class WhatsappPartnerController
{
	@Autowired
	private WhatsappPartnerService partnerService;

	@PostMapping("api/v1/message")
	public ResponseApi sendMessage(@RequestBody RequestMessageDto requestMessageDto)
	{
		partnerService.sendMessage(requestMessageDto);
		return null;
	}

	@PostMapping("api/v1/callback")
	public ResponseApi callback(@RequestBody CallbackDto callbackDto)
	{
		String message = callbackDto.getTextMessage();
		if(StringUtils.isEmpty(message))
		{
			System.out.println("message is empty");
			return null;
		}
		String phoneNumber = callbackDto.getPhoneNumber();
		if(StringUtils.isEmpty(phoneNumber))
		{
			System.out.println("phoneNumber is empty");
			return null;
		}

		//sendTextMessageService.sendMessage("Thanks for your feedback. Your rating : " + message + " has been recorded.", phoneNumber);
		RequestMessageDto requestMessageDto = new RequestMessageDto();
		partnerService.sendMessage(requestMessageDto);
		return null;
	}
}
