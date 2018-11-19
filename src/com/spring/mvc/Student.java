package com.spring.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	private String favouriteLanguage;
	private String[] operatingSystems;
	private LinkedHashMap<String, String> favouriteLanguageOptions;

	public Student() {
		super();
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("BRA", "BRAZIL");
		countryOptions.put("IND", "INDIA");
		countryOptions.put("RUS", "RUSSIA");

		favouriteLanguageOptions = new LinkedHashMap<>();
		favouriteLanguageOptions.put("Java", "Java");
		favouriteLanguageOptions.put("Ruby", "Ruby");
		favouriteLanguageOptions.put("C#", "c#");
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}

	public LinkedHashMap<String, String> getFavouriteLanguageOptions() {
		return favouriteLanguageOptions;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

}
