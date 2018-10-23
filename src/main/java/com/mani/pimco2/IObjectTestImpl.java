package com.mani.pimco2;

public class IObjectTestImpl<E> implements IObjectTest<E>
{
    private E e;

    public IObjectTestImpl(E e)
    {
        this.e = e;
    }

    @Override
    public boolean test(E e)
    {
        return this.e.equals(e);
    }
}
