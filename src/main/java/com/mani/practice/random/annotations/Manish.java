package com.mani.practice.random.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Date;

@Retention(RetentionPolicy.SOURCE)
@Target(value = ElementType.LOCAL_VARIABLE)
public @interface Manish
{

    public String  greetings() default ( "Good Morning");
    public String  msgs() default "Plese rply back";
    //public Date today();
}

