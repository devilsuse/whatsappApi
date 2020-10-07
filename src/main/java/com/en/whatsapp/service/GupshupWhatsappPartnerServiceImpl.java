package com.en.whatsapp.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.en.whatsapp.dto.RequestMessageDto;
import com.en.whatsapp.dto.ResponseApi;

@Service
public class GupshupWhatsappPartnerServiceImpl implements WhatsappPartnerService
{
	@Value("channel")
	private String channel;
	private String url = "https://api.gupshup.io/sm/api/v1/msg";
	
	@Override
	public ResponseApi handleCallback()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseApi sendMessage(RequestMessageDto requestMessageDto)
	{
		AppUtils.fromRequestMessage(requestMessageDto, channel);
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		headers.add("apikey", "480a945f4ece437ac3c89331ae99b624");

		MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
		map.add("apikey", "480a945f4ece437ac3c89331ae99b624");
		map.add("source",requestMessageDto.getSource());
		map.add("destination",requestMessageDto.getDestination());
		map.add("message",requestMessageDto.getMessage());
		map.add("channel","whatsapp");

		HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(map, headers);

		ResponseEntity<?> response =
		    restTemplate.exchange(url,
		                          HttpMethod.POST,
		                          entity,
		                          Object.class);
		//restTemplate.postForEntity(url, request, responseType, uriVariables);
		System.out.println(response.hasBody() + ":" + response.getStatusCodeValue() 
		+ ":" + response.getBody().toString());
		return null;
	}

	@Override
	public ResponseApi registerRequest()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
