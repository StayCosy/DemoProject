package com.example.ioc.beans;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class BeanTest {
    public static void main(String[] args) throws IntrospectionException {
        BeanInfo beanInfo = Introspector.getBeanInfo(BeanInfo.class);
        System.out.println("输出Bean Properties");
        Stream.of(beanInfo.getPropertyDescriptors()).forEach(propertyDescriptor -> System.out.println(propertyDescriptor));
        System.out.println("输出Bean Properties");
        Stream.of(beanInfo.getMethodDescriptors()).forEach(methodDescriptor -> System.out.println(methodDescriptor));
    }
}
