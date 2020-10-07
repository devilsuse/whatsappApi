package com.en.whatsapp.app;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//@Configuration
public class AppDataSource
{
	//@Primary
	//@Bean(name = whatsappJdbcTemplate")
	/*
	 * public NamedParameterJdbcTemplate productCatalogueJdbcTemplate() { DataSource
	 * ds = productCatalogueDataSource(); return new NamedParameterJdbcTemplate(ds);
	 * // return new NamedParameterJdbcTemplate(productCatalogueDataSource1()); }
	 */

	/*
	 * @Primary
	 * 
	 * @Bean
	 * 
	 * @ConfigurationProperties(prefix = "ds.pc") public DataSource
	 * productCatalogueDataSource() { return DataSourceBuilder.create().build(); }
	 */
}
