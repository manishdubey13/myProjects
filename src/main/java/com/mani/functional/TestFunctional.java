package com.mani.functional;
@FunctionalInterface
public interface TestFunctional
{
    public String apply();
   // public String apply(String name);
}

interface TestFunctional2 extends TestFunctional
{

}