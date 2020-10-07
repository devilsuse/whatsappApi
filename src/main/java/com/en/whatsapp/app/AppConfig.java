package com.en.whatsapp.app;

import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

@Configuration
public class AppConfig
{
	@Bean
	public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer()
	{
		return new PropertySourcesPlaceholderConfigurer();
	}

	@Bean
	public ConversionServiceFactoryBean conversionServiceFactoryBean()
	{
		return new ConversionServiceFactoryBean();
	}
	
	@Bean
	public ObjectMapper objectMapper()
	{
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		//Customize serialization
		mapper.configure(SerializationFeature.CLOSE_CLOSEABLE, true);
		mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
		mapper.configure(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS, true);
		mapper.configure(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS, false);
		mapper.configure(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED, false);
		//Customize de-serialization
		mapper.configure(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT, true);
		mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
		mapper.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, false);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		mapper.getSerializerProvider().setNullKeySerializer(new MapperNullKeySerializer());
		return mapper;
	}
	
	class MapperNullKeySerializer extends StdSerializer<Object>
	{
		private static final long serialVersionUID = 1L;

		public MapperNullKeySerializer()
		{
			this(null);
		}
		
		public MapperNullKeySerializer(Class<Object> t)
		{
			super(t);
		}
		
		@Override
		public void serialize(Object value, JsonGenerator gen, SerializerProvider provider)
				throws IOException
		{
			gen.writeFieldName("");
		}
	}
}
