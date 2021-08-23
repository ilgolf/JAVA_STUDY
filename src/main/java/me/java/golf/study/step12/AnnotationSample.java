package me.java.golf.study.step12;

import com.google.auto.service.AutoService;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Set;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
public @interface AnnotationSample {
    String name() default "";
}

@SupportedAnnotationTypes("me.java.golf.study.step12.SampleAnnotation")
@AutoService(Processor.class)
class SampleProcessor extends AbstractProcessor {

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latestSupported();
    }

    @Override
    public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {
        for(TypeElement annotation : set) {
            for(Element element : roundEnvironment.getElementsAnnotatedWith(annotation)) {
                processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE,
                        "found SmapleAnnotaion : " + element);
            }
        }
        return true;
    }
}

