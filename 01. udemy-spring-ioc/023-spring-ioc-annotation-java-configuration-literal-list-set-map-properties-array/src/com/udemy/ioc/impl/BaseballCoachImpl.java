package com.udemy.ioc.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.udemy.ioc.Coach;

public class BaseballCoachImpl implements Coach{
	
	
	private List<String> nameList;
	private Set<String> nameSet;
	private Map<String, String> nameMap;
	private Properties nameProperties;
	private String[] nameArray;

	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}

	public void setNameSet(Set<String> nameSet) {
		this.nameSet = nameSet;
	}

	public void setNameMap(Map<String, String> nameMap) {
		this.nameMap = nameMap;
	}

	public void setNameProperties(Properties nameProperties) {
		this.nameProperties = nameProperties;
	}

	public void setNameArray(String[] nameArray) {
		this.nameArray = nameArray;
	}

	@Override
	public String getDailyWorkout() {
		return "daily 30 min bollowing practice";
	}

	@Override
	public String getTeamDetails() {
		return "BaseballCoach [nameList=" + nameList + ", nameSet=" + nameSet + ", nameMap=" + nameMap
				+ ", nameProperties=" + nameProperties + ", nameArray=" + Arrays.toString(nameArray) + "]";
	}
	
	

}
