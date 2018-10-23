package com.mani.practice.stream.designpattern;

import java.util.function.Consumer;
//Builder pattern
public class CascadeMethodPattern
{

    public static void main(String[] args)
    {
        Mailer.send(mailer -> {
            mailer.to("manish@abc.com");
            mailer.subject("Hello");
            mailer.body("Hello there , Howz going?");
        });
    }
}

class Mailer{

    public static void send(Consumer<Mailer> mailerConsumer)
    {
       Mailer mailer = new Mailer();
       mailerConsumer.accept(mailer);
    }

    public Mailer to(String to)
    {
        System.out.println(" ******** " +to);
        return this;
    }

    public Mailer subject(String subject)
    {
        System.out.println(" ******** " +subject);
        return this;
    }
    public Mailer body(String body)
    {
        System.out.println(" ******** " +body);
        return this;
    }
}