package com.mani.optional;

import java.util.Optional;

public class Outer
{
    Nested nested ;

    public Nested getNested()
    {
        return nested;
    }

    public void setNested(Nested nested)
    {
        this.nested = nested;
    }

    public static void main(String[] args)
    {
        Outer outer = new Outer();
//        Nested nested = new Nested();
//        Inner inner = new Inner();
//        nested.setInner(inner);
//        outer.setNested(nested);



        Optional.of(outer).map(Outer::getNested).map(Nested::getInner).map(Inner::getYo)
                .ifPresent(System.out::println);
    }
}

class Nested
{
    Inner inner;

    public void setInner(Inner inner)
    {
        this.inner = inner;
    }

    public Inner getInner()
    {
        return inner;
    }

}

class Inner
{
    String yo="Hi!!";

    public String getYo()
    {
        return yo;
    }

}
