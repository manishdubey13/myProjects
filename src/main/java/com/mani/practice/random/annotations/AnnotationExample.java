package com.mani.practice.random.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationExample

{

    public static void main(String[] args) throws NoSuchMethodException
    {

        AnnotationExample example = new AnnotationExample();

        Class<Demo> myClass  = Demo.class;

        String className= myClass.getName();

        Method[] methods = myClass.getMethods();

        for (Method method : methods)
        {
           if (method.getName().startsWith("set") && method.getAnnotations().length>0 )
           {
                Annotation[] annotations=  method.getDeclaredAnnotations();

                for (Annotation annotation : annotations )
                {

                    for (Annotation annotation1 : annotation.annotationType().getDeclaredAnnotations())
                    {
                        System.out.println(annotation1.annotationType());
                    }
                    System.out.println(annotation.annotationType().getName());
                }
           }
        }


    }

}
