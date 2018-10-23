package com.mani.tricky;

public class InnerClassTest
{
    int p ;

    public InnerClassTest(int p)
    {
        this.p = p;
    }
    class InnerClass
    {
        //static is not allowed in inner class
        //static int y =5;
        int x = 5;

        public InnerClass(int x)
        {
            this.x = x;
            this.x = x+p;

        }

        public int getX()
        {
            return x;
        }
    }

    static class  StaticInnerClass
    {
         static int q=6;
         int r =1;

        public StaticInnerClass(int r)
        {
            this.r = r ;
        }

        int getQ(int q)
        {
           // return q=q+q;
            return  r+q;
        }
    }

    public static void main(String[] args)
    {
        InnerClassTest innerClassTest = new InnerClassTest(7);
        InnerClass innerClass = innerClassTest.new InnerClass(5);

        System.out.println(innerClass.getX());

        StaticInnerClass staticInnerClass = new StaticInnerClass(6);
        System.out.println(staticInnerClass.getQ(5));

         int tmp =staticInnerClass.r ;
         int tmp2 = StaticInnerClass.q;

         int tmp3= innerClass.x;

         TestAnonymusClass testAnonymusClass = new TestAnonymusClass()
         {
             @Override
             public String sayOla(String name)
             {
                 return "Ola " + name;
             }
         };


        System.out.println(testAnonymusClass.sayOla("Akash"));
    }

}
