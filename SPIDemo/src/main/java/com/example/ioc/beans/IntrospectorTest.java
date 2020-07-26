package com.example.ioc.beans;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.util.stream.Stream;

/**
 *Introspector内省用来获取Bean的
 *
 */
public class IntrospectorTest {
    public static void main(String[] args) throws IntrospectionException {
        BeanInfo beanInfo = Introspector.getBeanInfo(BeanInfo.class);
        System.out.println("输出Bean Properties");
        Stream.of(beanInfo.getPropertyDescriptors()).forEach(propertyDescriptor -> System.out.println(propertyDescriptor));
        System.out.println("输出Bean Properties");
        Stream.of(beanInfo.getMethodDescriptors()).forEach(methodDescriptor -> System.out.println(methodDescriptor));
    }
}
