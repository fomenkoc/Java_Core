package com.gmail.fomenkoc.lessons.lesson21;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Fielder {
	String params() default "private annotation";
}
