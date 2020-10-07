package com.en.whatsapp.dto;

public class CallbackSenderDto
{
	private String phone;
	private String name;
	private String country_code;
	private String dial_code;

	public String getPhone()
	{
		return phone;
	}
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getCountry_code()
	{
		return country_code;
	}
	public void setCountry_code(String country_code)
	{
		this.country_code = country_code;
	}
	public String getDial_code()
	{
		return dial_code;
	}
	public void setDial_code(String dial_code)
	{
		this.dial_code = dial_code;
	}
}
