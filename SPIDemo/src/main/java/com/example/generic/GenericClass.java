package com.example.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 范型测试类
 *
 * @param <T>
 */
public class GenericClass<T> {
    private T metaData;

    public T getMetaData() {
        return metaData;
    }

    public void setMetaData(T metaData) {
        this.metaData = metaData;
    }

    public static void main(String[] args) {
        GenericClass<String> genericClass = new GenericClass<>();
        genericClass.setMetaData("Test");
        System.out.println(genericClass.getMetaData());
        System.out.println(genericClass.getMetaData().getClass());
        System.out.println(genericClass.getMetaData().getClass().getName());

        GenericClass<Integer> genericClass1 = new GenericClass<>();
        genericClass1.setMetaData(1);
        System.out.println(genericClass1.getMetaData());
        System.out.println(genericClass1.getMetaData().getClass());
        System.out.println(genericClass1.getMetaData().getClass().getName());

        List<GenericClass> list = new ArrayList<>();
        list.add(genericClass);
        list.add(genericClass1);

        for (GenericClass genericClassTemp : list) {
            if (genericClassTemp.getMetaData() instanceof String) {
                System.out.println("it's String " + genericClassTemp.getMetaData());
            }
            if (genericClassTemp.getMetaData() instanceof Integer) {
                System.out.println("it's Integer " + genericClassTemp.getMetaData());
            }
        }
    }
}
