package com.hms.customException;

import com.hms.doctor.Doctorn;

public class DoctorResourceException extends Exception{
	public DoctorResourceException(String msg)
	{
		super(msg);
		System.out.println("Try again with your credintials");
		Doctorn d=new Doctorn();
		d.login();
	}
	
}
