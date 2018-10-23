import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Spliterators;
import java.util.stream.Stream;

public class SyntextTest
{
    ArrayList list = new ArrayList();

    public void iterateMe()
    {
        list.forEach(System.out::println);
    }
    public void iterateMeToo()
    {
        list.forEach(null);
    }

 /*   public void default hi()
{
default method allowed only in interface

}*/
    public static void main(String[] args)
    {
        new SyntextTest().iterateMe();
        //new SyntextTest().iterateMeToo();

        LocalDateTime localDateTime;
        LocalDate localDate;
        Optional optional;
        Spliterators spliterators;

        Runnable r  = ()->{
            System.out.println("Hello");
        };

        Thread t = new Thread(r);

        t.start();


    }

    Stream stream;
}
