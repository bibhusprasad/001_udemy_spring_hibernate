package com.udemy.ioc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.udemy.ioc.impl.BaseballCoachImpl;

@Configuration
public class SprigContext {
	
	@Bean
	public BaseballCoachImpl getBaseballCoach() {
		BaseballCoachImpl baseballCoach = new BaseballCoachImpl();
		baseballCoach.setNameList(getNameList());
		baseballCoach.setNameSet(getNameSet());
		baseballCoach.setNameMap(getNameMap());
		baseballCoach.setNameProperties(getNameProperties());
		baseballCoach.setNameArray(getNameArrays());
		
		return baseballCoach;
	}
	
	@Bean
	public List<String> getNameList() {
		List<String> names = Arrays.asList("INDIA", "PAK", "USA", "USA");
		return names;
	}
	
	@Bean
	public Set<String> getNameSet() {
		Set<String> names = new HashSet<>();
		names.add("INDIA");
		names.add("PAK");
		names.add("USA");
		names.add("USA");
		return names;
	}
	
	@Bean
	public Map<String, String> getNameMap() {
		Map<String, String> names = new HashMap<>();
		names.put("1", "INDIA");
		names.put("2", "USA");
		names.put("3", "PAK");
		names.put("4", "USA");
		return names;
	}
	
	@Bean
	public Properties getNameProperties() {
		Properties names = new Properties();
		names.setProperty("1", "INDIA");
		names.setProperty("2", "USA");
		names.setProperty("3", "PAK");
		return names;
	}
	
	@Bean
	public String[] getNameArrays() {
		String[] names = {"INDIA", "PAK", "USA", "USA"};
		return names;
	}

}
