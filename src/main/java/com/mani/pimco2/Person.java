package com.mani.pimco2;

public class Person
{
   private String name;
   private long salary;

    public Person(String name, long salary)
    {
        this.name = name;
        this.salary = salary;
    }


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public long getSalary()
    {
        return salary;
    }

    public void setSalary(long salary)
    {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (salary != person.salary) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode()
    {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (int) (salary ^ (salary >>> 32));
        return result;
    }
}
