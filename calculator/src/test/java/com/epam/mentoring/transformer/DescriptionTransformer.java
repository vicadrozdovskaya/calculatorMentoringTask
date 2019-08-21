package com.epam.mentoring.transformer;

import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class DescriptionTransformer implements IAnnotationTransformer {
    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {

        if (testMethod != null && "divisionOfTwoNumbersTest".equals(testMethod.getName())) {
            annotation.setDescription("description from transformer");
        }
    }
}
