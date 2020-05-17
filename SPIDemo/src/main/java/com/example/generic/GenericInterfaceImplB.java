package com.example.generic;

public class GenericInterfaceImplB implements GenericInterface<String> {

    private String data = "it's string b";

    @Override
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public static void main(String[] args) {
        GenericInterfaceImplB genericInterfaceImplB = new GenericInterfaceImplB();
        System.out.println(genericInterfaceImplB.getData());
        genericInterfaceImplB.setData("it's string b too");
        System.out.println(genericInterfaceImplB.getData());
    }
}
