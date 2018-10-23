package com.mani.practice.random.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value={ElementType.CONSTRUCTOR})
public @interface Person
{
    String firstname();
    String lastName();
}
