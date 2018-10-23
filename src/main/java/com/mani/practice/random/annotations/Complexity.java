package com.mani.practice.random.annotations;

public @interface Complexity
{
    enum ComplexityLevel{

        SIMPLE,
        MEDIUM,
        COMPLEX,
        VERY_COMPLEX
    }

    ComplexityLevel value() default ComplexityLevel.SIMPLE;
}
