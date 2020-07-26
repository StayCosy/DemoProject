package com.example.ioc.beans;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.stream.Stream;

/**
 * Introspector内省用来获取Bean的
 */
public class IntrospectorTest {
    public static void main(String[] args) throws IntrospectionException {
        BeanInfo beanInfo = Introspector.getBeanInfo(BeanInfo.class);
        System.out.println("输出Bean Properties");
        Stream.of(beanInfo.getPropertyDescriptors()).forEach(propertyDescriptor -> System.out.println(propertyDescriptor));
        System.out.println("输出Bean Properties");
        Stream.of(beanInfo.getMethodDescriptors()).forEach(methodDescriptor -> System.out.println(methodDescriptor));
        String className = "com.example.ioc.beans.TestBeanB";
        //利用反射和内省实现bean创建和使用
        try {
            Class aClass = Class.forName(className);
            Object object = aClass.newInstance();
            BeanInfo beanInfo1 = Introspector.getBeanInfo(object.getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo1.getPropertyDescriptors();
            for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
                Method method = propertyDescriptor.getWriteMethod();
                String methodName = propertyDescriptor.getName();
                if ("beanName".equalsIgnoreCase(methodName)) {
                    method.invoke(object, "test bean a");
                }
                if ("beanCount".equalsIgnoreCase(methodName)) {
                    method.invoke(object, 1);
                }
            }
            for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
                System.out.println(propertyDescriptor.getReadMethod().invoke(object));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

class TestBeanB {
    private String beanName;

    private int beanCount;

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public int getBeanCount() {
        return beanCount;
    }

    public void setBeanCount(int beanCount) {
        this.beanCount = beanCount;
    }
}
