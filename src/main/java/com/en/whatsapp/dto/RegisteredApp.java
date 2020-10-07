package com.en.whatsapp.dto;

import java.util.List;

/**
 * 
 * Projects/Apps who wishes to use our messaging service
 * These will be registered(part of on-boarding) and as a
 * part of registration will provide these info.
 * 
 * @author NanoUser
 *
 */
public class RegisteredApp
{
	private String apikey;
	private String source;
	private List<String> allowedChannels;
	public String getApikey()
	{
		return apikey;
	}
	public void setApikey(String apikey)
	{
		this.apikey = apikey;
	}
	public String getSource()
	{
		return source;
	}
	public void setSource(String source)
	{
		this.source = source;
	}
	public List<String> getAllowedChannels()
	{
		return allowedChannels;
	}
	public void setAllowedChannels(List<String> allowedChannels)
	{
		this.allowedChannels = allowedChannels;
	}
}
