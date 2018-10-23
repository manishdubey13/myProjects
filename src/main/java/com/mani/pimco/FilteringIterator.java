/*
package com.mani.pimco;


import java.util.Iterator;

public final class FilteringIterator<E> implements Iterator<E>
{
    private final IObjectTest<E> predicate;
    private final Iterator<E> iterator;

    private boolean hasNext;
    private E next;


    public FilteringIterator(final Iterator<E> iterator,final IObjectTest<E> predicate)
    {
        this.predicate = predicate;
        this.iterator = iterator;

        customNext();

    }
    @Override
    public boolean hasNext()
    {
         return  hasNext;
    }

    @Override
    public void remove()
    {
        throw new UnsupportedOperationException("Operation not Permitted");
    }

    @Override
    public E next()
    {
        E tmpNext = this.next;
        customNext();
        return   tmpNext;
    }

    private void  customNext()
    {
        while (this.iterator.hasNext())
        {
            E tmpNext  =iterator.next();
            if (predicate==null|| predicate.test(tmpNext))
            {
                this.hasNext=true;
                this.next=tmpNext;
                return;
            }
        }
        this.hasNext=false;
        this.next=null;

    }


}
*/
