package com.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class LastNameConstraintValidator implements ConstraintValidator<LastName, String>{
	
	@Override
	public void initialize(LastName arg0) {
		
	}
	
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {
		
		if( theCode != null) {
			for (int i=0 ;i<theCode.length();i++) {
				if (theCode.charAt(i) == ' ')
					return false;
			}
			return true;
		}
		else
		return true;
	}

}
