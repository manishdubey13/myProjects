package com.mani.practice.random;

public class CheckSwitch
{
    enum Day
    {
        MONDAY("monday"),
        TUESDAY("tuesday"),
        WEDNESDAY("wednesday"),
        THURDAY("thursday"),
        FIRDAY("friday"),
        SATARDAY("satarday"),
        SUNDAY("sunday");

        Day(String day)
        {
            this.day = day;
        }

        String day;

        public String isWorkday(Enum Day)
        {
            if(Day.ordinal()==5 || Day.ordinal()==6)
            {
                return "Ween-End";
            }
            return "Week Day";
        }
    }


    public static void main(String[] args)
    {
        Day d = Day.FIRDAY;



        String name="";

        String NAME="AKASH";

        switch (d)
        {
            case FIRDAY:
            case MONDAY:
            case THURDAY:
            case WEDNESDAY:
            case TUESDAY:
                System.out.println("its working day -->" + d.isWorkday(d));
                System.out.println("its working day -->" + d.day);
                System.out.println("its working day -->" + d.name());
                System.out.println("its working day -->" + d.ordinal());
                System.out.println("its working day -->" + d.getDeclaringClass());
                break;
            case SUNDAY:
            case SATARDAY:
                System.out.println("it's week end");
                break;
        }

        
         Day[] days=  Day.values();

         Day day= Day.valueOf("SUNDAY");

        System.out.println("Day is " + day.isWorkday(day));

          for (Day d1 : days)
          {
              System.out.println(d1.name() + " "  + " " + d1.day + " "
                      + d1.ordinal() + "   "
                      + d1.isWorkday(d1));
          }


        switch (NAME)
        {
            case "MANISH":
                  name="manish";
                  break;
            case "AKASH" :
                  name="akash";
                  break;
        }

        System.out.println("Name is " + name);

    }

    
}
