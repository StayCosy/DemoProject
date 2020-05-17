package com.example.generic;

public class GenericInterfaceImplA<T> implements GenericInterface {
    private T data;

    @Override
    public Object getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static void main(String[] args) {
        GenericInterfaceImplA<String> genericInterfaceImplA = new GenericInterfaceImplA<>();
        genericInterfaceImplA.setData("A is string");
        System.out.println(genericInterfaceImplA.getData());
        GenericInterfaceImplA<Integer> genericInterfaceImplA1 = new GenericInterfaceImplA<>();
        genericInterfaceImplA1.setData(11);
        System.out.println(genericInterfaceImplA1.getData());
    }
}
