package com.example.ioc.beans;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PropertyDescriptorTest {
    public static void main(String[] args){
        TestBeanA testBeanA = new TestBeanA();
        try {
            PropertyDescriptor propertyDescriptor = new PropertyDescriptor("beanName", TestBeanA.class);
            Method method = propertyDescriptor.getWriteMethod();
            method.invoke(testBeanA,"test aa");
            System.out.println(testBeanA.getBeanName());
        } catch (IntrospectionException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

class TestBeanA{
    private String beanName;

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }
}
