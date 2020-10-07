package com.en.whatsapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.en.whatsapp.dto.RegisteredApp;

@Service
public class RegisteredAppServiceImpl implements RegisteredAppService
{
	@Value("${apikey}")
	private String apikey;
	@Value("${channel}")
	private String channel;
	@Value("${source}")
	private String source;
	/**
	 * stubbing here but should eb fetched from any service or 
	 * if this app only does app registration then fetch from its database
	 */
	@Override
	public RegisteredApp getRegisteredApp(String app)
	{
		RegisteredApp registeredApp = new RegisteredApp();
		List<String> list = new ArrayList();
		list.add(channel);
		registeredApp.setAllowedChannels(list);
		registeredApp.setApikey(apikey);
		registeredApp.setSource(source);
		return registeredApp;
	}
	
}
