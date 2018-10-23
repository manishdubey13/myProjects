package com.mani.practice;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.CONSTRUCTOR,ElementType.FIELD,ElementType.LOCAL_VARIABLE,ElementType.TYPE})
public @interface TestMe
{

    String value() default "Manish";
}
