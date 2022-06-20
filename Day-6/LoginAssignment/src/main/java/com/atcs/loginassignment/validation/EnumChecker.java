package com.atcs.loginassignment.validation;

import com.atcs.loginassignment.entity.Country;


public class EnumChecker {

	public static Country findByName(String name) {
		Country result = null;
	    for (Country c : Country.values()) {
	        if (c.name().equalsIgnoreCase(name)) {
	            result = c;
	            break;
	        }
	    }
	    return result;
	}
	
}
