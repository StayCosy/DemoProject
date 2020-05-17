package com.example.generic;

public class GenericInterfaceImplC implements GenericInterface<Double> {
    private Double data = 1.0;

    @Override
    public Double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public static void main(String[] args) {
        GenericInterfaceImplC genericInterfaceImplC = new GenericInterfaceImplC();
        System.out.println(genericInterfaceImplC.getData());
        genericInterfaceImplC.setData(2.1111);
        System.out.println(genericInterfaceImplC.getData());
    }

}
