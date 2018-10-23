package com.mani.practice.stream;

public class Person implements Comparable<Person >
{
    int age;
    String name;
    String lastname;




    public Person(int age, String name, String lastname)
    {
        this.age = age;
        this.name = name;
        this.lastname = lastname;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getLastname()
    {
        return lastname;
    }

    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (!name.equals(person.name)) return false;
        return lastname != null ? lastname.equals(person.lastname) : person.lastname == null;
    }

    @Override
    public int hashCode()
    {
        int result = age;
        result = 31 * result + name.hashCode();
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        return result;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }



    @Override
    public int compareTo(Person o)
    {
        return this.name.compareTo(o.name);
    }
}
