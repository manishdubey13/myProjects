package com.mani.practice.random.annotations;

public class Demo
{
    @ManishSingleValue(value = "Akash")
    private String empname;
    @ManishSingleValue(value = "Dubey")
    private String emplastname;

    @Person(firstname = "Amisha",lastName = "Dubey")
    public Demo(String empname, String emplastname)
    {
        this.empname = empname;
        this.emplastname = emplastname;
    }

    public String getEmpname()
    {
        return empname;
    }

    @ManishSingleValue(value = "Rohit")
    public void setEmpname(String empname)
    {
        this.empname = empname;
    }

    public String getEmplastname()
    {
        return emplastname;
    }

    public void setEmplastname(String emplastname)
    {
        this.emplastname = emplastname;
    }
}
