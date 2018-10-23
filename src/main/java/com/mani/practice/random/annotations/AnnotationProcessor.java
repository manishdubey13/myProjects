package com.mani.practice.random.annotations;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.lang.annotation.ElementType;
import java.util.Set;

@SupportedAnnotationTypes("com.mani.practice.random.annotations.Complexity")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class AnnotationProcessor extends AbstractProcessor
{
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv)
    {
        for (Element element: roundEnv.getElementsAnnotatedWith(Complexity.class))
        {
            Complexity complexity = element.getAnnotation(Complexity.class);
            String msg = "Annotation Found in " + element.getSimpleName()+ " "
                        +" with complexity " + complexity.value();

            processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE,msg,element);
            processingEnv.getElementUtils();
            processingEnv.getFiler();
            processingEnv.getTypeUtils();
            processingEnv.getLocale();
            processingEnv.getOptions();
        }
        return true;
    }
}
