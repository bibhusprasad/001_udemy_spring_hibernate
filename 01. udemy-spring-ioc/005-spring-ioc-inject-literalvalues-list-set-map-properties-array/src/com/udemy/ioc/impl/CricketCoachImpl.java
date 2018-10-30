package com.udemy.ioc.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.udemy.ioc.Coach;

public class CricketCoachImpl implements Coach {

	List<String> addressList;
	Set<String> addressSet;
	Map<String, String> addressMap;
	Properties addressProp;
	String[] addressArray = new String[5];

	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}

	public void setAddressSet(Set<String> addressSet) {
		this.addressSet = addressSet;
	}

	public void setAddressMap(Map<String, String> addressMap) {
		this.addressMap = addressMap;
	}

	public void setAddressProp(Properties addressProp) {
		this.addressProp = addressProp;
	}

	public void setAddressArray(String[] addressArray) {
		this.addressArray = addressArray;
	}
	
	@Override
	public String getDailyWorkout() {
		return "bowl minimum 5 over.";
	}
	
	@Override
	public String getTeamDetails() {
		return "CricketCoach [addressList=" + addressList + ", addressSet=" + addressSet + ", addressMap=" + addressMap
				+ ", addressProp=" + addressProp + ", addressArray=" + Arrays.toString(addressArray) + "]";
	}

}
