package com.springdemo.mvc.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = LastNameConstraintValidator.class)
@Retention(RUNTIME)
@Target({ FIELD, METHOD })
public @interface LastName {
	
	//define default expected value
	
	//define default error message
	public String message() default "Must not have blank spaces";
	
	//define groups
	public Class<?>[] groups() default {};
	
	//define Payloads
	public Class<? extends Payload>[] payload() default {};
}
