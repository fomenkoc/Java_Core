package com.gmail.fomenkoc.lessons.lesson21;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface StudentSocial {
	 String value() default "make it better";
}
